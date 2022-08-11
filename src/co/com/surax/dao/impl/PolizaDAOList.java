/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.surax.dao.impl;

import co.com.surax.modelo.Poliza;
import co.com.surax.modelo.SeguroDeVida;
import co.com.surax.modelo.SeguroVehicular;
import co.com.surax.modelo.SeguroEstudiantil;

import java.util.ArrayList;

/**
 *
 * @author daniel
 */

public class PolizaDAOList implements co.com.surax.dao.PolizaDAO{
    private ArrayList<Poliza> polizasDB;

    public PolizaDAOList() {
        this.polizasDB = new ArrayList();
    }
    @Override
    public boolean almacenarPoliza(Poliza poliza){
        return polizasDB.add(poliza);
    }
    
    @Override
    public Poliza consultarPoliza(String id){
        int idx = getIndex(id);
        if (idx != -1) {
            return polizasDB.get(idx);
        } else {
            return null;
        }
    }
    
    public int getIndex(String id){
        int size = polizasDB.size();
        for (int i = 0; i<size;i++){
            if (polizasDB.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public Poliza consultarPoliza(int index){
        return polizasDB.get(index);
    }
    
    @Override
    public boolean actualizarPoliza(String id, Poliza nueva_poliza){
        int idx = getIndex(id);
        if (idx != -1){
            polizasDB.add(idx, nueva_poliza);
            return true;
        } else{
            return false;
        }
    }
    
    @Override
    public boolean eliminarPoliza(String id){
        int idx = getIndex(id);
        if (idx != -1){
            polizasDB.remove(idx);
            return true;
        }else {
            return false;
        }
    }
    @Override
    public java.util.ArrayList getDB(){
        return polizasDB;
    }
    
    @Override
    public String getRandomID(){
        String id;
        int size = polizasDB.size();
        boolean valid = true;
        while (true){
            id = Double.toString(Math.random()).substring(2, 2+ID_LENGTH);
            for (int i = 0; i < size; i++){
                if (polizasDB.get(i).getId().equals(id)){
                    valid = false;
                    break;
                }
            }
            if (valid){
                return id;
            }
        }
    }
}
