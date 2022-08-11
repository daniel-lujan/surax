package co.com.surax.modelo;

import java.util.ArrayList;

public class SeguroDeVida extends Poliza {
    
    private double valorPrincipal, valorConyuge, valorHijos, valorHermanos, valorOtros;
    private ArrayList<PersonaNatural> grupoFamiliar;

    public SeguroDeVida(double valorPrincipal, double valorConyuge, double valorHijos,
            double valorHermanos, double valorOtros, String id, Persona tomador, Persona asegurado) {
        super(id, tomador, asegurado);
        this.valorPrincipal = valorPrincipal;
        this.valorConyuge = valorConyuge;
        this.valorHijos = valorHijos;
        this.valorHermanos = valorHermanos;
        this.valorOtros = valorOtros;
    }
    
    public SeguroDeVida(double valorPrincipal, double valorConyuge, double valorHijos,
            double valorHermanos, double valorOtros, ArrayList grupoFamiliar, String id, Persona tomador, Persona asegurado) {
        super(id, tomador, asegurado);
        this.valorPrincipal = valorPrincipal;
        this.valorConyuge = valorConyuge;
        this.valorHijos = valorHijos;
        this.valorHermanos = valorHermanos;
        this.valorOtros = valorOtros;
        this.grupoFamiliar = grupoFamiliar;
    }
    
    public SeguroDeVida(String id, Persona tomador, Persona asegurado) {
        super(id, tomador, asegurado);
    }
    
    public double getValorPrincipal() {
        return valorPrincipal;
    }

    public void setValorPrincipal(double valorPrincipal) {
        this.valorPrincipal = valorPrincipal;
    }

    public double getValorConyuge() {
        return valorConyuge;
    }

    public void setValorConyuge(double valorConyuge) {
        this.valorConyuge = valorConyuge;
    }

    public double getValorHijos() {
        return valorHijos;
    }

    public void setValorHijos(double valorHijos) {
        this.valorHijos = valorHijos;
    }

    public double getValorHermanos() {
        return valorHermanos;
    }

    public void setValorHermanos(double valorHermanos) {
        this.valorHermanos = valorHermanos;
    }

    public double getValorOtros() {
        return valorOtros;
    }

    public void setValorOtros(double valorOtros) {
        this.valorOtros = valorOtros;
    }

    public ArrayList getGrupoFamiliar() {
        return grupoFamiliar;
    }

    public void setGrupoFamiliar(ArrayList grupoFamiliar) {
        this.grupoFamiliar = grupoFamiliar;
    }
}
