/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prestamo.Colaboradores;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import prestamo.Datos.ClienteHelper;
import prestamo.Datos.PrestamoHelper;
import prestamo.Formularios.ComboItem;
import prestamo.Modelo.Cliente;
import prestamo.Modelo.Cuota;
import prestamo.Modelo.Prestamo;

/**
 *
 * @author cacarapi
 */
public class PrestamoClienteColaborador {
    
    private prestamo.Math math;
    private List<Cuota> listaCuotas = new ArrayList<>();
    private DefaultTableModel model = new DefaultTableModel();
    private final ClienteHelper clienteHelper = new ClienteHelper();
    private final PrestamoHelper prestamoHelper = new PrestamoHelper();
    private final BigDecimal cero = new BigDecimal("0");  // Constante 0
    private BigDecimal totalCuota; 
    private BigDecimal totalInteres;
    
    public PrestamoClienteColaborador(BigDecimal i, BigDecimal v, BigDecimal n){
        math = new prestamo.Math(i, v, n);
    }
    
    public PrestamoClienteColaborador(){
        math = new prestamo.Math();
    }
    
    public void reiniciarCalculo(){
        math = new prestamo.Math();
        listaCuotas = new ArrayList<>();
        model = new DefaultTableModel();
    }
    public List<Cuota> generateCuotas(){
        List<Cuota> cuotas = new ArrayList<>();
        int cantidadCuotas = Integer.parseInt(getMath().getPeriodos().toString()) ;
        for (int i = 0; i < cantidadCuotas; i++) {
            cuotas.add(generateCuota(i+1));
        }
        return cuotas;
    }    

    /**
     * @return the math
     */
    public prestamo.Math getMath() {
        return math;
    }    

    /**
     * @return the listaCuotas
     */
    public List<Cuota> getListaCuotas() {
        int cantidadCuotas = Integer.parseInt(getMath().getPeriodos().toString()) ;
        for (int i = 0; i < cantidadCuotas; i++) {
            listaCuotas.add(generateCuota(i+1));
        }
        return listaCuotas;
    }

    /**
     * @return the model
     */
    public DefaultTableModel getModel() {
        totalCuota = cero;
        totalInteres = cero;
        listaCuotas = listaCuotas.isEmpty() ? getListaCuotas() : listaCuotas;
        definirColumnas(model);
        for(Cuota c : listaCuotas){
            model.addRow(objectToVector(c));
            totalCuota = totalCuota.add(c.getMonto());
            totalInteres = totalInteres.add(c.getInteresPeriodo());
        }
        
        model.addRow(getTotales());
        
        return model;
    }
    
    public DefaultTableModel getModelForCuotas(Set<Cuota> cuotas){        
        totalCuota = cero;
        totalInteres = cero;
        definirColumnas(model);
        List<Cuota> cuotasList = getListaCuotasArrayList(cuotas);
        Collections.sort( cuotasList);
        
        for(Cuota c : cuotasList){
            model.addRow(objectToVector(c));
            totalCuota = totalCuota.add(c.getMonto());
            totalInteres = totalInteres.add(c.getInteresPeriodo());
        }
        
        model.addRow(getTotales());
        return model;
    }
    
    public List<ComboItem> getClientes(){
        List<ComboItem> comboItemList = new ArrayList<>();
        try{
            comboItemList.add(new ComboItem(String.valueOf(-1), "Seleccione un Cliente"));
            for(Cliente c : clienteHelper.GeAllClientes()){
                 comboItemList.add(new ComboItem(String.valueOf(c.getId()), getFullName(c)));
             }
            return comboItemList;
        }catch(Exception ex){
            return new ArrayList<>();
        }
    }
    
    public boolean Save(Prestamo prestamo) {
        try{
            prestamoHelper.SavePrestamo(prestamo);
            return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }

    public Cliente getClienteById(String key) {
        try{
            return (Cliente)clienteHelper.GetById(Integer.parseInt(key), Cliente.class);
        }catch (NumberFormatException e){
            return null;
        }
    }
    
    public Prestamo getPrestamoById(int idPrestamo){
        try{
            return (Prestamo)prestamoHelper.GetById(idPrestamo, Prestamo.class);
        }catch(Exception e){
            return null;
        }
    }

    private Cuota generateCuota(int numeroCuota){
        Cuota cuota = new Cuota();
        BigDecimal periodo = new BigDecimal(numeroCuota);
        getMath().GetInteresPorcentaje(); // se setea el interes porcentual
        cuota.setMonto(getMath().GetCuota());
        cuota.setNumeroCuota(numeroCuota);
        
        if(numeroCuota == 1){
            cuota.setInteresPeriodo(getMath().GetInteresPrimerPeriodo());
            cuota.setAmortizacion(getMath().GetPrimeraCuotaAmortizada());
            cuota.setTotalAmortizado(getMath().GetPrimeraCuotaAmortizada());
            cuota.setSaldoInicial(getMath().getValorActual());
        }else if(numeroCuota > 1){
            cuota.setInteresPeriodo(getMath().GetInteresPeriodosIntermedios(periodo));
            cuota.setAmortizacion(getMath().GetCuotaAmortizadaPeriodo(periodo));
            cuota.setTotalAmortizado(getMath().GetTotalAmortizado(periodo));
            cuota.setSaldoInicial(getMath().GetSaldoInicialPeriodo(periodo));
        }
        cuota.setFechaCuota(CalcularFechaCuota(numeroCuota));
        return cuota;
    }
    
    private Vector objectToVector(Cuota c){
        Vector v = new Vector();
        v.add(c.getNumeroCuota());
        v.add(c.getSaldoInicial());
        v.add(c.getMonto());
        v.add(c.getAmortizacion());
        v.add(c.getInteresPeriodo());        
        v.add(c.getTotalAmortizado());        
        v.add(c.FechaCuotaString());
        
        return v;
    } 

    private void definirColumnas(DefaultTableModel model) {
        model.addColumn("Nro");
        model.addColumn("Saldo inicial");
        model.addColumn("Cuota");
        model.addColumn("Reduccion de capital");
        model.addColumn("Interes ");
        model.addColumn("Total Amortizado");
        model.addColumn("Fecha a Pagar");
    }

    public String getFullName(Cliente c) {
        return c != null ? c.getApellido() +", "+ c.getNombre(): "";
    }

    public Set<Cuota> getListaCuotasSet() {
        Set list = new HashSet();
        for (Cuota c : listaCuotas) {
            list.add(c);
        }
        return list;
    }
    
    private ArrayList getListaCuotasArrayList(Set<Cuota> cuotas){
        ArrayList list = new ArrayList();
        for(Cuota c : cuotas){
            list.add(c);
        }
        return list;
    }

    private Vector getTotales() {
        Vector v = new Vector();
        v.add("TOTAL");
        v.add("");
        v.add(totalCuota);
        v.add("");
        v.add(totalInteres);        
        v.add("");
        
        return v;
    }

    public int getMaxNumeroCuota(Set<Cuota> cuotas) {
       Cuota c = Collections.max(cuotas);
       return c.getNumeroCuota();
    }

    private Date CalcularFechaCuota(int numeroCuota) {
        int mesSiguiente = numeroCuota -1;
        Calendar calendario = new GregorianCalendar();
        calendario.add(Calendar.MONTH, mesSiguiente);
        Date fecha = calendario.getTime();
        return fecha;
    }
}
