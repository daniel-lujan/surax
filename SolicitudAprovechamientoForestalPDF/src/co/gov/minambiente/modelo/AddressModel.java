package co.gov.minambiente.modelo;

/**
 *
 * @author marit
 */
public class AddressModel {
    
    private String street;
    private String typeArea;
    private DepartmentModel department;
    private String sidewalk;

    //Constructors 
    public AddressModel(){
        this.street = "";
        this.typeArea = "";
        this.department = new DepartmentModel();
        this.sidewalk = "";
    }
    
    public AddressModel(String street, String typeArea, DepartmentModel department){
        this.street = street;
        this.typeArea = typeArea;
        this.department = department;
        this.sidewalk = null;
    }
    
    public AddressModel(String street, String typeArea, DepartmentModel department, String sidewalk) {
        this.street = street;
        this.typeArea = typeArea;
        this.department = department;
        this.sidewalk = sidewalk;
    }
    
    
    //Setters & getters

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTypeArea() {
        return typeArea;
    }

    public void setTypeArea(String typeArea) {
        this.typeArea = typeArea;
    }

    public DepartmentModel getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentModel department) {
        this.department = department;
    }

    public String getSidewalk() {
        return sidewalk;
    }

    public void setSidewalk(String sidewalk) {
        this.sidewalk = sidewalk;
    }
    

}
