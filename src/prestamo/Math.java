/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prestamo;

import java.math.BigDecimal;

/**
 *
 * @author cacarapi
 */
public class Math {
    private final BigDecimal uno = new BigDecimal("1");  // Constante 1 
    private final BigDecimal cero = new BigDecimal("0");  // Constante 1 
    
    private BigDecimal i;  // Taza de interes
    private BigDecimal v;  // Capital tomado en prestamo
    private BigDecimal n;  // Cantidad de Cuotas
    
    private BigDecimal c = cero;  // Cuota mensual 
    private BigDecimal t1 = cero; // Primera Cuota de amortización
    private BigDecimal tp = cero; // Cuota de amortización en Periodo indicado
    private BigDecimal tap = cero; // Total Amortizado en Período indicado
    
    
    public Math(BigDecimal i, BigDecimal v, BigDecimal n){
        this.i = i;
        this.v = v;
        this.n = n;
    }
    /**
     * @return the i
     */
    public BigDecimal getInteres() {
        return i;
    }

    /**
     * @param i the i to set
     */
    public void setInteres(BigDecimal i) {
        this.i = i;
    }

    /**
     * @return the v
     */
    public BigDecimal getValorActual() {
        return v;
    }

    /**
     * @param v the v to set
     */
    public void setValorActual(BigDecimal v) {
        this.v = v;
    }

    /**
     * @return the c
     */
    public BigDecimal getCuota() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setCuota(BigDecimal c) {
        this.c = c;
    }

    /**
     * @return the n
     */
    public BigDecimal getPeriodos() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setPeriodos(BigDecimal n) {
        this.n = n;

    }
    
    public BigDecimal GetPrimeraCuotaAmortizada(){
        t1 = c.subtract(v.multiply(i));
        return t1;
    }
    
    public BigDecimal GetCuotaAmortizadaPeriodo(BigDecimal p){
        t1 = t1.equals(cero) ? GetPrimeraCuotaAmortizada() : t1;
        tp = t1.multiply((uno.add(i)).pow(Integer.parseInt(p.subtract(uno).toString())));
        return tp;
    }
    
    /*public BigDecimal GetTotalAmortizado(BigDecimal p){
        //tap = t1.multiply(uno)
    }*/
}
