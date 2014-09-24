/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prestamo;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.query.JRHibernateQueryExecuterFactory;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Session;
import prestamo.Datos.ClienteHelper;
import prestamo.Datos.HibernateUtil;
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
        /*Session session = HibernateUtil.getSessionFactory().openSession();
        Map parameterMap = new HashMap();
        parameterMap.put(JRHibernateQueryExecuterFactory.PARAMETER_HIBERNATE_SESSION, session);
        String path = "C:\\Users\\Elizabeth\\Documents\\NetBeansProjects\\Prestamo\\src\\prestamo\\Reporte.jasper";
        JasperReport rf = null;
        JasperPrint report = null;
        try {
            rf = (JasperReport) JRLoader.loadObjectFromFile("Reporte.jasper");
            report = JasperFillManager.fillReport(rf, parameterMap);
            JasperViewer view = new JasperViewer(report);
            view.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(Prestamo.class.getName()).log(Level.SEVERE, null, ex);
        }
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
