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
        String entidad = getNombreEntidad();
        
        if(persona.getApellido() == null || persona.getApellido().isEmpty()){
            super.isValid = false;
            super.message += "- Ingrese Apellido del "+entidad+" \n";
        }if(persona.getNombre() == null || persona.getNombre().isEmpty()){
            super.isValid = false;
            super.message += "- Ingrese Nombre del " + entidad +" \n";
        }if(persona.getNumeroDocumento() == null || persona.getNumeroDocumento().equals(0)){
            super.isValid = false;
            super.message += "- Ingrese un número de documento para el "+entidad+" \n";
        }if(persona.getTipoDocumento() == null){
            super.isValid = false;
            super.message += "- Ingrese un tipo de documento para el " + entidad + "\n";
        }      
    }    

    private String getNombreEntidad() {
        //case()
        String[]nombreClase = persona.getClass().getTypeName().split("\\.");               
        return nombreClase[nombreClase.length-1]; 
    }
}
