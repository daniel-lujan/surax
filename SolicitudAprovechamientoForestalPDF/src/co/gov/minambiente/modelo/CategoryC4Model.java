package co.gov.minambiente.modelo;

/**
 *
 * @author Natalia García
 */
public class CategoryC4Model extends CategoryCModel{
    private boolean logging;
    private String activity;
    
    public CategoryC4Model(String locationOrType, String name) {
        super(locationOrType, name);
        this.logging = false;
        this.activity = "";
    }
    
    public CategoryC4Model(boolean logging, String activity, String locationOrType, String name) {
        super(locationOrType, name);
        this.logging = logging;
        this.activity = activity;
    }

    public boolean isLogging() {
        return logging;
    }

    public void setLogging(boolean logging) {
        this.logging = logging;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }
}
