package co.gov.minambiente.controlador;

import co.gov.minambiente.modelo.DepartmentModel;
import co.gov.minambiente.modelo.RequestModel;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

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
    
    public LinkedList<String> cargarDepartamentos() throws IOException{
        LinkedList<DepartmentModel> departamentos = Utils.loadMunicipalities((new File("resources\\MunicipiosDepartamentosColombia.txt")));
        LinkedList<String> nombresDepartamentos = new LinkedList<>();
        for(DepartmentModel departamento : departamentos){
            nombresDepartamentos.add(departamento.getDEPARTMENTNAME());
        }
        return nombresDepartamentos;
    }
    
    public LinkedList<String> cargarMunicipios(String d) throws IOException{
        LinkedList<DepartmentModel> departamentos = Utils.loadMunicipalities((new File("resources\\MunicipiosDepartamentosColombia.txt")));
        for(DepartmentModel departamento : departamentos){
            if(departamento.getDEPARTMENTNAME().equals(d)){
                return departamento.getMUNICIPALITIES();
            }
        }
        return null;
    }
}
