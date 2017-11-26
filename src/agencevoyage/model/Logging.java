/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencevoyage.model;

/**
 *
 * @author Pc
 */
public class Logging {
    public Logging(){
    };
    
    public boolean log(String identifier, String password){
        for(User u : UserManager.getInstance().getUser()){
            if(u.getIdentifier().equals(identifier)){
                if(u.getPassword().equals(password)){
                    UserManager.getInstance().setCurrentUser(u);
                    return true;
                }
            }
        }
        return false;
    }
    
}
