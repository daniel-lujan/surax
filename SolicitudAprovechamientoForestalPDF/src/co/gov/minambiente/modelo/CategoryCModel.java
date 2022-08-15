package co.gov.minambiente.modelo;

/**
 *
 * @author Natalia García
 */
public class CategoryCModel extends CategoryModel{
    private String locationOrType;
    
    public CategoryCModel(String name) {
        super(name);
        this.locationOrType = "";
    }
    
    public CategoryCModel(String locationOrType, String name) {
        super(name);
        this.locationOrType = locationOrType;
    }

    public String getLocationOrType() {
        return locationOrType;
    }

    public void setAdquisitionMode(String locationOrType) {
        this.locationOrType = locationOrType;
    }
}
