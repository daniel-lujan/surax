/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.surax.dao;

import co.com.surax.modelo.Poliza;

/**
 *
 * @author daniel
 */
public interface PolizaDAO {
    short ID_LENGTH = 10;
    boolean almacenarPoliza(Poliza poliza);
    Poliza consultarPoliza(String id);
    Poliza consultarPoliza(int index);
    boolean actualizarPoliza(String id, Poliza nueva_poliza);
    boolean eliminarPoliza(String id);
    java.util.ArrayList getDB();
    String getRandomID();
}
