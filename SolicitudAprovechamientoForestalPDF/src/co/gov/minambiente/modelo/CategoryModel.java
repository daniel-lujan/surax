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
public abstract class CategoryModel{
    
    private String name;
    
    //Cosntructors
    
    public CategoryModel(){
        this.name = null;
    }
    
    public CategoryModel(String name) {
        this.name = name;
    }

    //Setters & getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
