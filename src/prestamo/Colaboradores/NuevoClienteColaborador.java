/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prestamo.Colaboradores;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import prestamo.Datos.ClienteHelper;
import prestamo.Datos.TipoDocumentoHelper;
import prestamo.Formularios.ComboItem;
import prestamo.Modelo.Cliente;
import prestamo.Modelo.Garante;
import prestamo.Modelo.TipoDocumento;
import prestamo.Modelo.Validadores.ClienteValidator;
import prestamo.Modelo.Validadores.DireccionValidator;
import prestamo.Modelo.Validadores.GaranteValidator;
import prestamo.Modelo.Validadores.ObjectValidator;
import prestamo.Modelo.Validadores.PersonaValidator;

/**
 *
 * @author Elizabeth
 */
public class NuevoClienteColaborador {
    
    private final TipoDocumentoHelper documentoHelper = new TipoDocumentoHelper();
    private final ClienteHelper clienteHelper = new ClienteHelper();
    private ClienteValidator clienteValidator;
    private GaranteValidator garanteValidator;
    private DireccionValidator direccionValidator;
    private PersonaValidator personaValidator;
    
    public NuevoClienteColaborador(){}
    
    public List<ComboItem> getTiposDocumento(){
        List<ComboItem> comboItemList = new ArrayList<>();
        try{
             for(TipoDocumento td : documentoHelper.GetAllDocumentos()){
                 comboItemList.add(new ComboItem(String.valueOf(td.getId()), td.getDescripcion()));
             }
             return comboItemList;
        }catch(Exception ex){
            return new ArrayList<>();    
        }        
    }
    public List<ComboItem> getAnios(){
        List<ComboItem> comboItemList = new ArrayList<>();
        Calendar fecha = Calendar.getInstance();
        
        for (int i = 1900; i <= fecha.get(Calendar.YEAR); i++) {
            comboItemList.add(new ComboItem(String.valueOf(i),String.valueOf(i)));
        }
        return comboItemList;
    }

    public TipoDocumento getTipoDocumentoById(String key) {
        try{
            return (TipoDocumento)documentoHelper.GetById(Integer.parseInt(key), TipoDocumento.class);
        }catch (Exception e){
            return null;
        }
    }

    public Date getDate(String dia, String mes, String anio) {
        Calendar cal = new GregorianCalendar();
        cal.set(Integer.parseInt(anio),Integer.parseInt(mes), Integer.parseInt(dia));
        return cal.getTime();
    }

    public void Save(Cliente c) {
        try{
            clienteHelper.SaveCliente(c);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    // Validacion de errores
    
    public ObjectValidator isValidCliente(Cliente c) {
        ObjectValidator resultado = new ObjectValidator();
        clienteValidator = new ClienteValidator(c);
        garanteValidator = new GaranteValidator(c.getGarante() != null ? c.getGarante() : new Garante());
        direccionValidator = new DireccionValidator(c.getDireccion());
        boolean isValid = true;
        String message = "Por favor corrija los siguientes errores: \n" ;        
        isValid = clienteValidator.isIsValid() && garanteValidator.isIsValid() && direccionValidator.isIsValid();
        if(!isValid){
            message += clienteValidator.getMessage();
            message += garanteValidator.getMessage();
            message += direccionValidator.getMessage();
        }
            
        resultado.setIsValid(isValid);
        resultado.setMessage(message);
        return resultado;
    }

    public Cliente GetClienteById(int idCliente) {
        return (Cliente)clienteHelper.GetClienteById(idCliente);
    }
}