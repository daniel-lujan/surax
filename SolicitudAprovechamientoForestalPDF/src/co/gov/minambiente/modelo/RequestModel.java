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

    private final String REFERENCE;
    private String typeRequest;
    private InterestedModel interested;
    private LinkedList<PropertyModel> properties;
    private String howToAcquire;
    private CategoryAModel categoryA = new CategoryAModel();
    private CategoryBModel categoryB = new CategoryBModel();
    private CategoryCModel categoryC = new CategoryCModel();
    private CategoryDModel categoryD = new CategoryDModel();
    private boolean approved;
    private Date creationDate;
    private String fileNumber;
    private String actNumber;
    private String intendedUse;

    //constructors
    public RequestModel(String reference) {
        this.REFERENCE = reference;
        this.typeRequest = "";
        this.interested = new InterestedModel();
        this.properties = new LinkedList<>();
        this.howToAcquire = "";
        this.fileNumber = "";
        this.actNumber = "";
        this.intendedUse = "";
    }

    public RequestModel(String reference, String typeRequest, InterestedModel interested, LinkedList<PropertyModel> properties) {
        this.REFERENCE = reference;
        this.typeRequest = typeRequest;
        this.interested = interested;
        this.properties = properties;
        this.howToAcquire = "";
        this.fileNumber = "";
        this.actNumber = "";
        this.intendedUse = "";
    }

    public RequestModel(String reference, String typeRequest, InterestedModel interested, LinkedList<PropertyModel> properties, 
            String howToAcquire, String intendedUse, String fileNumber, String actNumber) {
        this.REFERENCE = reference;
        this.typeRequest = typeRequest;
        this.interested = interested;
        this.properties = properties;
        this.howToAcquire = howToAcquire;
        this.fileNumber = fileNumber;
        this.actNumber = actNumber;
        this.intendedUse = intendedUse;
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

    public String getHowToAcquire() {
        return howToAcquire;
    }

    public void setHowToAcquire(String howToAcquire) {
        this.howToAcquire = howToAcquire;
    }

    public CategoryAModel getCategoryA() {
        return categoryA;
    }

    public void setCategoryA(CategoryAModel categoryA) {
        this.categoryA = categoryA;
    }

    public CategoryBModel getCategoryB() {
        return categoryB;
    }

    public void setCategoryB(CategoryBModel categoryB) {
        this.categoryB = categoryB;
    }

    public CategoryCModel getCategoryC() {
        return categoryC;
    }

    public void setCategoryC(CategoryCModel categoryC) {
        this.categoryC = categoryC;
    }

    public CategoryDModel getCategoryD() {
        return categoryD;
    }

    public void setCategoryD(CategoryDModel categoryD) {
        this.categoryD = categoryD;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public Date getcreationDate() {
        return creationDate;
    }

    public void setcreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getREFERENCE() {
        return REFERENCE;
    }

    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    public String getActNumber() {
        return actNumber;
    }

    public void setActNumber(String actNumber) {
        this.actNumber = actNumber;
    }

    public String getIntendedUse() {
        return intendedUse;
    }

    public void setIntendedUse(String intendedUse) {
        this.intendedUse = intendedUse;
    }

}
