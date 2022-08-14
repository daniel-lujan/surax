/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.minambiente.modelo;

/**
 *
 * @author Andrés Güiza
 */
public class CategoryAModel extends CategoryModel {
    
    private String typeUtilization;
    private String MethodUtilization;

    //Cosntructors  
    public CategoryAModel(){
        this.MethodUtilization = null;
        this.typeUtilization = null;
    }
    
    public CategoryAModel(String typeUtilization, String MethodUtilization) {
        this.typeUtilization = typeUtilization;
        this.MethodUtilization = MethodUtilization;
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
