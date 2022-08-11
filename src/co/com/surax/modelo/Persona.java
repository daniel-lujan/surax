package co.com.surax.modelo;

public class Persona {
    private String id,tipo_id,nombre;

    public Persona(){
        
    }
    
    public Persona(String id, String tipo_id, String nombre){
        this.id = id;
        this.tipo_id = tipo_id;
        this.nombre = nombre;
    }

    public String getId(){
        return id;
    }

    public void setId(String id ){
        this.id = id;
    }

    public String getTipoId(){
        return this.tipo_id;
    }

    public void setTipoId(String tipo_id){
        this.tipo_id = tipo_id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre ){
        this.nombre = nombre;
    }
    

    @Override
    public String toString(){
        return this.tipo_id+" "+this.id+" - "+this.nombre;
    }

}
