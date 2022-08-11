/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.surax.controlador;

import co.com.surax.modelo.Persona;
import co.com.surax.modelo.PersonaNatural;
import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class StaticController {
        /**
     * Transforma una serie de datos, en un arreglo de String descriptivo
     * de cada elemento.
     * @param personas Base de datos (completa o parcial)
     * @return Arreglo descriptivo.
     */
    public static String[] toStringArray(Persona[] personas){
        String[] arr = new String[personas.length];
        Persona p;
        for (int i = 0; i<personas.length;i++){
            p = personas[i];
            if (p instanceof PersonaNatural){
                arr[i] = "Natural - "+p.getTipoId()+" "+p.getId()+" - "+p.getNombre()+" ";
            } else {
                arr[i] = "Jurídica - "+p.getTipoId()+" "+p.getId()+" - "+p.getNombre()+" ";
            }
        }
        return arr;
    }
        /**
     * Transforma un ArrayList en un arreglo de Personas.
     * @param lista Base de datos (o lista) a transformar.
     * @return Arreglo con los datos de la lista.
     */
    public static Persona[] listToArray(ArrayList<Persona> lista) {
        Persona[] array = new Persona[lista.size()];
        for (int i = 0; i<lista.size(); i++){
            array[i] = lista.get(i);
        }
        return array;
    }
    
    
}
