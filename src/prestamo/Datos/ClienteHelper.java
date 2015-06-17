/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prestamo.Datos;

import java.util.ArrayList;
import java.util.List;
import prestamo.Modelo.Cliente;
import prestamo.Modelo.Conocido;
import prestamo.Modelo.Direccion;
import prestamo.Modelo.Garante;

/**
 *
 * @author cacarapi
 */
public class ClienteHelper extends Helper{

    private List<Cliente> clientes;  
    
    public ClienteHelper() {
        clientes = new ArrayList<>();   
    }
    public List<Cliente> GeAllClientes(){
        String hql = "from Cliente";
        clientes = super.GetDataList(hql);
        return clientes;        
    }
    
    @SuppressWarnings("null")
    public Integer SaveCliente(Cliente cliente){
        Direccion direccion = cliente.getDireccion();
        Garante garante = cliente.getGarante();
        Direccion direccionGarante = garante.getDireccion();
        try{
            session.beginTransaction();
            if(direccion != null){
                session.save(direccion);
                cliente.setDireccion(direccion);
            }
            if(garante != null){
                if(direccionGarante!= null){
                    session.save(direccionGarante);
                    garante.setDireccion(direccionGarante);
                }
                session.save(garante);
                cliente.setGarante(garante);
            }            
            
            for(Conocido c : cliente.getConocidos()){                
                if(c.getId() != 0){
                    session.update(c);
                }
                else{
                    c.setCliente(cliente);
                    session.save(c);
                }
            }
            
            Integer idCliente = (int)session.save(cliente);
            session.getTransaction().commit();            
            return idCliente;
        }catch (Exception ex){
            session.getTransaction().rollback();
            System.out.println(ex);
            return null;
        }
    }
               
    public Cliente GetClienteById(int idCliente) {        
        Cliente cliente = (Cliente)this.GetById(idCliente, Cliente.class);      
        session.refresh(cliente);
        return cliente;
    }
    /*public void InspectObject(Object object){
        Class clase = object.getClass();
        Field[] atributos  = clase.getDeclaredFields();
        String asdf = clase.getTypeName();
        for (Field atributo : atributos) {
            Class clase2 = atributo.getName().getClass();
            
            System.out.println(clase2.getName());
        }
        
        System.out.println(asdf);
        
    }*/


}
