/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.minambiente.modelo;

/**
 *
 * @author marit
 */
public class CoordenadaGeograficaModelo extends CoordenadaModelo {
    private double gradosLatitud, minutosLatitud, segundosLatitud,gradosLongitud,minutosLongitud,segundosLongitud,altitud;

    public CoordenadaGeograficaModelo(double gradosLatitud, double minutosLatitud, double segundosLatitud, double gradosLongitud, double minutosLongitud, double segundosLongitud, double altitud, short punto) {
        super(punto);
        this.gradosLatitud = gradosLatitud;
        this.minutosLatitud = minutosLatitud;
        this.segundosLatitud = segundosLatitud;
        this.gradosLongitud = gradosLongitud;
        this.minutosLongitud = minutosLongitud;
        this.segundosLongitud = segundosLongitud;
        this.altitud = altitud;
    }

    public double getGradosLatitud() {
        return gradosLatitud;
    }

    public void setGradosLatitud(double gradosLatitud) {
        this.gradosLatitud = gradosLatitud;
    }

    public double getMinutosLatitud() {
        return minutosLatitud;
    }

    public void setMinutosLatitud(double minutosLatitud) {
        this.minutosLatitud = minutosLatitud;
    }

    public double getSegundosLatitud() {
        return segundosLatitud;
    }

    public void setSegundosLatitud(double segundosLatitud) {
        this.segundosLatitud = segundosLatitud;
    }

    public double getGradosLongitud() {
        return gradosLongitud;
    }

    public void setGradosLongitud(double gradosLongitud) {
        this.gradosLongitud = gradosLongitud;
    }

    public double getMinutosLongitud() {
        return minutosLongitud;
    }

    public void setMinutosLongitud(double minutosLongitud) {
        this.minutosLongitud = minutosLongitud;
    }

    public double getSegundosLongitud() {
        return segundosLongitud;
    }

    public void setSegundosLongitud(double segundosLongitud) {
        this.segundosLongitud = segundosLongitud;
    }

    public double getAltitud() {
        return altitud;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }
    
}
