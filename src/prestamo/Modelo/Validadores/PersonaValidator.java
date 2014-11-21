/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo.Modelo.Validadores;

import prestamo.Modelo.Persona;

/**
 *
 * @author acarapi
 */
public class PersonaValidator extends ObjectValidator {
    private final Persona persona;
    public PersonaValidator(Persona persona){
        this.persona = persona;
        ValidateObject();
    }
    
    public void ValidateObject() {
        if(persona.getApellido().equals("")){
            super.isValid = false;
            super.message += "- Ingrese Apellido \n";
        }if(persona.getNombre().equals("")){
            super.isValid = false;
            super.message += "- Ingrese Nombre \n";
        }if(persona.getNumeroDocumento().equals(0)){
            super.isValid = false;
            super.message += "- Ingrese un número de documento \n";
        }if(persona.getTipoDocumento() == null){
            super.isValid = false;
            super.message += "- Ingrese un tipo de documento \n";
        }      
    }    
}
