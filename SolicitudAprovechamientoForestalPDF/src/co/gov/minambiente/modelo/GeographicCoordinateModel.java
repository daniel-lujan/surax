package co.gov.minambiente.modelo;

import java.util.ArrayList;

/**
 *y
 * @author Andrés Güiza
 */
public class GeographicCoordinateModel extends CoordinateModel {
    
    private final ArrayList<Object> LATITUDE; 
    private final ArrayList<Object> LONGITUDE;
    private final double ALTITUDE;
    private final String ORIGIN;
    
    //constructors 
    public GeographicCoordinateModel(ArrayList<Object> LATITUDE, ArrayList<Object> LONGITUDE, double ALTITUDE, String ORIGIN, short point) {
        super(point);
        this.LATITUDE = LATITUDE;
        this.LONGITUDE = LONGITUDE;
        this.ALTITUDE = ALTITUDE;
        this.ORIGIN = ORIGIN;
    }
    
    //Getters & setters

    public ArrayList<Object> getLATITUDE() {
        return LATITUDE;
    }

    public ArrayList<Object> getLONGITUDE() {
        return LONGITUDE;
    }

    public double getALTITUDE() {
        return ALTITUDE;
    }

    public String getORIGIN() {
        return ORIGIN;
    }

    @Override
    public short getPOINT() {
        return super.getPOINT(); //To change body of generated methods, choose Tools | Templates.
    }

}
