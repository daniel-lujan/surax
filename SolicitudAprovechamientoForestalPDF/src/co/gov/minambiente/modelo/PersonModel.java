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
public abstract class PersonModel {

    private String name;
    private String typeId;
    private int id;
    
    //Constructors
    
    public PersonModel(){
        
    }

    public PersonModel(String name, String typeId, int id) {
        this.name = name;
        this.typeId = typeId;
        this.id = id;
    }
    
    //Setters & getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
