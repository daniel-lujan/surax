/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.minambiente.modelo;

import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author marit
 */
public class InterestedModel extends PersonModel {
    
    private String typePerson;
    private LinkedList<Integer> requests;
    private AttorneyModel attorney;
    private String interestedQuality;
    private HashMap<Integer,String> projectCost;
    private boolean authorization;
    private String emailAdress;
    private int telephone;
    private AdressModel adress;
    
    //Constructors

    public InterestedModel(){
        super();
        this.typePerson = null;
        this.requests = new LinkedList();
        this.attorney = null;
        this.interestedQuality = null;
        this.projectCost = new HashMap<>();
        this.authorization = false;
        this.emailAdress = null;
        this.telephone = 0;
        this.adress = new AdressModel();
    }

    public InterestedModel(String typePerson, LinkedList<Integer> requests,
            String interestedQuality, HashMap<Integer, String> projectCost,
            boolean authorization, String emailAdress,int telephone) {

        this.typePerson = typePerson;
        this.requests = requests;
        this.attorney = null;
        this.interestedQuality = interestedQuality;
        this.projectCost = projectCost;
        this.authorization = authorization;
        this.emailAdress = emailAdress;
        this.telephone = telephone;
    }

    public InterestedModel(String typePerson, LinkedList<Integer> requests,
           String interestedQuality, HashMap<Integer,String> projectCost,
           boolean authorization, String emailAdress, int telephone, 
           String name, String typeId, int id) {

        super(name, typeId, id);
        this.typePerson = typePerson;
        this.requests = requests;
        this.attorney = null;
        this.interestedQuality = interestedQuality;
        this.projectCost = projectCost;
        this.authorization = authorization;
        this.emailAdress = emailAdress;
        this.telephone = telephone;
    }

    //Getters & setters
    public String getTypePerson() {
        return typePerson;
    }

    public void setTypePerson(String typePerson) {
        this.typePerson = typePerson;
    }

    public LinkedList<Integer> getRequests() {
        return requests;
    }

    public void setRequests(LinkedList<Integer> requests) {
        this.requests = requests;
    }

    public String getInterestedQuality() {
        return interestedQuality;
    }

    public void setInterestedQuality(String interestedQuality) {
        this.interestedQuality = interestedQuality;
    }

    public AttorneyModel getAttorney() {
        return attorney;
    }

    public void setAttorney(AttorneyModel attorney) {
        this.attorney = attorney;
    }

    public HashMap<Integer, String> getProjectCost() {
        return projectCost;
    }

    public void setProjectCost(HashMap<Integer, String> projectCost) {
        this.projectCost = projectCost;
    }

    public boolean isAuthorization() {
        return authorization;
    }

    public void setAuthorization(boolean authorization) {
        this.authorization = authorization;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public AdressModel getAdress() {
        return adress;
    }

    public void setAdress(AdressModel adress) {
        this.adress = adress;
    }

    @Override
    public void setId(int id) {
        super.setId(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getId() {
        return super.getId(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTypeId(String typeId) {
        super.setTypeId(typeId); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTypeId() {
        return super.getTypeId(); //To change body of generated methods, choose Tools | Templates.
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
