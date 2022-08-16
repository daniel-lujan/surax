/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.minambiente.controlador.database;

import java.util.ArrayList;
import co.gov.minambiente.modelo.RequestModel;

/**
 *
 * @author daniel
 */
public class RequestsDatabase{
    
    private static ArrayList<RequestModel> db = new ArrayList();
    
    /**
     * Adds a request into the database
     * @param request
     * @return true if the request was added successfully, false otherwise
     */
    public static boolean add(RequestModel request){
        return db.add(request);
    }
    
    /**
     * Deletes a request from the database
     * @param reference Reference to request to be deleted
     * @return true if the request was deleted successfully, false if it could not be found
     */
    public static boolean delete(int reference){
        RequestModel r;
        if ((r = get(reference)) != null){
            db.remove(r);
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Updates a request of the database
     * @param reference Reference of request to be updated
     * @param newRequest Request to replace the existing one
     * @return true if the request was updated successfully, false if it could not be found
     */
    public static boolean update(int reference, RequestModel newRequest){
        if (get(reference) != null){
            db.set(reference, newRequest);
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Gets a request from the database
     * @param reference Reference of request to search for
     * @return Found request or null if it could not be found
     */
    public static RequestModel get(int reference){
        for (RequestModel r : db){
            if (r.getREFERENCE().equals(reference)){
                return r;
            }
        }
        return null;
    }
    
    /**
     * Gets the whole database
     * @return Database as ArrayList
     */
    public static ArrayList<RequestModel> getDatabase(){
        return db;
    }
    
    /**
     * Gets the whole database as an array
     * @return Database as array
     */
    public static RequestModel[] getDatabaseAsArray(){
        RequestModel[] array = new RequestModel[db.size()];
        int i = 0;
        db.forEach((req) -> {
            array[i] = req;
        });
        return array;
    }
}