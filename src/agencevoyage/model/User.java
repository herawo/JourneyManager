/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencevoyage.model;

import java.io.Serializable;

/**
 *
 * @author UTILISATEUR
 */
public abstract class User implements Serializable{
    private String identifier;
    private String password;
    private String email;
    private int phone;
    
    public User(String id, String pw, String em, int p){
        identifier = id;
        password = pw;
        email = em;
        phone = p;
    }
    
    public String getIdentifier(){
        return identifier;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getEmail(){
        return email;
    }
    
    public int getPhone(){
        return phone;
    }
}
