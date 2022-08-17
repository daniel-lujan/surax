package co.gov.minambiente.modelo;

/**
 *
 * @author Natalia García
 */
public class CategoryDModel extends CategoryModel{
    private String typeUtilization;

    public CategoryDModel(String name) {
        super(name);
        this.typeUtilization = "";
    }
    
    public CategoryDModel(String typeUtilization, String name) {
        super(name);
        this.typeUtilization = typeUtilization;
    }

    public String getTypeUtilization() {
        return typeUtilization;
    }

    public void setTypeUtilization(String typeUtilization) {
        this.typeUtilization = typeUtilization;
    }
}
