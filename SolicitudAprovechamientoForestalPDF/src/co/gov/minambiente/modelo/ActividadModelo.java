/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.minambiente.modelo;

import java.util.ArrayList;

/**
 *
 * @author marit
 */
public class ActividadModelo {
    private double costo;
    private String costoLetras,uso;
    private short adquisicionDerecho, metodoAprovechamiento;
    private Object producto;
    private ArrayList<EspecieModelo> especies;
    private Object arbolesAislados;

    public ActividadModelo(){
        this.especies = new ArrayList();
        this.producto = new Object();
        this.arbolesAislados = new Object();
    }
    
    public ActividadModelo(double costo, String costoLetras, String uso, short adquisicionDerecho, short metodoAprovechamiento, Object producto, ArrayList<EspecieModelo> especies, Object arbolesAislados) {
        this.costo = costo;
        this.costoLetras = costoLetras;
        this.uso = uso;
        this.adquisicionDerecho = adquisicionDerecho;
        this.metodoAprovechamiento = metodoAprovechamiento;
        this.producto = producto;
        this.especies = especies;
        this.arbolesAislados = arbolesAislados;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getCostoLetras() {
        return costoLetras;
    }

    public void setCostoLetras(String costoLetras) {
        this.costoLetras = costoLetras;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public short getAdquisicionDerecho() {
        return adquisicionDerecho;
    }

    public void setAdquisicionDerecho(short adquisicionDerecho) {
        this.adquisicionDerecho = adquisicionDerecho;
    }

    public short getMetodoAprovechamiento() {
        return metodoAprovechamiento;
    }

    public void setMetodoAprovechamiento(short metodoAprovechamiento) {
        this.metodoAprovechamiento = metodoAprovechamiento;
    }

    public Object getProducto() {
        return producto;
    }

    public void setProducto(Object producto) {
        this.producto = producto;
    }

    public ArrayList<EspecieModelo> getEspecies() {
        return especies;
    }

    public void setEspecies(ArrayList<EspecieModelo> especies) {
        this.especies = especies;
    }

    public Object getArbolesAislados() {
        return arbolesAislados;
    }

    public void setArbolesAislados(Object arbolesAislados) {
        this.arbolesAislados = arbolesAislados;
    }
    
}
