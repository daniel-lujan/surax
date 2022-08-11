package co.com.surax.modelo;

import java.util.ArrayList;

public class SeguroEstudiantil extends Poliza{
    
    private PersonaNatural beneficiario;
    private ArrayList<String> riesgos;

    public SeguroEstudiantil(String id, PersonaNatural tomador, PersonaNatural asegurado,
        PersonaNatural beneficiario){
            super(id, tomador, asegurado);
            this.beneficiario = beneficiario;
            this.riesgos = new ArrayList();
    }
    
    public SeguroEstudiantil(String id, PersonaNatural tomador, PersonaNatural asegurado,
        PersonaNatural beneficiario, ArrayList riesgos){
            super(id, tomador, asegurado);
            this.beneficiario = beneficiario;
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

    public PersonaNatural getBeneficiario() {
        return this.beneficiario;
    }

    public void setBeneficiario(PersonaNatural beneficiario) {
        this.beneficiario = beneficiario;
    }

    public ArrayList<String> getRiesgos() {
        return this.riesgos;
    }

    public void setRiesgos(ArrayList<String> riesgos) {
        this.riesgos = riesgos;
    }
}
