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
public class SolicitudModelo {
    private String id;
    private String fecha;
    private PersonaModelo interesado;
    private PersonaModelo apoderado;
    private NotificacionModelo notificacion;
    private Image firma;

    public SolicitudModelo(String id, String fecha, PersonaModelo interesado, PersonaModelo apoderado, NotificacionModelo notificacion, Image firma) {
        this.id = id;
        this.fecha = fecha;
        this.interesado = interesado;
        this.apoderado = apoderado;
        this.notificacion = notificacion;
        this.firma = firma;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public PersonaModelo getInteresado() {
        return interesado;
    }

    public void setInteresado(PersonaModelo interesado) {
        this.interesado = interesado;
    }

    public PersonaModelo getApoderado() {
        return apoderado;
    }

    public void setApoderado(PersonaModelo apoderado) {
        this.apoderado = apoderado;
    }

    public NotificacionModelo getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(NotificacionModelo notificacion) {
        this.notificacion = notificacion;
    }

    public Image getFirma() {
        return firma;
    }

    public void setFirma(Image firma) {
        this.firma = firma;
    }
    
    
}
