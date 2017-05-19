/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo.Colaboradores;

import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import prestamo.Datos.ClienteHelper;
import prestamo.Datos.PrestamoHelper;
import prestamo.Modelo.Cliente;
import prestamo.Modelo.Prestamo;

/**
 *
 * @author Cesar
 */
public class ConsultaPrestamoColaborador {
    private final PrestamoHelper prestamoHelper;
    private final ClienteHelper clienteHelper;
    private DefaultListModel model = new DefaultListModel();
    private DefaultTableModel modelTable = new DefaultTableModel();
    
    public ConsultaPrestamoColaborador(){
        prestamoHelper = new PrestamoHelper();
        clienteHelper = new ClienteHelper();
        
    }
    
    public List<Cliente> GetClienteBySearch(String search){
        return clienteHelper.GetClienteBySearch(search);
    }
    
    public DefaultListModel getModelClientes(List<Cliente> clientes) {
        model = new DefaultListModel();
        for(Cliente c : clientes ){
            model.addElement(getNombreCompleto(c));
        }
        
        return model;
    }
    
    public void setModelLstOtrosContactos(Integer selectedIndexConocido, String item) {
        model.setElementAt(item, selectedIndexConocido);
    } 
    
    public String getNombreCompleto(Cliente c) {
        String resultado = String.format("%s, %s [%s]", c.getApellido(), c.getNombre(), c.getNumeroDocumento());
        return resultado.trim();
    }

    public Cliente GetClienteById(Integer selectedIndexCliente) {
        return (Cliente)clienteHelper.GetById(selectedIndexCliente, Cliente.class);
    }
    
    private Set<Prestamo> GetPrestamosByIdCliente(int idCliente){
        return prestamoHelper.GetPrestamosByClienteId(idCliente);        
    }

    public TableModel GetModelPrestamos(Integer idClienteSeleccionado) {
        modelTable = new DefaultTableModel();
        Set<Prestamo> prestamos = GetPrestamosByIdCliente(idClienteSeleccionado);
        definirColumnas(modelTable);
        if(!prestamos.isEmpty()){
            for(Prestamo p : prestamos){
                modelTable.addRow(objectToVector(p));
            }
        }
        return modelTable;
    }
    
    private void definirColumnas(DefaultTableModel model) {
        model.addColumn("ID");
        model.addColumn("Monto");
        model.addColumn("Cantidad de Cuotas");
        model.addColumn("Fecha");
    }
    
    private Vector objectToVector(Prestamo p){
        Vector v = new Vector();
        v.add(p.getId());
        v.add(p.getMontoTotal());
        v.add(p.getCuotas().size());
        v.add(p.getFechaPrestamo());
        
        return v;
    }
    
    public void SetDefaultModel(){
        modelTable = new DefaultTableModel();
    }
}
