package co.com.surax.modelo;

import java.util.ArrayList;

public class SeguroVehicular extends Poliza{

    private Vehiculo vehiculo;
    private Persona beneficiario;
    private ArrayList<String> riesgos = new ArrayList();

    public SeguroVehicular(String id, Persona tomador, Persona asegurado, Persona beneficiario, Vehiculo vehiculo){
        
        super(id, tomador, asegurado);
        this.beneficiario = beneficiario;
        this.vehiculo = vehiculo;
    }
    
    public SeguroVehicular(String id, Persona tomador, Persona asegurado, Persona beneficiario,
            Vehiculo vehiculo, ArrayList riesgos){
        
        super(id, tomador, asegurado);
        this.beneficiario = beneficiario;
        this.vehiculo = vehiculo;
        this.riesgos = riesgos;
    }

    public Vehiculo getVehiculo() {
        return this.vehiculo;
    }
    
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Persona getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Persona beneficiario) {
        this.beneficiario = beneficiario;
    }

    public ArrayList<String> getRiesgos() {
        return this.riesgos;
    }

    public void setRiesgos(ArrayList<String> riesgos) {
        this.riesgos = riesgos;
    }
    
    public void agregarRiesgo(String... riesgos){
        for (String r : riesgos){
            if (!this.riesgos.contains(r)){
                this.riesgos.add(r);
            }
        }
    }

    public void eliminarRiesgo(String... riesgos){
        for (String r: riesgos){
            this.riesgos.remove(r);
        }
    }
}
