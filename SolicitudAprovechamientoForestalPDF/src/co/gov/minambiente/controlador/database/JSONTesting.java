/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.minambiente.controlador.database;

import co.gov.minambiente.modelo.RequestModel;

/**
 *
 * @author daniel
 */
public class JSONTesting {
    public static void main(String[] args) {
        JSONController controller = new JSONController();
        RequestModel req = new RequestModel("123");
        RequestsDatabase.add(req);
        controller.saveRequestsDatabase();
        //controller.loadRequestsDatabase();
    }
}
