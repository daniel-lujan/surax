/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.minambiente.controlador;

import co.gov.minambiente.modelo.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daniel.lujan
 */
public class TestJSON {
    public static void main(String[] args){
        NuevaModelo solicitud = new NuevaModelo();
        solicitud.setId("123");
        solicitud.setFecha("8/8/22");
        PersonaModelo interesado = new PersonaModelo();
        interesado.setTipo((short)1);
        interesado.setTipoId("CC");
        interesado.setId("1234567890");
        interesado.setNombre("Persona1");
        solicitud.setInteresado(interesado);
        NotificacionModelo not = new NotificacionModelo(true,"xample@gmail.com","1234567","Calle 1",
                    "Ciudad","Vereda","Departamento","NombrePersona");
        solicitud.setNotificacion(not);
        ActividadModelo act = new ActividadModelo();
        act.setCosto(90500);
        act.setCostoLetras("CostoLetras");
        act.setUso("Uso");
        act.setAdquisicionDerecho((short)1);
        act.setMetodoAprovechamiento((short)1);
        solicitud.setActividad(act);
        act.setProducto(new MaderableModelo((short)1));
        act.getEspecies().add(new EspecieModelo(2,"kg", "comun", "100tifiko","Fruto","Arbusto","Regional","Ninguna"));
        act.setArbolesAislados(new DentroDeBosqueModelo("Caído por Causas Naturales"));
        solicitud.setActividad(act);
        PredioModelo predio = new PredioModelo((short)1, (short)1, 20, true, "DepartamentoP", "MunicipioP",
                "VeredaP", "MatInmob", "CedCat");
        predio.getCoordenadas().add(new CoordenadaPlanaModelo(123,431));
        solicitud.setPredio(predio);
        
        try {
            //new ControladorJSON().writeMultiple(solicitud);
            ArrayList lista = new ControladorJSON().readSolicitudes();
        } catch (JsonProcessingException ex) {
            Logger.getLogger(TestJSON.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}