/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencevoyage.model;

import java.util.LinkedList;

/**
 *
 * @author UTILISATEUR
 */
public class UserManager {
    private LinkedList<User> user_list;
    private static UserManager INSTANCE = new UserManager();
    private User currentUser;
    
    private UserManager(){
        user_list = new LinkedList();
        User admin = new Employee(
                "admin",
                "admin",
                "clemalex20@gmail.com",
                80030250
        );
        user_list.add(admin);
    }
    
    public LinkedList<User> getUserList(){
        return user_list;
    }
    
    public static UserManager getInstance(){
        if (INSTANCE == null){
            INSTANCE = new UserManager();
        }
        return INSTANCE;
    }
    
    public void addUser(User u){
        user_list.add(u);  
    }
    
    public void retrieveUser(){
        String file_name = "user_list.ser";
        Serializer serializer = new Serializer();
        LinkedList<User> tmp_list;
        tmp_list = (LinkedList<User>) serializer.deSerialize(file_name);
        if(tmp_list != null){
            user_list = tmp_list;
        }
    }
    
    public LinkedList<User> getUser(){
        return user_list; 
    }
    
    public void saveUser(){
        String file_name = "user_list.ser";
        Serializer serializer = new Serializer();
        serializer.serialize(user_list, file_name);
    }
    
    public void setCurrentUser(User u){
        currentUser = u;
    }
    
    public User getCurrentUser(){
        return currentUser;
    }
}
