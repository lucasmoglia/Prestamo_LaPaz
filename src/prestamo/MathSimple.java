/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import java.math.BigDecimal;

/**
 *
 * @author acarapi01
 */
public class MathSimple {
    private final BigDecimal uno = new BigDecimal("1");  // Constante 1 
    private final BigDecimal cero = new BigDecimal("0");  // Constante 0
    
    private BigDecimal i = cero;  // Taza de interes mensual
    private BigDecimal v = cero;  // Capital tomado en prestamo
    private int p = 0; // cantidad de cuotas;
    
    private BigDecimal in;   // Interes Mensual
    
    public MathSimple(){}
    
    public MathSimple(BigDecimal i, BigDecimal v, int p){
        this.i = i;
        this.v = v; 
        this.p = p;
    }
    
    public BigDecimal getInteresMensual(){
        in = getCapital().multiply(getInteres().divide(new BigDecimal("100")));
        return in;
    }

    /**
     * @return the Interes Expresado en porcentaje
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
    public BigDecimal getCapital() {
        return v;
    }

    /**
     * @param v the v to set
     */
    public void setCapital(BigDecimal v) {
        this.v = v;
    }

    /**
     * @return the p
     */
    public int getPeriodos() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setPeriodos(int p) {
        this.p = p;
    }
    
}
