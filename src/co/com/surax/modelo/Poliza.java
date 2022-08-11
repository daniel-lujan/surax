package co.com.surax.modelo;

public class Poliza {
    
    private String id;
    private Persona tomador, asegurado;

    public Poliza(String id, Persona tomador, Persona asegurado){
        this.id = id;
        this.tomador = tomador;
        this.asegurado = asegurado;
    }

    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }

    public Persona getAsegurado() {
        return asegurado;
    }

    public void setAsegurado(Persona asegurado) {
        this.asegurado = asegurado;
    }

    public Persona getTomador(){
        return this.tomador;
    }

    public void setTomador(Persona tomador){
        this.tomador = tomador;
    }


}
