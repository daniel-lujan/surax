/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.minambiente.modelo;

import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author marit
 */
public class RequestModel {
    
    private final Integer REFERENCE;
    private String typeRequest;
    private InterestedModel  interested;
    private LinkedList<PropertyModel> properties;
    private LinkedList<CategoryModel> categories;
    private boolean approved;
    private Date validity;
    
    //constructors

    public RequestModel(int reference){
        this.REFERENCE = reference;
        this.typeRequest = "";
        this.interested = new InterestedModel();
        this.properties = null;
        this.categories = null;
    }
    
    public RequestModel(int reference, String typeRequest, InterestedModel
            interested, LinkedList<PropertyModel> properties) {
        this.REFERENCE = reference;
        this.typeRequest = typeRequest;
        this.interested = interested;
        this.properties = properties;
    }
    
    public RequestModel(int reference, String typeRequest, InterestedModel
            interested, LinkedList<PropertyModel> properties, LinkedList<CategoryModel>
                    categories) {
        this.REFERENCE = reference;
        this.typeRequest = typeRequest;
        this.interested = interested;
        this.properties = properties;
        this.categories = categories;
    }
    
    //Getters & setters

    public String getTypeRequest() {
        return typeRequest;
    }

    public void setTypeRequest(String typeRequest) {
        this.typeRequest = typeRequest;
    }

    public InterestedModel getInterested() {
        return interested;
    }

    public void setInterested(InterestedModel interested) {
        this.interested = interested;
    }

    public LinkedList<PropertyModel> getProperties() {
        return properties;
    }

    public void addProperties(PropertyModel property) {
        this.properties.add(property);
    }

    public LinkedList<CategoryModel> getCategories() {
        return categories;
    }

    public void setCategories(LinkedList<CategoryModel> categories) {
        this.categories = categories;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public Date getValidity() {
        return validity;
    }

    public void setValidity(Date validity) {
        this.validity = validity;
    }

    public Integer getREFERENCE() {
        return REFERENCE;
    }

    
}
