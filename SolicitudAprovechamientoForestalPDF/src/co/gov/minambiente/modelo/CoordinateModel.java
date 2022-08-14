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
public abstract class CoordinateModel {
    
    private final short POINT;
   
    //Cosntructor

    public CoordinateModel(short point) {
        this.POINT = point;
    } 
    
    //Setters & getters 

    public short getPOINT() {
        return POINT;
    }
    
}
