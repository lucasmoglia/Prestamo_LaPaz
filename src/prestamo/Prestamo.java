/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prestamo;

import prestamo.Formularios.MainCliente;

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
