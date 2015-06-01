/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prestamo.Modelo.Validadores;

import prestamo.Modelo.Conocido;

/**
 *
 * @author Elizabeth
 */
public class ConocidoValidator extends PersonaValidator{
    
    private final Conocido conocido;
            
    public ConocidoValidator(Conocido persona) {
        super(persona);
        this.conocido = persona;
        ValidateObjectConocido();
    }
    
    public void ValidateObjectConocido(){
        String telefono = conocido.getTelefono().replaceAll("-", "").trim();
        if(telefono == null || telefono.isEmpty()){
            super.isValid = false;
            super.message += "- Ingrese un número de teléfono para el Conocido \n";
        }
    }
}
