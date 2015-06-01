/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo.Modelo.Validadores;

import prestamo.Modelo.Garante;

/**
 *
 * @author cacarapi
 */
public class GaranteValidator extends PersonaValidator{
    
    private final Garante garante;
    public GaranteValidator(Garante persona) {
        super(persona);
        garante = persona;
    }   
}
