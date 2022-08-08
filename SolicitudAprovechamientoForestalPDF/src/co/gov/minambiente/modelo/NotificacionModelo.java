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
public class NotificacionModelo {
    private boolean autorizacion;
    private String correo, telefono,direccionNotificacion,municipio,vereda,departamento,nombre;

    public NotificacionModelo(boolean autorizacion, String correo, String telefono, String direccionNotificacion, String municipio, String vereda, String departamento, String nombre) {
        this.autorizacion = autorizacion;
        this.correo = correo;
        this.telefono = telefono;
        this.direccionNotificacion = direccionNotificacion;
        this.municipio = municipio;
        this.vereda = vereda;
        this.departamento = departamento;
        this.nombre = nombre;
    }

    public boolean isAutorizacion() {
        return autorizacion;
    }

    public void setAutorizacion(boolean autorizacion) {
        this.autorizacion = autorizacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccionNotificacion() {
        return direccionNotificacion;
    }

    public void setDireccionNotificacion(String direccionNotificacion) {
        this.direccionNotificacion = direccionNotificacion;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getVereda() {
        return vereda;
    }

    public void setVereda(String vereda) {
        this.vereda = vereda;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
