package co.gov.minambiente.modelo;

/**
 *
 * @author marit
 */
public abstract class CoordinateModel {
    
    private final short POINT;
   
    //Cosntructor

    public CoordinateModel(short point) {
        this.POINT = point;
    } 
    
    //Setters & getters 

    public short getPOINT() {
        return POINT;
    }
    
}
