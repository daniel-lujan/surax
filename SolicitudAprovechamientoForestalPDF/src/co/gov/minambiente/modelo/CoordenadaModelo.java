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
public class CoordenadaModelo {
    private short punto;

    public CoordenadaModelo(short punto) {
        this.punto = punto;
    }

    public short getPunto() {
        return punto;
    }

    public void setPunto(short punto) {
        this.punto = punto;
    }
    
}
