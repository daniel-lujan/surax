package co.gov.minambiente.modelo;

/**
 *
 * @author Andrés Güiza
 */
public class PlaneCoordinateModel extends CoordinateModel{
    
    private final double X;
    private final double Y;

    //Cosntructors
    public PlaneCoordinateModel(double x, double y, short point) {
        super(point);
        this.X = x;
        this.Y = y;
    }

    //Setters & getters
    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    @Override
    public short getPOINT() {
        return super.getPOINT(); 
    }
    
}
