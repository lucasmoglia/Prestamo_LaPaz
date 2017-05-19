/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prestamo.Formularios;

/**
 *
 * @author Cesar
 */
public class ComboItem {
    
    private final String key;
    private final String value;
    
    public ComboItem(String key, String value)
    {
        this.key = key;
        this.value = value;
    }

    public String getKey()
    {
        return key;
    }

    public String getValue()
    {
        return value;
    }
    
    @Override
    public String toString(){
        return value;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
    if (obj == null) {
        return false;
    }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ComboItem other = (ComboItem) obj;
        if (!this.key.equals(other.key) ) {
            return false;
        }
        return true;
    }
}
