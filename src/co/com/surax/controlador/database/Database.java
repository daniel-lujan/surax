/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.surax.controlador.database;

/**
 *
 * @author daniel
 */
public interface Database {
    boolean store(Object object);
    Object find(Object id);
    Object find(int index);
    boolean update(Object id, Object newObject);
    boolean delete(Object id);
    int getDBSize();
    java.util.ArrayList<Object> getDB();
}
