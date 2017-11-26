/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencevoyage.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author UTILISATEUR
 */
public class Serializer {
    
    public Serializer(){
        
    }
    
    public void serialize(Object obj, String path){
        if(obj == null){
            return;
        }
        
        System.out.println("Sauvegarde" + obj.toString());
                
        
        ObjectOutputStream oos = null;

        try {
            final FileOutputStream fichier = new FileOutputStream(path);
            oos = new ObjectOutputStream(fichier);
            oos.writeObject(obj);
            oos.flush();
        } catch (final java.io.IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.flush();
                    oos.close();
                }
            } catch (final IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public Object deSerialize(String path){
        
        
        
        if(!new File(path).exists()){
            return null;
        }
        
        ObjectInputStream ois = null;
        Object obj = null;
        try {
            final FileInputStream fichier = new FileInputStream(path);
            ois = new ObjectInputStream(fichier);
            obj = ois.readObject();
        } catch (final java.io.IOException e) {
            e.printStackTrace();
        } catch (final ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (final IOException ex) {
                ex.printStackTrace();
            }
        }
        
        System.out.println("Chargement" + obj.toString());
        
        return obj;
    }
}
