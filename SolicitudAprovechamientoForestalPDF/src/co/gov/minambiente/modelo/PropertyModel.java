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
    private AddressModel adress;
    private String realEstateRegistration;
    private String cadastralIdNumber;
    private LinkedList<CoordinateModel> coordiantes;
    private LinkedList<SpecieModel> species;
    
    //Constructors
    
    public PropertyModel(){
        this.typeProperty = "";
        this.name = "";
        this.surface = "";
        this.adress = new AddressModel();
        this.realEstateRegistration = "";
        this.cadastralIdNumber = "";
        this.coordiantes = new LinkedList<>();
        this.species = new LinkedList<>();
    }
    
    public PropertyModel(String typeProperty){
        this.typeProperty = typeProperty;
        this.name = "";
        this.surface = "";
        this.adress = new AddressModel();
        this.realEstateRegistration = "";
        this.cadastralIdNumber = "";
        this.coordiantes = new LinkedList<>();
        this.species = new LinkedList<>();
    }
  
    public PropertyModel(String typeProperty, String name, String surface, 
            AddressModel adress, String realEstateRegistration, String cadastralIdNumber,
            LinkedList<CoordinateModel> coordiantes, LinkedList<SpecieModel> species) {
        this.typeProperty = typeProperty;
        this.name = name;
        this.surface = surface;
        this.adress = adress;
        this.realEstateRegistration = realEstateRegistration;
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

    public AddressModel getAdress() {
        return adress;
    }

    public void setAdress(AddressModel adress) {
        this.adress = adress;
    }

    public String getRealEstateRegistration() {
        return realEstateRegistration;
    }

    public void setRealEstateRegistration(String realEstateRegistration) {
        this.realEstateRegistration = realEstateRegistration;
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
