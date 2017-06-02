/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo.DataSource;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;
import prestamo.Modelo.Cuota;

/**
 *
 * @author acarapi01
 */
public class CuotaDataSource implements JRDataSource{
    
    private final List<Cuota> cuotas = new ArrayList();
    private int indiceCuotaActual = -1;    

    @Override
    public boolean next() throws JRException {
        return ++indiceCuotaActual < cuotas.size();
    }

    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        
        switch(jrf.getName()){
            case "NumeroCuota":
                return cuotas.get(indiceCuotaActual).getNumeroCuota();
            case "SaldoInicial":
                return cuotas.get(indiceCuotaActual).getSaldoInicial();
            case "Monto":
                return cuotas.get(indiceCuotaActual).getMonto();
            case "Amortizacion":
                return cuotas.get(indiceCuotaActual).getAmortizacion();
            case "InteresPeriodo":
                return cuotas.get(indiceCuotaActual).getInteresPeriodo();
            case "TotalAmortizado":
                return cuotas.get(indiceCuotaActual).getTotalAmortizado();
            case "FechaCuota":
                return cuotas.get(indiceCuotaActual).FechaCuotaString();
            default: return null;
                
        }        
    }
    
    public void addCuota(Cuota cuota)
    {
        this.cuotas.add(cuota);
    }
    
    public void OrdenarArray(){
        Collections.sort(cuotas);
    }
}
