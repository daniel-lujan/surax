/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.surax.controlador.database;

import co.com.surax.modelo.Persona;
import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class DatabasePersonas implements Database {
    private static ArrayList db = new ArrayList();
    
    public DatabasePersonas(){
    }
    
    @Override
    public boolean store(Object persona){
        if (!(persona instanceof Persona)){
            System.out.println(persona.getClass().getSimpleName());
            return false;
        }
        db.add(persona);
        
        return true;
    }
    
    @Override
    public Object find(Object id){
        if (!(id instanceof String)){
            return null; // Not valid id type for Persona
        }
        for (Object p : db){
            if (((Persona)p).getId().equals(id)){
                return p;
            }
        }
        return null;
    }
    
    @Override
    public Object find(int index){
        int i = 0;
        for (Object p : db){
            if (i == index){
                return p;
            }
            i++;
        }
        return null;
    }
    
    @Override
    public boolean update(Object id, Object persona){
        if (!(id instanceof String && persona instanceof Persona)){
            return false;
        }
        int i = 0;
        for (Object p : db){
            if (((Persona)p).getId().equals(id)){
                db.set(i,p);
                return true;
            }
            i++;
        }
        return false;
    }
    
    // TO BE TESTED
    @Override
    public boolean delete(Object id){
        if (!(id instanceof String)){
            return false;
        }
        Object p = find(id);
        if (p != null){
            return db.remove(p);
        } else {
            return false;
        }
    }
    
    @Override
    public int getDBSize(){
        return db.size();
    }
    
    @Override
    public ArrayList getDB(){
        return db;
    }
}
