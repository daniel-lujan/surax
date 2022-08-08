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
public class EspecieModelo {
    private int cantidad;
    private String unidadMedida, nombreComun, nombreCientifico,parteAprovechada,habito,veda,categoriaAmenaza;

    public EspecieModelo(int cantidad, String unidadMedida, String nombreComun, String nombreCientifico, String parteAprovechada, String habito, String veda, String categoriaAmenaza) {
        this.cantidad = cantidad;
        this.unidadMedida = unidadMedida;
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.parteAprovechada = parteAprovechada;
        this.habito = habito;
        this.veda = veda;
        this.categoriaAmenaza = categoriaAmenaza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getParteAprovechada() {
        return parteAprovechada;
    }

    public void setParteAprovechada(String parteAprovechada) {
        this.parteAprovechada = parteAprovechada;
    }

    public String getHabito() {
        return habito;
    }

    public void setHabito(String habito) {
        this.habito = habito;
    }

    public String getVeda() {
        return veda;
    }

    public void setVeda(String veda) {
        this.veda = veda;
    }

    public String getCategoriaAmenaza() {
        return categoriaAmenaza;
    }

    public void setCategoriaAmenaza(String categoriaAmenaza) {
        this.categoriaAmenaza = categoriaAmenaza;
    }
    
}
