/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prestamo.Formularios;

/**
 *
 * @author Elizabeth
 */
public class ComboItem {
    
    private final String key;
    private final String value;
    
    public ComboItem(String key, String value)
    {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString()
    {
        return value;
    }

    public String getKey()
    {
        return key;
    }

    public String getValue()
    {
        return value;
    }
}
