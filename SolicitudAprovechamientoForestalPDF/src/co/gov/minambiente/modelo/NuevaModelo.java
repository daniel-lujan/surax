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
public class NuevaModelo extends SolicitudModelo{
    private ActividadModelo actividad;
    private PredioModelo predio;

    public NuevaModelo(String id, String fecha, PersonaModelo interesado, PersonaModelo apoderado, NotificacionModelo notificacion, Image firma,ActividadModelo actividad, PredioModelo predio) {
        super(id,fecha, interesado,  apoderado,  notificacion,firma);
        this.actividad = actividad;
        this.predio = predio;
    }

    public ActividadModelo getActividad() {
        return actividad;
    }

    public void setActividad(ActividadModelo actividad) {
        this.actividad = actividad;
    }

    public PredioModelo getPredio() {
        return predio;
    }

    public void setPredio(PredioModelo predio) {
        this.predio = predio;
    }
    
    
    
}
