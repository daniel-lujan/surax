package co.com.surax.controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import co.com.surax.modelo.*;

/**
 *
 * @author daniel
 */
public class ControlPoliza {
    private static co.com.surax.dao.impl.PolizaDAOList polizaDAO = new co.com.surax.dao.impl.PolizaDAOList();
    
    public static boolean crearVehicular(Persona tomador, Persona asegurado, Persona beneficiario, Vehiculo vehiculo){
        
        SeguroVehicular sv = new SeguroVehicular(polizaDAO.getRandomID(),tomador,asegurado,beneficiario,vehiculo);
        
        return polizaDAO.almacenarPoliza(sv);
    }
    
    public static boolean crearDeVida(){
        return true;
    }
    
    public boolean crearEstudiantil(){
        return true;
    }
    
    
    
}
