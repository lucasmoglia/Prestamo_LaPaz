/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prestamo;

import prestamo.Datos.ClienteHelper;
import prestamo.Datos.TipoDocumentoHelper;
import prestamo.Formularios.MainCliente;
import prestamo.Modelo.Cliente;
import prestamo.Modelo.TipoDocumento;

/**
 *
 * @author Cesar Acarapi
 */
public class Prestamo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainCliente.main(args);
        /*ClienteHelper ch = new ClienteHelper();
        Cliente c = new Cliente();
        c.setTipoDocumento(new TipoDocumento());
        ch.SaveCliente(c);
        Cliente c = new Cliente();
        c.setApellido("Garcia");
        c.setNombre("Alberto");
        c.setNacionalidad("Boliviana");
        
        ch.Save(c);*/
        /*TipoDocumentoHelper tdh = new TipoDocumentoHelper();
        //TipoDocumento td = (TipoDocumento)tdh.GetById(1, TipoDocumento.class);
        TipoDocumento td = new TipoDocumento();
        
        td.setDescripcion("IE");
        tdh.Save(td);*/
       
        
    }
}
