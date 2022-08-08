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
public class GuadualBambusalModelo extends ProductoModelo {
    private short tipo;

    public GuadualBambusalModelo(short tipo) {
        this.tipo = tipo;
    }

    public short getTipo() {
        return tipo;
    }

    public void setTipo(short tipo) {
        this.tipo = tipo;
    }
    
}
