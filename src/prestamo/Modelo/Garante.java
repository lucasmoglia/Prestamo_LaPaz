/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prestamo.Modelo;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author cacarapi
 */
@Entity
@Table(name="garante"
    ,schema="prestamo"
)
public class Garante extends Persona {

    public Garante() {
    }

    public Garante(String apellido, String nombre, Integer numeroDocumento, TipoDocumento tipoDocumento, Direccion direccion) {
        super(apellido, nombre, numeroDocumento, tipoDocumento, direccion);
    }
    
}
