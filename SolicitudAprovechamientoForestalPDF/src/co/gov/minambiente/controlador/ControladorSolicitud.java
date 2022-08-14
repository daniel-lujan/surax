package co.gov.minambiente.controlador;

import co.gov.minambiente.modelo.RequestModel;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Natalia García
 */
public class ControladorSolicitud {

    private RequestModel solicitud;
    private String idSolicitud = "0";

    public void guardarInformacionSeccion1(String tipoSolicitud, String tipoPersonaInteresado, String nombreInteresado, String tipoIdInteresado,
            String numeroIdInteresado, boolean aplicaApoderado, String nombreApoderado, String tipoIdApoderado, String numeroIdApoderado, 
            String TPApoderado, String calidad, String otro, String tipoPredio, boolean aplicaCosto, String costo, String costoLetras) {
       
    }
    
    public void guardarInformacionSeccion2() {

    }

    public void guardarInformacionSeccion3() {

    }

    public void guardarInformacionSeccion4_1() {

    }

    public void guardarInformacionSeccion4_2() {

    }

    public void guardarInformacionSeccion5_1() {

    }

    public void guardarInformacionSeccion5_2() {

    }

    public void guardarInformacionSeccion6() {

    }

    public boolean validarNumeros(String s) {
        Pattern patron = Pattern.compile("[a-zA-Z]");
        Matcher matcher = patron.matcher(s);
        return matcher.find();
    }
}
