/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.minambiente.modelo;

/**
 *
 * @author marit
 */
class AttorneyModel extends PersonModel {
    
    private int profesionalCard;
    
    //Constructors
    
    public AttorneyModel(){
        this.profesionalCard = 0;
    }

    public AttorneyModel(int profesionalCard) {
        this.profesionalCard = profesionalCard;
    }

    public AttorneyModel(int profesionalCard, String name, String typeId, long id) {
        super(name, typeId, id);
        this.profesionalCard = profesionalCard;
    }
    
    //Getters & setters

    public int getProfesionalCard() {
        return profesionalCard;
    }

    public void setProfesionalCard(int profesionalCard) {
        this.profesionalCard = profesionalCard;
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
