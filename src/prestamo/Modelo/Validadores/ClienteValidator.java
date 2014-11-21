/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo.Modelo.Validadores;

import prestamo.Modelo.Cliente;
import prestamo.Modelo.Persona;

/**
 *
 * @author cacarapi
 */
public class ClienteValidator extends PersonaValidator{
    private final Cliente cliente;
    
    public ClienteValidator(Cliente cliente) {
        super(cliente);
        this.cliente = cliente;        
    }    
}
