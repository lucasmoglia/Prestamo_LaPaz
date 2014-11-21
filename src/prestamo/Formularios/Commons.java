/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prestamo.Formularios;

import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author Elizabeth
 */
public class Commons {
    public Commons(){}
    
    public static void loadCombo(JComboBox combo, List<ComboItem> datos){
        for(Object c : datos){
            combo.addItem(c);
        }
    }
}
