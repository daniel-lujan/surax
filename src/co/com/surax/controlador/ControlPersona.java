package co.com.surax.controlador;

import java.util.ArrayList;

import co.com.surax.modelo.Persona;
import co.com.surax.modelo.PersonaNatural;
import co.com.surax.modelo.PersonaJuridica;
import co.com.surax.controlador.database.DatabasePersonas;


public class ControlPersona {
    
    private DatabasePersonas db;
    
    public ControlPersona(){
        this.db = new DatabasePersonas();
    }
    
    /**
     * Crea y añade una PersonaNatural a la base de datos de Personas.
     * @param id Número de identificación
     * @param tipo_id Tipo de identificación
     * @param nombre Nombre de la persona
     * @param edad Edad de la persona
     * @param tel Número de teléfono de la persona (Sólo dígitos)
     * @param dir Dirección de residencia de la persona
     * @return Resultado de la operación
     */
    public boolean crearNatural(String id, String tipo_id, String nombre,
            int edad, String tel, String dir){
        PersonaNatural persona = new PersonaNatural(id,tipo_id,nombre,edad,tel,dir);
        return (db.store(persona));
    }
    /**
     * Crea y añade una Persona Jurídica a la base de datos de Personas.
     * @param id Número de identificación
     * @param tipo_id Tipo de identificación
     * @param nombre Nombre de la entidad
     * @param representante_legal Representante legal de la entidad
     * @return Resultado de la operación
     */
    public boolean crearJuridica(String id, String tipo_id, String nombre,
            PersonaNatural representante_legal){
        PersonaJuridica persona = new PersonaJuridica(id,tipo_id,nombre,representante_legal);
        return (db.store(persona));
    }
    
    /**
     * Busca a una persona de la base de datos según la posición dada.
     * @param index Posición de la Persona en la base de datos.
     * @return Persona encontrada en la base de datos.
     */
//    public Persona getElement(int index){
//        return (Persona)db.find(index);
//    }
    
    /**
     * Busca a una persona de la base de datos según número de identificación.
     * @param id Número de identificación a buscar.
     * @return Persona encontrada en la base de datos.
     */
    public Persona getElement(String id){
        return (Persona)db.find(id);
    }
    
    /**
     * Calcula el tamaño de la base de datos de Personas.
     * @return Cantidad de Personas en la base de datos.
     */
    public int getDBSize(){
        return db.getDBSize();
    }
    
    /**
     * Devuelve la base de datos de Personas completa.
     * @return Base de datos de Personas.
     */
    public ArrayList<Persona> getDB(){
        return db.getDB();
    }
    
    /**
     * Devuelve la base de datos completa, pero como un arreglo de Java.
     * @return Base de datos de Personas.
     */
    public Persona[] getDBAsArray(){
        return StaticController.listToArray(getDB());
    }
    
    /**
     * Determina la validez de un número de identificación.
     * @param id Número de identificación.
     * @return Resultado de la validación.
     */
    public boolean validarId(String id){
        int size = db.getDBSize();
        for (int i = 0; i<size;i++){
            if (((Persona)db.find(i)).getId().equals(id)){
                return false;
            }
        }
        return allDigits(id);
    }
    
    /**
     * Determina la validez de un tipo de identificación.
     * @param tipo_id Tipo de identificación.
     * @return Resultado de la validación.
     */
    public boolean validarTipoId(String tipo_id){
        // CE, CD, PA, IFE still to be added
        return (tipo_id.equals("CC") || tipo_id.equals("TI") || tipo_id.equals("NIT"));
    }
    
    /**
     * Determina la validez de un nombre.
     * @param nombre Nombre.
     * @return Resultado de la validación.
     */
    public boolean validarNombre(String nombre){
        // 
        return true;
    }
    
    /**
     * Determina la validez de un número de teléfono.
     * @param tel Número de teléfono.
     * @return Resultado de la validación.
     */
    public boolean validarTelefono(String tel){
        if (tel.length()>10){
            return false;
        }
        return allDigits(tel);
    }
    
    /**
     * Determina la validez de una edad.
     * @param edad Edad.
     * @return Resultado de la validación.
     */
    public boolean validarEdad(String edad){
        int e;
        try{
            e = Integer.parseInt(edad);
        } catch (NumberFormatException x){
            return false;
        }
        return (e > 6);
    }
    
    /**
     * Determina la validez de una dirección.
     * @param direccion Dirección.
     * @return Resultado de la validación.
     */
    public boolean validarDireccion(String direccion){
        //
        return true;
    }
    
    /**
     * Busca las personas en la base de datos que coinciden con la
     * identificación o nombre dados.
     * @param id Número de identificación.
     * @param nombre Nombre.
     * @return Resultado de la búsqueda. 
     */
    public Persona[] buscar(String id, String nombre){
        ArrayList<Persona> results = new ArrayList();
        Persona p;
        int size = db.getDBSize();
        for (int i = 0; i<size;i++){
            p = (Persona)db.find(i);
            if (p.getId().contains(id) || p.getNombre().toLowerCase().contains(nombre.toLowerCase())){
                results.add(p);
            }
        }
        return StaticController.listToArray(results);
    }
    
    /**
     * Busca las personas en la base de datos que coinciden con la
     * identificación dada.
     * @param id Número de identificación.
     * @return Resultado de la búsqueda.
     */
    public Persona[] buscarPorId (String id){
        ArrayList<Persona> results = new ArrayList();
        Persona p;
        int size = db.getDBSize();
        for (int i = 0; i<size;i++){
            p = (Persona)db.find(i);
            if (p.getId().contains(id)){
                results.add(p);
            }
        }
        return StaticController.listToArray(results);
    }
    
    /**
     * Busca las personas en la base de datos que coinciden con el
     * nombre dado.
     * @param nombre Nombre.
     * @return Resultado de la búsqueda.
     */
    public Persona[] buscarPorNombre (String nombre){
        ArrayList<Persona> results = new ArrayList();
        Persona p;
        int size = db.getDBSize();
        for (int i = 0; i<size;i++){
            p = (Persona)db.find(i);
            if (p.getNombre().toLowerCase().contains(nombre.toLowerCase())){
                results.add(p);
            }
        }
        return StaticController.listToArray(results);
    }
    /**
     * Verifica si todos los caracteres de un String son dígitos.
     * @param str
     * @return 
     */
    private static boolean allDigits(String str){
        for (char c : str.toCharArray()){
            if (!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
}
