/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prestamo.Datos;

import java.util.ArrayList;
import java.util.List;
import prestamo.Modelo.Cliente;

/**
 *
 * @author cacarapi
 */
public class ClienteHelper extends Helper{

    private List<Cliente> clientes;  
    
    public ClienteHelper() {
        clientes = new ArrayList<>();   
    }
    
    public List<Cliente> GetClienteById(int id){
        String hql = "from Cliente c where c.id = "+id;
        clientes = super.GetDataList(hql);
        return clientes;        
    }
}
