/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo.Modelo.Validadores;

/**
 *
 * @author cacarapi
 */
public class ObjectValidator {
    protected boolean isValid = true;
    protected String message = "";
    
    public ObjectValidator(){}
    
    public ObjectValidator(boolean isValid, String message){
        this.isValid = isValid;
        this.message = message;
    }
    /**
     * @return the isValid
     */
    public boolean isIsValid() {
        return isValid;
    }

    /**
     * @param isValid the isValid to set
     */
    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
