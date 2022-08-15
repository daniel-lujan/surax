package co.gov.minambiente.modelo;

import java.io.File;
import java.util.LinkedList;

/**
 *
 * @author Andrés Güiza
 */
public class BDModel {
    
    private LinkedList<RequestModel> requests;
    private File locationBD;
    
    //Cosntructor

    public BDModel() {
        requests = new LinkedList<>();
        this.locationBD = new File("dataBase\\bd.csv") ;
    }
    
    public BDModel(LinkedList<RequestModel> requests, File locationBD) {
        this.requests = requests;
        this.locationBD = locationBD;
    }

    public BDModel(RequestModel request, File locationBD) {
        this.requests = new LinkedList<>();
        this.requests.add(request);
        this.locationBD = locationBD;
    }
    
    
    
    //Getters & setters

    public LinkedList<RequestModel> getRequests() {
        return requests;
    }

    public void setRequests(LinkedList<RequestModel> requests) {
        this.requests = requests;
    }

    public File getLocationBD() {
        return locationBD;
    }

    public void setLocationBD(File locationBD) {
        this.locationBD = locationBD;
    }
    
    
    //Methods
    
    public void addRequest(){
        
    }
    
    
}
