/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prestamo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

/**
 *
 * @author cacarapi
 */
public final class Math {
    private final BigDecimal uno = new BigDecimal("1");  // Constante 1 
    private final BigDecimal cero = new BigDecimal("0");  // Constante 1 
    
    private BigDecimal i;  // Taza de interes
    private BigDecimal v;  // Capital tomado en prestamo
    private BigDecimal n;  // Cantidad de Cuotas
    
    private BigDecimal c = cero;  // Cuota mensual 
    private BigDecimal t1 = cero; // Primera Cuota de amortización
    private BigDecimal tp = cero; // Cuota de amortización en Periodo indicado
    private BigDecimal tap = cero; // Total Amortizado en Período indicado
    private BigDecimal ipp = cero; // Intereses cpbrados primer período
    private BigDecimal ip = cero; // Interes expresado en porcentaje
    
    
    public Math(BigDecimal i, BigDecimal v, BigDecimal n){
        this.i = i;
        this.v = v;
        this.n = n;
        this.ip = GetInteresPorcentaje();
    }
    /**
     * @return the i
     */
    public BigDecimal getInteresTaza() {
        return i;
    }

    /**
     * @param i the i to set
     */
    public void setInteresTaza(BigDecimal i) {
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
        c = c.equals(cero) ? GetCuota() : c;
        t1 = c.subtract(v.multiply(ip));
        return t1;
    }
    
    public BigDecimal GetCuotaAmortizadaPeriodo(BigDecimal p){
        t1 = t1.equals(cero) ? GetPrimeraCuotaAmortizada() : t1;
        tp = t1.multiply((uno.add(ip)).pow(Integer.parseInt(p.subtract(uno).toString())));
        return tp;
    }
    
    public BigDecimal GetTotalAmortizado(BigDecimal p){
        t1 = t1.equals(cero) ? GetPrimeraCuotaAmortizada() : t1;
        tap = t1.multiply((uno.add(ip).pow(Integer.parseInt(p.toString()))).subtract(uno)).divide(ip,3,BigDecimal.ROUND_HALF_UP);
        return tap;
    }

    public BigDecimal GetCuota() {
        c = (v.multiply((uno.add(ip).pow(Integer.parseInt(n.toString()))).multiply(ip))).divide((uno.add(ip).pow(Integer.parseInt(n.toString()))).subtract(uno), 3, BigDecimal.ROUND_HALF_UP);
        return c;
    }
    
    public BigDecimal GetInteresPrimerPeriodo(){
        ipp = v.multiply(ip);
        return ipp;
    }
    
    public BigDecimal GetInteresPorcentaje(){
        ip = i.divide(new BigDecimal("100"), 3, BigDecimal.ROUND_HALF_UP).divide(new BigDecimal("12"), 4, BigDecimal.ROUND_HALF_UP);
        return ip;
    }
}
