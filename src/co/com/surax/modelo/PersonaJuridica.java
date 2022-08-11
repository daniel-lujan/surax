package co.com.surax.modelo;

public class PersonaJuridica extends Persona{
    private PersonaNatural representante_legal;

    public PersonaJuridica(){
        super();
    }
    
    public PersonaJuridica(String id, String tipo_id, String nombre,
        PersonaNatural representante_legal){
        
        super(id, tipo_id, nombre);
        this.representante_legal = representante_legal;
    }

    public PersonaNatural getRepresentanteLegal(){
        return this.representante_legal;
    }

    public void setRepresentanteLegal(PersonaNatural representante_legal){
        this.representante_legal = representante_legal;
    }
    
    @Override
    public String toString(){
        return "Jurídica - "+super.toString();
    }

}
