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
public class PersonaModelo {

    private short tipo;
    private String tipoId, id, nombre, tp;

    public PersonaModelo(short tipo, String tipoId, String id, String nombre, String tp) {
        this.tipo = tipo;
        this.tipoId = tipoId;
        this.id = id;
        this.nombre = nombre;
        this.tp = tp;
    }

    public short getTipo() {
        return tipo;
    }

    public void setTipo(short tipo) {
        this.tipo = tipo;
    }

    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

}
