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
    
     protected List GetDataList(String hql) {
        List resultList = new ArrayList();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = (Query) session.createQuery(hql);
            resultList = q.list();
            session.getTransaction().commit();
            return resultList;
            
        } catch (HibernateException he) {
            resultList.add(he);
            return resultList;
        }                
    }
}
