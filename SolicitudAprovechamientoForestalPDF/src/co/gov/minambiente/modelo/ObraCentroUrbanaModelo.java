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
public class ObraCentroUrbanaModelo extends InfoArbolAisladoModelo {
    private boolean tala;
    private String actividad;

    public ObraCentroUrbanaModelo(boolean tala, String actividad) {
        this.tala = tala;
        this.actividad = actividad;
    }

    public boolean isTala() {
        return tala;
    }

    public void setTala(boolean tala) {
        this.tala = tala;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
    
}
