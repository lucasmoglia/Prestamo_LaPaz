/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prestamo.Colaboradores;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import prestamo.Modelo.Cuota;

/**
 *
 * @author cacarapi
 */
public class PrestamoClienteColaborador {
    
    private prestamo.Math math;
    private List<Cuota> listaCuotas = new ArrayList<>();
    private DefaultTableModel model = new DefaultTableModel();
    
    public PrestamoClienteColaborador(BigDecimal i, BigDecimal v, BigDecimal n){
        math = new prestamo.Math(i, v, n);
    }
    
    public PrestamoClienteColaborador(){
        math = new prestamo.Math();
    }
    
    public List<Cuota> generateCuotas(){
        List<Cuota> cuotas = new ArrayList<>();
        int cantidadCuotas = Integer.parseInt(getMath().getPeriodos().toString()) ;
        for (int i = 0; i < cantidadCuotas; i++) {
            cuotas.add(generateCuota(i+1));
        }
        return cuotas;
    }
    
    //
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
        return cuota;
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
        listaCuotas = listaCuotas.isEmpty() ? getListaCuotas() : listaCuotas;
        definirColumnas(model);
        for(Cuota c : listaCuotas){
            model.addRow(objectToVector(c));
        }
        
        return model;
    }
    
    private Vector objectToVector(Cuota c){
        Vector v = new Vector();
        v.add(c.getNumeroCuota());
        v.add(c.getSaldoInicial());
        v.add(c.getMonto());
        v.add(c.getAmortizacion());
        v.add(c.getInteresPeriodo());        
        v.add(c.getTotalAmortizado());
        
        return v;
    } 

    private void definirColumnas(DefaultTableModel model) {
        model.addColumn("Nro");
        model.addColumn("Saldo inicial");
        model.addColumn("Cuota");
        model.addColumn("Reduccion de capital");
        model.addColumn("Interes ");
        model.addColumn("Total Amortizado");
    }
}
