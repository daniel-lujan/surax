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
public class MaderableModelo{
    private short tipo;

    public MaderableModelo() {
    }

    public MaderableModelo(short tipo) {
        this.tipo = tipo;
    }

    public short getTipo() {
        return tipo;
    }

    public void setTipo(short tipo) {
        this.tipo = tipo;
    }
    
}
