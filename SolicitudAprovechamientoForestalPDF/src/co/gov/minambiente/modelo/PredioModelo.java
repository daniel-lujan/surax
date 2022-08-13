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
public class PredioModelo {
    private short tipo, tipoCordenadas;
    private double superficie;
    private boolean rural;
    private String departamento,municipio,vereda,matriculaInmobiliaria,cedulaCatastral;
    private ArrayList<Object> coordenadas;

    public PredioModelo() {
        this.coordenadas = new ArrayList();
    }

    public PredioModelo(short tipo, short tipoCordenadas, double superficie, boolean rural, String departamento, String municipio, String vereda, String matriculaInmobiliaria, String cedulaCatastral, ArrayList<Object> coordenadas) {
        this.tipo = tipo;
        this.tipoCordenadas = tipoCordenadas;
        this.superficie = superficie;
        this.rural = rural;
        this.departamento = departamento;
        this.municipio = municipio;
        this.vereda = vereda;
        this.matriculaInmobiliaria = matriculaInmobiliaria;
        this.cedulaCatastral = cedulaCatastral;
        this.coordenadas = coordenadas;
    }

    public PredioModelo(short tipo, short tipoCordenadas, double superficie, boolean rural, String departamento, String municipio, String vereda, String matriculaInmobiliaria, String cedulaCatastral) {
        this.coordenadas = new ArrayList();
        this.tipo = tipo;
        this.tipoCordenadas = tipoCordenadas;
        this.superficie = superficie;
        this.rural = rural;
        this.departamento = departamento;
        this.municipio = municipio;
        this.vereda = vereda;
        this.matriculaInmobiliaria = matriculaInmobiliaria;
        this.cedulaCatastral = cedulaCatastral;
    }

    public short getTipo() {
        return tipo;
    }

    public void setTipo(short tipo) {
        this.tipo = tipo;
    }

    public short getTipoCordenadas() {
        return tipoCordenadas;
    }

    public void setTipoCordenadas(short tipoCordenadas) {
        this.tipoCordenadas = tipoCordenadas;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public boolean isRural() {
        return rural;
    }

    public void setRural(boolean rural) {
        this.rural = rural;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
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

    public String getMatriculaInmobiliaria() {
        return matriculaInmobiliaria;
    }

    public void setMatriculaInmobiliaria(String matriculaInmobiliaria) {
        this.matriculaInmobiliaria = matriculaInmobiliaria;
    }

    public String getCedulaCatastral() {
        return cedulaCatastral;
    }

    public void setCedulaCatastral(String cedulaCatastral) {
        this.cedulaCatastral = cedulaCatastral;
    }

    public ArrayList<Object> getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(ArrayList<Object> coordenadas) {
        this.coordenadas = coordenadas;
    }
    
}
