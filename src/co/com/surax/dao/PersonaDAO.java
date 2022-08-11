package co.com.surax.dao;

import co.com.surax.modelo.Persona;
import java.util.ArrayList;

public interface PersonaDAO {
    
    boolean almacenarPersona(Persona persona);
    Persona consultarPersona(String id);
    Persona consultarPersonaAt(int index);
    boolean actualizarPersona(String id, Persona persona);
    boolean eliminarPersona(String id);
    int getDBSize();
    ArrayList getDB();
}
