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
    private ArrayList<CoordenadaModelo> coordenadas;
    
}
