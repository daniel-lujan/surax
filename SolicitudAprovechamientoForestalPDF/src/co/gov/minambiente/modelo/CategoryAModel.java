package co.gov.minambiente.modelo;

/**
 *
 * @author Andrés Güiza
 */
public class CategoryAModel extends CategoryModel {
    
    private String typeUtilization;
    private String MethodUtilization;

    //Constructors  
    public CategoryAModel(String name){
        super(name);
        this.MethodUtilization = null;
        this.typeUtilization = null;
    }

    public CategoryAModel(String typeUtilization, String MethodUtilization, String name) {
        super(name);
        this.typeUtilization = typeUtilization;
        this.MethodUtilization = MethodUtilization;
    }
    
    //Setters & getters

    public String getTypeUtilization() {
        return typeUtilization;
    }

    public void setTypeUtilization(String typeUtilization) {
        this.typeUtilization = typeUtilization;
    }

    public String getMethodUtilization() {
        return MethodUtilization;
    }

    public void setMethodUtilization(String MethodUtilization) {
        this.MethodUtilization = MethodUtilization;
    }

    @Override
    public void setName(String name) {
        super.setName(name); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
