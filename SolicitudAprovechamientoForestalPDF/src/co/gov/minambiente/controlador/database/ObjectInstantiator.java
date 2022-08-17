/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.minambiente.controlador.database;

import co.gov.minambiente.modelo.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;

/**
 *
 * @author daniel
 */
class ObjectInstantiator {
    
    private final LinkedHashMap hm;
    
    ObjectInstantiator(LinkedHashMap hm){
        this.hm = hm;
    }
    
    RequestModel getRequestInstance(){
        return new RequestModel(
                (String)hm.get("reference"),
                (String)hm.get("typeRequest"),
                getInterestedInstance((LinkedHashMap)hm.get("interested")),
                getPropertiesList((ArrayList)hm.get("properties")),
                (String)hm.get("howToAcquire"),
                getCategoriesList((ArrayList)hm.get("categories")),
                (String)hm.get("intendedUse"),
                (String)hm.get("fileNumber"),
                (String)hm.get("actNumber")
        );
    }
    
    private InterestedModel getInterestedInstance(LinkedHashMap info){
        return new InterestedModel(
                (String)info.get("typePerson"),
                getAttorney((LinkedHashMap)info.get("attorney")),
                (String)info.get("interestedQuality"),
                (ArrayList)info.get("projectCost"),
                (boolean)info.get("authorization"),
                (String)info.get("emailAdress"),
                (String)info.get("telephone")
        );
    }
    
    private AttorneyModel getAttorney(LinkedHashMap info){
        return new AttorneyModel(
                (String)info.get("profesionalCard"),
                (String)info.get("name"),
                (String)info.get("typeId"),
                (String)info.get("id")
        );
    }
    
    private LinkedList<PropertyModel> getPropertiesList(ArrayList<LinkedHashMap> info){
        LinkedList<PropertyModel> properties = new LinkedList();
        for (LinkedHashMap pHm : info){
            properties.add(getPropertyInstance(pHm));
        }
        return properties;
    }
    
    private PropertyModel getPropertyInstance(LinkedHashMap info){
        // instantiate PropertyModel() according to info
        
        return null;
    }
    
    private AddressModel getAddress(LinkedHashMap info){
        // instantiate AddressModel() according to info
        return null;
    }
    
    private ArrayList<SpecieModel> getSpeciesList(ArrayList<LinkedHashMap> info){
        ArrayList<SpecieModel> species = new ArrayList();
        info.forEach((sHm) -> {
            species.add(getSpecieInstance(sHm));
        });
        return species;
    }
    
    private SpecieModel getSpecieInstance(LinkedHashMap info){
        // instantiate SpecieModel() according to info
        return null;
    }
    
    private ArrayList<CoordinateModel> getCoordinatesList(ArrayList<LinkedHashMap> info){
        ArrayList<CoordinateModel> coordinates = new ArrayList();
        
        final boolean plane;
        if (info.size() > 0){
            plane = info.get(0).keySet().toArray()[1].equals("x");
        } else{
            plane = false; // Just initializing
        }
        info.forEach((cHm) -> {
            if (plane){
                coordinates.add(getPlaneCoordinateInstance(cHm));
            } else{
                coordinates.add(getGeographicCoordinateInstance(cHm));
            }
        });
        
        return coordinates;
    }
    
    private PlaneCoordinateModel getPlaneCoordinateInstance(LinkedHashMap info){
        // instance PlaneCoordinateModel() according to info
        return null;
    }
    
    private GeographicCoordinateModel getGeographicCoordinateInstance(LinkedHashMap info){
        // instance GeographicCoordinateModel() according to info
        return null;
    }
    
    private LinkedList<CategoryModel> getCategoriesList(ArrayList<LinkedHashMap> info){
        LinkedList<CategoryModel> categories = new LinkedList();
        info.forEach((pHm) -> {
            categories.add(getCategoryInstance(pHm));
        });
        return categories;
    }
    
    private CategoryModel getCategoryInstance(LinkedHashMap info){
        String[] keys = (String[])info.keySet().toArray();
        CategoryModel category = null;
        if (keys.length > 1){
            switch (keys[1]) {
                case "typeUtilizationA":
                    //instantiate CategoryA
                    break;
                case "typeOperation":
                    // instantiate CategoryB
                    break;
                case "individualStatusC1":
                    // instantiate CategoryC1
                    break;
                case "loggingC3":
                    // instantiate CategoryC3
                    break;
                case "loggingC4":
                    // instantiate CategoryC4
                    break;
                default:
                    // instantiate Category D
                    break;
            }
        } else {
            // instantiate CategoryC2
        }
        return category;
    }

    
    
    
}
