package co.com.surax.modelo;

public class PersonaNatural extends Persona{
    private String tel,direccion;
    private int edad;

    public PersonaNatural(){
        super();
    }
    
    public PersonaNatural(String id, String tipo_id, String nombre, int edad, String tel, String direccion){
        super(id,tipo_id,nombre);
        this.edad = edad;
        this.tel = tel;
        this.direccion = direccion;
    }

    public String getTel(){
        return tel;
    }

    public void setTel(String tel ){
        this.tel = tel;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        return "Natural - "+super.toString();
    }
}