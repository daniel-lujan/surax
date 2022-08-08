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
public class EmergenciaTalaModelo extends InfoArbolAisladoModelo {
    private boolean tala;
    private short estado;
    private String causa;

    public EmergenciaTalaModelo(boolean tala, short estado, String causa) {
        this.tala = tala;
        this.estado = estado;
        this.causa = causa;
    }

    public boolean isTala() {
        return tala;
    }

    public void setTala(boolean tala) {
        this.tala = tala;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }
    
}
