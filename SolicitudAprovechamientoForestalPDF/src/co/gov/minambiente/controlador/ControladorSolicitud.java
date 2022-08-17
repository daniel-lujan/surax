package co.gov.minambiente.controlador;

import co.gov.minambiente.modelo.AddressModel;
import co.gov.minambiente.modelo.DepartmentModel;
import co.gov.minambiente.modelo.RequestModel;
import co.gov.minambiente.modelo.AttorneyModel;
import co.gov.minambiente.modelo.CategoryAModel;
import co.gov.minambiente.modelo.CategoryBModel;
import co.gov.minambiente.modelo.CategoryCModel;
import co.gov.minambiente.modelo.CategoryDModel;
import co.gov.minambiente.modelo.CategoryModel;
import co.gov.minambiente.modelo.PropertyModel;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Natalia García
 */
public class ControladorSolicitud {

    private RequestModel request = new RequestModel(1);

    public void guardarInformacionSeccion1(String tipoSolicitud, String tipoPersonaInteresado, String nombreInteresado, String tipoIdInteresado,
            String numeroIdInteresado, boolean aplicaApoderado, String nombreApoderado, String tipoIdApoderado, String numeroIdApoderado, 
            String TPApoderado, String calidad, String otro, String tipoPredio, boolean aplicaCosto, String costo, String costoLetras) {
        request.setTypeRequest(tipoSolicitud);
        request.getInterested().setTypePerson(tipoPersonaInteresado);
        request.getInterested().setName(nombreInteresado);
        request.getInterested().setTypeId(tipoIdInteresado);
        request.getInterested().setId(Long.parseLong(numeroIdInteresado));
        
        if(aplicaApoderado){
            request.getInterested().setAttorney(new AttorneyModel(TPApoderado, nombreApoderado, tipoIdApoderado, Long.parseLong(numeroIdApoderado)));
        }
        
        if(calidad.equals("Otro")){
            request.getInterested().setInterestedQuality(otro);
        } else {
            request.getInterested().setInterestedQuality(calidad);
        }
        
        request.addProperties(new PropertyModel(tipoPredio));
        
        if(aplicaCosto){
            ArrayList<String> cost = new ArrayList<>();
            cost.add(costo);
            cost.add(costoLetras);
            request.getInterested().setProjectCost(cost);
        }
    }
    
    public void guardarInformacionSeccion2(String numeroExpediente, String numeroActo) {
        request.setFileNumber(Integer.parseInt(numeroExpediente));
        request.setActNumber(Integer.parseInt(numeroActo));
    }

    public void guardarInformacionSeccion3(String terrenosDominio, LinkedList<String> categorias, String tipoAprovechamientoA, String claseManejo, 
            String ingresos, String ingresosLetras, String categoriaAsociada, String tipoAprovechamientoD) {
        request.setHowToAcquire(terrenosDominio);
        ArrayList<CategoryModel> categoriasModelo = new ArrayList<>();
        for(String categoria : categorias){
            switch (categoria){
                case "A":
                    categoriasModelo.add(new CategoryAModel(tipoAprovechamientoA, "Productos forestales maderables"));
                    break;
                case "B":
                    ArrayList<String> revenues = new ArrayList<>();
                    revenues.add(ingresos);
                    revenues.add(ingresosLetras);
                    categoriasModelo.add(new CategoryBModel(claseManejo, revenues, categoriaAsociada, "Manejo Sostenible de Flora Silvestre y los Productos Forestales No Maderables"));
                    break;
                case "C":
                    categoriasModelo.add(new CategoryCModel("Árboles Aislados"));
                    break;
                case "D":
                    categoriasModelo.add(new CategoryDModel(tipoAprovechamientoD, "Guaduales y bambusales"));
                    break;
            }
        }
    }

    public void guardarInformacionSeccion4_1(String nombre, String superficie, String direccion, String tipo, String departamento, 
            String municipio, String vereda, String matriculaInmobiliaria, String cedulaCatastral) {
        LinkedList<PropertyModel> properties = request.getProperties();
        for(PropertyModel property : properties){
            property.setName(nombre);
            property.setSurface(superficie);
            property.setAdress(new AddressModel(direccion, tipo, departamento, municipio, vereda));
            property.setRealEstateRegistration(matriculaInmobiliaria);
            property.setCadastralIdNumber(cedulaCatastral);
        }
    }

    public void guardarInformacionSeccion4_2() {

    }

    public void guardarInformacionSeccion5_1() {

    }

    public void guardarInformacionSeccion5_2() {

    }

    public void guardarInformacionSeccion6() {

    }
    
    public String getTypeProperty(){
        LinkedList<PropertyModel> propertys = request.getProperties();
        return propertys.getFirst().getTypeProperty();
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

    private static class LinkedLink<T> {

        public LinkedLink() {
        }
    }
}
