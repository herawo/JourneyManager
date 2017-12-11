/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencevoyage.model;

import java.io.File;
import java.util.LinkedList;

/**
 *
 * @author Pc
 */
public class JourneyManager {
    private LinkedList<Journey> journey_list;
    private static JourneyManager INSTANCE = new JourneyManager();
    
    private JourneyManager(){
        journey_list = new LinkedList();
    }
    
    public void retrieveJourneyList(){
        String file_name = "journey_list.ser";
        Serializer serializer = new Serializer();
        journey_list = (LinkedList<Journey>) serializer.deSerialize(file_name); 
    }
    
    public LinkedList<Journey> getJourneyList(){
        return journey_list;
    }

    public void saveJourneyList(){
        String file_name = "journey_list.ser";
        Serializer serializer = new Serializer();
        serializer.serialize(journey_list, file_name);
    }
    
    public static JourneyManager getInstance(){
        if (INSTANCE == null){
            INSTANCE = new JourneyManager();
        }
        return INSTANCE;
    }

    public String[][] getJourneyArray(){
        if(journey_list == null){
            journey_list = new LinkedList();
        }
        String[][] car_array = new String[journey_list.size()][4];
        int j = 0;
        for(Journey c : journey_list){
            car_array[j][0] = c.getCity();
            car_array[j][1] = c.getCountry();
            car_array[j][2] = String.valueOf(c.getPrice()) + "€";
            car_array[j][3] = String.valueOf(c.getNumberPlace());
            j++;
        }
        return car_array;
    }
    
    public void addNewCar(Journey c){
        journey_list.add(c);
    }
    
    public void deleteCar(int index){
        journey_list.remove(index);
    }
}
