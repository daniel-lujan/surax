package co.com.surax.dao.impl;

import co.com.surax.dao.PersonaDAO;
import co.com.surax.modelo.Persona;
import java.util.ArrayList;


public class PersonaDAOList implements PersonaDAO{
    private ArrayList<Persona> personasDB = new ArrayList();

    @Override
    public boolean almacenarPersona(Persona persona){
        return this.personasDB.add(persona);
    }
    @Override
    public Persona consultarPersona(String id){
        int i = getPersonaIndex(id);
        if (i != -1){
            return personasDB.get(i);
        } return null;
    }
    
    @Override
    public Persona consultarPersonaAt(int index){
        return personasDB.get(index);
    }

    private int getPersonaIndex(String id){
        for (int i = 0; i<personasDB.size();i++){
            if (personasDB.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean actualizarPersona(String id, Persona persona){
        int i = getPersonaIndex(id);
        if (i != -1){
            personasDB.set(i, persona);
            return true;
        } return false;
        
    }
    @Override
    public boolean eliminarPersona(String id){
        int i = getPersonaIndex(id);
        if (i != -1){
            personasDB.remove(i);
            return true;
        } return false;
    }
    
    @Override
    public int getDBSize(){
        return personasDB.size();
    }
    
    @Override
    public ArrayList getDB(){
        return personasDB;
    }

}
