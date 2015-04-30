/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo.Modelo.Validadores;

import prestamo.Modelo.Direccion;

/**
 *
 * @author cacarapi
 */
public class DireccionValidator extends ObjectValidator {    
    private final Direccion direccion;
    public DireccionValidator(Direccion direccion){
        this.direccion = direccion;
        ValidObject();
    }

    private void ValidObject() {
        if(direccion.getCalle() == null || direccion.getCalle().isEmpty()){
            super.isValid = false;
            super.message += "- Ingrese una calle \n";
        } if(direccion.getNumero() == null || direccion.getNumero() == 0){
            super.isValid = false;
            super.message += "- Ingrese un número de casa o departamento. \n";
        }        
    }       
}
