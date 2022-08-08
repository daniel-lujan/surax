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
public class NoMaderableModelo extends ProductoModelo{
    private boolean persistente;
    private double ingresosMensuales;
    private String ingresosMensualesLetras;
    private short categoriaPersistente;

    public NoMaderableModelo(boolean persistente, double ingresosMensuales, String ingresosMensualesLetras, short categoriaPersistente) {
        this.persistente = persistente;
        this.ingresosMensuales = ingresosMensuales;
        this.ingresosMensualesLetras = ingresosMensualesLetras;
        this.categoriaPersistente = categoriaPersistente;
    }

    public boolean isPersistente() {
        return persistente;
    }

    public void setPersistente(boolean persistente) {
        this.persistente = persistente;
    }

    public double getIngresosMensuales() {
        return ingresosMensuales;
    }

    public void setIngresosMensuales(double ingresosMensuales) {
        this.ingresosMensuales = ingresosMensuales;
    }

    public String getIngresosMensualesLetras() {
        return ingresosMensualesLetras;
    }

    public void setIngresosMensualesLetras(String ingresosMensualesLetras) {
        this.ingresosMensualesLetras = ingresosMensualesLetras;
    }

    public short getCategoriaPersistente() {
        return categoriaPersistente;
    }

    public void setCategoriaPersistente(short categoriaPersistente) {
        this.categoriaPersistente = categoriaPersistente;
    }
    
    
}
