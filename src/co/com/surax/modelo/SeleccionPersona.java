/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.surax.modelo;

/**
 *
 * @author daniel
 */


public class SeleccionPersona {
    private Persona seleccion;
    private Metodo metodo;
    
    public SeleccionPersona(){
        
    }
    
    public SeleccionPersona(Persona seleccion){
        this.seleccion = seleccion;
    }
    
    public Persona getSeleccion(){
        return this.seleccion;
    }
    
    public void setSeleccion(Persona seleccion){
        this.seleccion = seleccion;
    }
    
    public Metodo getMetodo(){
        return this.metodo;
    }
    
    public void setMetodo(Metodo metodo){
        this.metodo = metodo;
    }
    
    public void runMetodo(){
        if (this.metodo == null){
            return;
        }
        this.metodo.run(seleccion);
    }
}
