/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prestamo.Modelo.Validadores;

import java.math.BigDecimal;
import prestamo.Modelo.Prestamo;

/**
 *
 * @author Elizabeth
 */
public class CalculoCuotaValidator extends ObjectValidator{
    protected Prestamo prestamo;
    
    public CalculoCuotaValidator(Prestamo prestamo){
        this.prestamo = prestamo;
        ValidateObject();        
    }

    private void ValidateObject() {
        if(prestamo.getInteres() == null || prestamo.getInteres() == BigDecimal.ZERO){
            super.isValid = false;
            super.message += "- Ingrese la taza de interes \n";
        } if (prestamo.getMontoTotal() == null || prestamo.getMontoTotal() == BigDecimal.ZERO){
            super.isValid = false;
            super.message += "- Ingrese monto del prestamo \n";
        }
    }    
}
