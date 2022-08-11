/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.surax.controlador.database;

import co.com.surax.controlador.StaticController;
import co.com.surax.modelo.Persona;
import com.fasterxml.jackson.databind.ObjectMapper;
import co.com.surax.modelo.PersonaNatural;
import co.com.surax.modelo.PersonaJuridica;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class ControladorJSON {
    private final ObjectMapper om;
    private final DatabasePersonas dbPersonas;
    private final String PERSONASN_PATH = "./databases/personasNaturales.json";
    private final String PERSONASJ_PATH = "./databases/personasJuridicas.json";
    private final String POLIZAS_PATH = "./databases/polizas.json";
    
    public ControladorJSON(){
        om = new ObjectMapper();
        dbPersonas = new DatabasePersonas();
    }
    
    public boolean loadDatabases(){
        return loadPersonasIntoDatabase() && loadPolizasIntoDatabase();
    }
    
    public boolean loadPersonasIntoDatabase(){
        return loadPersonasNaturalesIntoDatabase() && loadPersonasJuridicasIntoDatabase();
    }
    
    public boolean loadPersonasNaturalesIntoDatabase(){
        try{
            PersonaNatural[] array = om.readValue(new File(PERSONASN_PATH), PersonaNatural[].class);
            for (PersonaNatural p : array){
                if (dbPersonas.store(p)){
                }
            }
            return true;
        } catch (com.fasterxml.jackson.core.JsonProcessingException e){
            System.out.println("[EXCEPTION] JsonProcessingException: "+e.getMessage());
        } catch (java.io.IOException e){
            System.out.println("[EXCEPTION] IOException: "+e.getMessage());
        }
        return false;
    }
    
    public boolean loadPersonasJuridicasIntoDatabase(){
        try{
            PersonaJuridica[] array = om.readValue(new File(PERSONASJ_PATH), PersonaJuridica[].class);
            for (PersonaJuridica p : array){
                dbPersonas.store(p);
            }
            return true;
        } catch (com.fasterxml.jackson.core.JsonProcessingException e){
            System.out.println("[EXCEPTION] JsonProcessingException: "+e.getMessage());
        } catch (java.io.IOException e){
            System.out.println("[EXCEPTION] IOException: "+e.getMessage());
        }
        return false;
    }
    
    public boolean loadPolizasIntoDatabase(){
        return true;
    }
    
    public boolean saveDatabases(){
        return (savePersonasDatabase() && savePolizasDatabase());
    }
    
    public boolean savePersonasDatabase(){
        ArrayList<Persona> naturales = new ArrayList();
        ArrayList<Persona> juridicas = new ArrayList();
        dbPersonas.getDB().forEach((p) -> {
            if (p instanceof PersonaNatural){
                naturales.add((PersonaNatural)p);
            }else {
                juridicas.add((PersonaJuridica)p);
            }
        });
        return savePersonasNaturalesDatabase(StaticController.listToArray(naturales)) &&
                savePersonasJuridicasDatabase(StaticController.listToArray(juridicas));
    }
    
    public boolean savePersonasNaturalesDatabase(Persona[] array){
        try{
            om.writerWithDefaultPrettyPrinter().writeValue(new File(PERSONASN_PATH), array);
            return true;
        } catch (java.io.IOException e){
            System.out.println(e.getMessage());
        }
        return false;
    }
    
    public boolean savePersonasJuridicasDatabase(Persona[] array){
        try{
            om.writerWithDefaultPrettyPrinter().writeValue(new File(PERSONASJ_PATH),array);
            return true;
        } catch (java.io.IOException e){
            System.out.println(e.getMessage());
        }
        return false;
    }
    
    public boolean savePolizasDatabase(){
        return true;
    }
}
