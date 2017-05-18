/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prestamo.Datos;
import java.util.List;
import java.util.Set;
import prestamo.Modelo.Cliente;
import prestamo.Modelo.Cuota;
import prestamo.Modelo.Prestamo;

/**
 *
 * @author Elizabeth
 */
public class PrestamoHelper extends Helper{
    public void SavePrestamo(Prestamo prestamo){        
        try{
            session.beginTransaction();  
            for(Cuota c : prestamo.getCuotas()){
                c.setPrestamo(prestamo);
                session.save(c);
            }
            session.save(prestamo);
            session.getTransaction().commit();
        }catch (Exception ex){
            session.getTransaction().rollback();
            System.out.println(ex);
        }
    }
    
    public Set<Prestamo> GetPrestamosByClienteId(int idCliente){
       Cliente c =  (Cliente)GetById(idCliente, Cliente.class);
       return c.getPrestamos();
    }
}
