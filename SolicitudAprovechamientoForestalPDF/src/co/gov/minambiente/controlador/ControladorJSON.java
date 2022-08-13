/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.minambiente.controlador;

import co.gov.minambiente.modelo.SolicitudModelo;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class ControladorJSON {
    private final String PATH = "./databases/solicitudes.json";
    private ObjectMapper om = new ObjectMapper();
    
    
    public void writeSolicitud(SolicitudModelo solicitud){
        try{
            om.writerWithDefaultPrettyPrinter().writeValue(new File(PATH),solicitud);
        } catch (java.io.IOException e){
            System.out.println(e);
        }
    }
    
    public void writeMultiple(SolicitudModelo solicitud){
        java.util.ArrayList<SolicitudModelo> lista = new java.util.ArrayList();
        lista.add(solicitud);
        lista.add(solicitud);
        try{
            om.writerWithDefaultPrettyPrinter().writeValue(new File(PATH),lista);
        } catch (java.io.IOException e){
            System.out.println(e);
        }
    }
    
    public ArrayList<SolicitudModelo> readSolicitudes() throws com.fasterxml.jackson.core.JsonProcessingException{
        ArrayList<SolicitudModelo> lista = new ArrayList();
        lista = new ObjectMapper().readerFor(ArrayList.class).readValue(PATH);
        return lista;
    }
}
