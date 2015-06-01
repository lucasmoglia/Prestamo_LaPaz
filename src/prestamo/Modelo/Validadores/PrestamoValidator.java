/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo.Modelo.Validadores;

import prestamo.Modelo.Prestamo;

/**
 *
 * @author cacarapi
 */
public class PrestamoValidator extends CalculoCuotaValidator {    
    
    public PrestamoValidator(Prestamo prestamo){
        super(prestamo);
        ValidateObject();
    }

    private void ValidateObject() {
        if(prestamo.getCliente() == null){
            super.isValid = false;
            super.message += "- Elija un cliente \n";
        } if (prestamo.getCuotas().isEmpty()){
            super.isValid = false;
            super.message += "- Se debe generar por lo menos una cuota \n";
        }             
    }    
}
