/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rtk.sso.admintest;

/**
 *
 * @author vasil
 */
public class credentialRepresentation {

//    private String algorithm;
//    private HashMap config = new HashMap();
//    private int counter;
//    private long createdDate;
//    private String device;
//    private int digits;
//    private int hashIterations;
//    private String hashedSaltedValue;
//    private int period;
//    private String salt;
//    private boolean temporary;
    private String type;
    private String value;
    private Boolean temporary;

    /**
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     *
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "credentialRepresentation{" + "type=" + type + ", value=" + value + '}';
    }

    /**
     *
     * @return
     */
    public Boolean getTemporary() {
        return temporary;
    }

    /**
     *
     * @param temporary
     */
    public void setTemporary(Boolean temporary) {
        this.temporary = temporary;
    }
    
    
}
