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
 * @author cacarapi
 */
public class PrestamoValidator extends ObjectValidator {
    private final Prestamo prestamo;
    
    public PrestamoValidator(Prestamo prestamo){
        this.prestamo = prestamo;
        ValidateObject();
    }

    private void ValidateObject() {
        if(prestamo.getCliente() == null){
            super.isValid = false;
            super.message += "- Elija un cliente \n";
        } if(prestamo.getInteres() == null || prestamo.getInteres() == BigDecimal.ZERO){
            super.isValid = false;
            super.message += "- Ingrese la taza de interes \n";
        } if (prestamo.getMontoTotal() == null || prestamo.getMontoTotal() == BigDecimal.ZERO){
            super.isValid = false;
            super.message += "- Ingrese monto del prestamo \n";
        } if (prestamo.getCuotas().isEmpty()){
            super.isValid = false;
            super.message += "- Se debe generar por lo menos una cuota \n";
        } 
            
    }    
}
