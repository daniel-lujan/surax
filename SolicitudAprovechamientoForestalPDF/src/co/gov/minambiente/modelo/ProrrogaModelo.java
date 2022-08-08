/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.minambiente.modelo;

import java.awt.Image;

/**
 *
 * @author marit
 */
public class ProrrogaModelo extends SolicitudModelo {
    private int numActo, numExpediente;

    public ProrrogaModelo(String id, String fecha, PersonaModelo interesado, PersonaModelo apoderado, NotificacionModelo notificacion, Image firma,int numActo, int numExpediente) {
        super(id,fecha, interesado,  apoderado,  notificacion,firma);
        this.numActo = numActo;
        this.numExpediente = numExpediente;
    }

    public int getNumActo() {
        return numActo;
    }

    public void setNumActo(int numActo) {
        this.numActo = numActo;
    }

    public int getNumExpediente() {
        return numExpediente;
    }

    public void setNumExpediente(int numExpediente) {
        this.numExpediente = numExpediente;
    }
    
    
}
