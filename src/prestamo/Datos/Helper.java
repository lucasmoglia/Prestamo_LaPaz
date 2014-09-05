/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prestamo.Datos;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author cacarapi
 */
public class Helper {
    
    protected Session session = HibernateUtil.getSessionFactory().openSession();

    protected List GetDataList(String hql) {
        List resultList = new ArrayList();
        try {
            Query q = (Query) session.createQuery(hql);
            resultList = q.list();
            return resultList;
            
        } catch (HibernateException he) {
            resultList.add(he);
            return resultList;
        }                
    }
     
    public Object GetById(int id, Class clase){
        Object object = null;
        try {
            object =  session.get(clase, id);
        }
        catch (HibernateException e) {
            session.getTransaction().rollback();
        }
        return object;
    }
    
    public void Save(Object object) {
        try {
            session.beginTransaction();
            session.save(object);
            session.getTransaction().commit();
        }
        catch (HibernateException e) {
            System.out.println(e);
            session.getTransaction().rollback();
        }
    }
}
