/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.surax.controlador.database;

import java.io.File;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daniel
 */
public class Test {

    public static ObjectMapper om = new ObjectMapper();

    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        lista.add(new Test2("fakjbe"));
        lista.add(new Test2("ajkfeb"));
        load();

    }

    public static void load() {
        try {
            Object[] lista = om.readValue(new File("./databases/test.json"), Object[].class);
            for (Object o : lista){System.out.println(o);}
        } catch (com.fasterxml.jackson.core.JsonProcessingException e) {
            System.out.println(e);
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void save(Object[] lista) {
        try {
            om.writerWithDefaultPrettyPrinter().writeValue(new File("./databases/test.json"), lista);
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
