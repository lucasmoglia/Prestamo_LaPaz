/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo.Colaboradores;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import prestamo.Datos.ClienteHelper;
import prestamo.Formularios.ComboItem;
import prestamo.MathSimple;
import prestamo.Modelo.Cliente;
import prestamo.Modelo.Cuota;

/**
 *
 * @author acarapi01
 */
public class PrestamoSimpleColaborador {
    
    private prestamo.MathSimple mathSimple;
    private final ClienteHelper clienteHelper = new ClienteHelper();
    private List<Cuota> listaCuotas = new ArrayList<>();
    private DefaultTableModel model = new DefaultTableModel();
    private final BigDecimal cero = new BigDecimal("0");
    private BigDecimal totalCuota; 
    private BigDecimal totalInteres;
    
    public PrestamoSimpleColaborador(){
        mathSimple = new MathSimple();
    }
    
    public void reiniciarCalculo(){
        mathSimple = new MathSimple();
        listaCuotas = new ArrayList<>();
        model = new DefaultTableModel();
    }
    
    /**
     * @return the mathSimple
     */
    public prestamo.MathSimple getMathSimple() {
        return mathSimple;
    }
    
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
        
        //model.addRow(getTotales());
        
        return model;
    }
    
    
    
    private Vector objectToVector(Cuota c){
        Vector v = new Vector();
        v.add(c.getNumeroCuota());      
        v.add(c.getMonto());       
        v.add(c.FechaCuotaString());
        
        return v;
    }
    
    private void definirColumnas(DefaultTableModel model) {
        model.addColumn("Nro");        
        model.addColumn("Cuota");        
        model.addColumn("Fecha a Pagar");
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
    
    public Cliente getClienteById(String key) {
        try{
            return (Cliente)clienteHelper.GetById(Integer.parseInt(key), Cliente.class);
        }catch (NumberFormatException e){
            return null;
        }
    }

    private List<Cuota> getListaCuotas() {
        int cantidadCuotas = mathSimple.getPeriodos();
        boolean ultimaCuota = false;
        for (int i = 0; i < cantidadCuotas; i++) {
            if(cantidadCuotas == i+1) {ultimaCuota = true;}
            listaCuotas.add(generateCuota(i+1, ultimaCuota));
        }
        return listaCuotas;
    }
    
    private Cuota generateCuota(int numeroCuota, boolean ultimaCuota){
        Cuota cuota = new Cuota();
        cuota.setNumeroCuota(numeroCuota);
        cuota.setInteresPeriodo(mathSimple.getInteresMensual()); 
        if(!ultimaCuota)
            cuota.setMonto(mathSimple.getInteresMensual());
        else
            cuota.setMonto(mathSimple.getCapital().add(mathSimple.getInteresMensual()));        
        
        return cuota;
    }
}
