package co.gov.minambiente.modelo;

/**
 *
 * @author marit
 */
public abstract class PersonModel {

    private String name;
    private String typeId;
    private String id;
    
    //Constructors
    
    public PersonModel(){
        
    }

    public PersonModel(String name, String typeId, String id) {
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    
}
