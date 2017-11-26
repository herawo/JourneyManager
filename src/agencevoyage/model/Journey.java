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
public class Journey implements Serializable{
    private String country;
    private String city;
    private double price;
    private int number_place;
    
    
    public Journey(String co, String ci, double p, int nb){
        country = co;
        city = ci;
        price = p;
        number_place = nb;
    }
    
    public String[] getPlacesArray(){
        String[] places = new String[number_place];
        for(int i = 0; i < number_place; i++){
            places[i] = String.valueOf(i+1);
        }
        return places;
    }
    
    public String getCountry(){
        return country;
    }
    
    public String getCity(){
        return city;
    }
    
    public double getPrice(){
        return price;
    }
    
    public int getNumberPlace(){
        return number_place;
    }
    
    public void setCountry(String m){
        country = m;
    }
    
    public void setCity(String b){
        city = b;
    }
    
    public void setPrice(double p){
        price = p;
    }
    
    public void setNumberPlace(int nb){
        number_place = nb;
    }
}
