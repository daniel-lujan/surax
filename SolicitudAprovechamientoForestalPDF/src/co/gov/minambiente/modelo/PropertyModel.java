/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.minambiente.modelo;

import java.util.LinkedList;

/**
 *
 * @author marit
 */
public class PropertyModel {
    
    private String typeProperty;
    private String name;
    private String surface;
    private AdressModel adress;
    private String realStateRegistration;
    private String cadastralIdNumber;
    private LinkedList<CoordinateModel> coordiantes;
    private LinkedList<SpecieModel> species;
    
    //Constructors
    
    public PropertyModel(){
        this.typeProperty = "";
        this.name = "";
        this.surface = "";
        this.adress = new AdressModel();
        this.realStateRegistration = "";
        this.cadastralIdNumber = "";
        this.coordiantes = new LinkedList<>();
        this.species = new LinkedList<>();
    }
    
    public PropertyModel(String typeProperty){
        this.typeProperty = typeProperty;
        this.name = "";
        this.surface = "";
        this.adress = new AdressModel();
        this.realStateRegistration = "";
        this.cadastralIdNumber = "";
        this.coordiantes = new LinkedList<>();
        this.species = new LinkedList<>();
    }
  
    public PropertyModel(String typeProperty, String name, String surface, 
            AdressModel adress, String realStateRegistration, String cadastralIdNumber,
            LinkedList<CoordinateModel> coordiantes, LinkedList<SpecieModel> species) {
        this.typeProperty = typeProperty;
        this.name = name;
        this.surface = surface;
        this.adress = adress;
        this.realStateRegistration = realStateRegistration;
        this.cadastralIdNumber = cadastralIdNumber;
        this.coordiantes = coordiantes;
        this.species = species;
    }
    
    //Setters & getters

    public String getTypeProperty() {
        return typeProperty;
    }

    public void setTypeProperty(String typeProperty) {
        this.typeProperty = typeProperty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public AdressModel getAdress() {
        return adress;
    }

    public void setAdress(AdressModel adress) {
        this.adress = adress;
    }

    public String getRealStateRegistration() {
        return realStateRegistration;
    }

    public void setRealStateRegistration(String realStateRegistration) {
        this.realStateRegistration = realStateRegistration;
    }

    public String getCadastralIdNumber() {
        return cadastralIdNumber;
    }

    public void setCadastralIdNumber(String cadastralIdNumber) {
        this.cadastralIdNumber = cadastralIdNumber;
    }

    public LinkedList<CoordinateModel> getCoordiantes() {
        return coordiantes;
    }

    public void setCoordiantes(LinkedList<CoordinateModel> coordiantes) {
        this.coordiantes = coordiantes;
    }

    public LinkedList<SpecieModel> getSpecies() {
        return species;
    }

    public void setSpecies(LinkedList<SpecieModel> species) {
        this.species = species;
    }
    
    
    
    
}
