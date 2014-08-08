/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prestamo.Modelo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author cacarapi
 */
@Entity
@Table(name = "conocido"
      ,schema = "prestamo")
public class Conocido extends Persona {

    private Cliente cliente;
    
    public Conocido() {
    }

    public Conocido(String apellido, String nombre, Integer numeroDocumento, TipoDocumento tipoDocumento, Direccion direccion) {
        super(apellido, nombre, numeroDocumento, tipoDocumento, direccion);
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_cliente")               
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
