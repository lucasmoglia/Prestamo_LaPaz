/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prestamo.Datos;

import java.util.ArrayList;
import java.util.List;
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
    
    public List<TipoDocumento> GetClienteById(int id){
        String hql = "from TipoDocumento td where td.id = "+id;
        tipoDocumentoList = super.GetDataList(hql);
        return tipoDocumentoList;        
    }
}
