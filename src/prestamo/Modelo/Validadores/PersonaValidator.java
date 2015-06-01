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
        }   
    }    

    private String getNombreEntidad() {
        //case()
        String[]nombreTipoDeClase = persona.getClass().getTypeName().split("\\.");   
        String nombreClaseAux = nombreTipoDeClase[nombreTipoDeClase.length-1];
        String[]nombreClase = nombreClaseAux.split("_");
        return nombreClase[0]; 
    }
}
