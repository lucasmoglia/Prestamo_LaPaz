/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo.Colaboradores;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import prestamo.Datos.ClienteHelper;
import prestamo.Modelo.Cliente;
import prestamo.Modelo.Cuota;


/**
 *
 * @author cacarapi
 */
public class AdministracionClienteColaborador {
    
    ClienteHelper clienteHelper = new ClienteHelper();
    List<Cliente> listaClientes = new ArrayList<>();
    private DefaultTableModel model = new DefaultTableModel();
    
    public AdministracionClienteColaborador(){}
    
        public DefaultTableModel getModel() {
        listaClientes = listaClientes.isEmpty() ? getListaClientes() : listaClientes;
        definirColumnas(model);
        for(Cliente c : listaClientes){
            model.addRow(objectToVector(c));
        }
        
        return model;
    }

    private List<Cliente> getListaClientes() {
        try{
            return clienteHelper.GeAllClientes();
        }catch(Exception ex){
            System.err.println(ex);
            return null;
        }
    }

    private void definirColumnas(DefaultTableModel model) {
        model.addColumn("Code");
        model.addColumn("Cliente");
        model.addColumn("Nacionalidad");
        model.addColumn("Teléfono");
        model.addColumn("Numero Documento ");
    }

    private Vector objectToVector(Cliente c) {
        Vector v = new Vector();
        v.add("A definir");
        v.add(getFullName(c));
        v.add(c.getNacionalidad());
        /*v.add(c.getTe;)
        v.add(c.getInteresPeriodo());        
        v.add(c.getTotalAmortizado());*/
        
        return v;
    }
    
    private String getFullName(Cliente c) {
        return c != null ? c.getApellido() +", "+ c.getNombre(): "";
    }
}
