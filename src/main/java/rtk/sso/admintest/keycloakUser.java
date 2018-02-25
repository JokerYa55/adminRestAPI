/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rtk.sso.admintest;

import java.util.HashMap;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vasil
 *
 */
@XmlRootElement
public class keycloakUser {
    
    private String username;
    private boolean enabled;
    private String email;
    private String firstName;
    private String lastName;

    private HashMap<String, String> attributes;
    private List<credentialRepresentation> credentials;

    /**
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     *
     * @param enabled
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return
     */
    public List<credentialRepresentation> getCredentials() {
        return credentials;
    }

    /**
     *
     * @param credentials
     */
    public void setCredentials(List<credentialRepresentation> credentials) {
        this.credentials = credentials;
    }

    @Override
    public String toString() {
        return "keycloakUser{" + "username=" + username + ", enabled=" + enabled + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", attributes=" + attributes + ", credentials=" + credentials + '}';
    }

    /**
     *
     * @return
     */
    public HashMap<String, String> getAttributes() {
        return attributes;
    }

    /**
     *
     * @param attributes
     */
    public void setAttributes(HashMap<String, String> attributes) {
        this.attributes = attributes;
    }

}
