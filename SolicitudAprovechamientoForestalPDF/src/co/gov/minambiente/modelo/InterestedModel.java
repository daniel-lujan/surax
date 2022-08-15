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
    private long telephone;
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
            boolean authorization, String emailAdress,long telephone) {

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
           boolean authorization, String emailAdress, long telephone, 
           String name, String typeId, long id) {

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
    
        public InterestedModel(String typePerson, int requestReference,
           String interestedQuality, HashMap<Integer,String> projectCost,
           boolean authorization, String emailAdress, long telephone, 
           String name, String typeId, long id) {

        super(name, typeId, id);
        this.typePerson = typePerson;
        this.requests = new LinkedList<>();
        this.requests.add(requestReference);
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

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public AdressModel getAdress() {
        return adress;
    }

    public void setAdress(AdressModel adress) {
        this.adress = adress;
    }

    @Override
    public void setId(long id) {
        super.setId(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long getId() {
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
