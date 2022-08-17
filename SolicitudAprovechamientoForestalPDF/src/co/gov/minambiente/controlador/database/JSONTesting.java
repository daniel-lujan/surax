/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.minambiente.controlador.database;

import co.gov.minambiente.modelo.AttorneyModel;
import co.gov.minambiente.modelo.InterestedModel;
import co.gov.minambiente.modelo.RequestModel;
import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class JSONTesting {
    public static void main(String[] args) {
        JSONController controller = new JSONController();
        RequestModel form1 = new RequestModel("1");
        ArrayList <String> a = new ArrayList<> ();
        a.add("1200000");
        a.add("Doce millones de pesos");
        
        InterestedModel interested = new InterestedModel("Natural",
                "Propietario", a, false, "bob_esponja@gmail.com", "304446985", "Bob Esponja", "cc", "1101760080");
        
        AttorneyModel attorney = new AttorneyModel("856413T", "Patricio Estrella",
                "CC", "552116447");
        
        interested.setAttorney(attorney);
        
        form1.setTypeRequest("nueva");
        form1.setInterested(interested);
        
        RequestsDatabase.add(form1);
        
        //controller.saveRequestsDatabase();
//        controller.loadRequestsDatabase();
        
    }
}
