package co.gov.minambiente.modelo;

import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author Andrés Güiza
 */
public class DepartmentModel{
    
    private final String DEPARTMENTNAME;
    private final LinkedList<String> MUNICIPALITIES;
    
    //Constructors
    
    public DepartmentModel(){
        this.DEPARTMENTNAME = new String();
        this.MUNICIPALITIES = new LinkedList<>();
    }
    
    public DepartmentModel(String departmentName){
        this.MUNICIPALITIES = new LinkedList<>();
        this.DEPARTMENTNAME = departmentName;
    }
    
    public DepartmentModel(String departmentName, LinkedList<String> MUNICIPALITIES){
        this.DEPARTMENTNAME = departmentName;
        this.MUNICIPALITIES = MUNICIPALITIES;
    }

    
    //Setters & getters

    public String getDEPARTMENTNAME() {
        return DEPARTMENTNAME;
    }

    public LinkedList<String> getMUNICIPALITIES() {
        return MUNICIPALITIES;
    }
    
    //toString() method
    @Override
    public String toString() {
        return "Department{" + "departmentName=" + DEPARTMENTNAME + ", MUNICIPALITIES=" + MUNICIPALITIES + '}';
    }
    
    
}
