/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo.Modelo.Validadores;

import prestamo.Modelo.Cliente;
/**
 *
 * @author acarapi
 */
public final class ClienteValidator extends PersonaValidator{
    private final Cliente cliente;
    
    public ClienteValidator(Cliente cliente) {
        super(cliente);
        this.cliente = cliente;    
        ValidateObjectCliente();
    }
    
    public void ValidateObjectCliente(){
        if(cliente.getNumeroDocumento() == null || cliente.getNumeroDocumento().equals(0)){
            super.isValid = false;
            super.message += "- Ingrese un número de documento para el Cliente \n";
        }if(cliente.getTipoDocumento() == null){
            super.isValid = false;
            super.message += "- Ingrese un tipo de documento para el Cliente \n";
        }   
    }
}
