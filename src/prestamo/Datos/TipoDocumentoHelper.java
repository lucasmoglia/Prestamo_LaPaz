/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prestamo.Datos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.transform.Source;
import org.hibernate.HibernateException;
import prestamo.Modelo.TipoDocumento;

/**
 *
 * @author cacarapi
 */
public class TipoDocumentoHelper extends Helper{
    
    private List<TipoDocumento> tipoDocumentoList;  
    
    public TipoDocumentoHelper() {
        tipoDocumentoList = new ArrayList<>();
    }   

    public List<TipoDocumento> GetAllDocumentos(){
        String hql = "from TipoDocumento ";
        tipoDocumentoList = super.GetDataList(hql);
        return tipoDocumentoList;
    }
}
