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
import co.gov.minambiente.vista.formulario.Seccion4_2;
import co.gov.minambiente.vista.formulario.Seccion5_1;
import co.gov.minambiente.vista.formulario.Seccion5_2;
import co.gov.minambiente.vista.formulario.Seccion6;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import javafx.scene.control.RadioButton;

/**
 *
 * @author Natalia García
 */
public class ControladorSolicitud implements ActionListener{
 private Seccion4_2 a;
    private Seccion5_1 b;
    private Seccion5_2 c;
    private Seccion6 d;
    private RequestModel request = new RequestModel("1");
     public ControladorSolicitud() throws IOException {

        a = new Seccion4_2();
        b = new Seccion5_1();
        c = new Seccion5_2();
        d = new Seccion6();

        init();
    }
     public void init() {
        a.setVisible(true);
        a.btnSiguiente.addActionListener(this);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(true);
    }

    public void guardarInformacionSeccion1(String tipoSolicitud, String tipoPersonaInteresado, String nombreInteresado, String tipoIdInteresado,
            String numeroIdInteresado, boolean aplicaApoderado, String nombreApoderado, String tipoIdApoderado, String numeroIdApoderado,
            String TPApoderado, String calidad, String otro, String tipoPredio, boolean aplicaCosto, String costo, String costoLetras) {
        request.setTypeRequest(tipoSolicitud);
        request.getInterested().setTypePerson(tipoPersonaInteresado);
        request.getInterested().setName(nombreInteresado);
        request.getInterested().setTypeId(tipoIdInteresado);
        request.getInterested().setId(numeroIdInteresado);

        if (aplicaApoderado) {
            request.getInterested().setAttorney(new AttorneyModel(TPApoderado, nombreApoderado, tipoIdApoderado, numeroIdApoderado));
        }

        if (calidad.equals("Otro")) {
            request.getInterested().setInterestedQuality(otro);
        } else {
            request.getInterested().setInterestedQuality(calidad);
        }

        request.addProperties(new PropertyModel(tipoPredio));

        if (aplicaCosto) {
            ArrayList<String> cost = new ArrayList<>();
            cost.add(costo);
            cost.add(costoLetras);
            request.getInterested().setProjectCost(cost);
        }
    }

    public void guardarInformacionSeccion2(String numeroExpediente, String numeroActo) {
        request.setFileNumber(numeroExpediente);
        request.setActNumber(numeroActo);
    }

    public void guardarInformacionSeccion3(String terrenosDominio, LinkedList<String> categorias, String tipoAprovechamientoA, String claseManejo,
            String ingresos, String ingresosLetras, String categoriaAsociada, String tipoAprovechamientoD) {
        request.setHowToAcquire(terrenosDominio);
        for (String categoria : categorias) {
            switch (categoria) {
                case "A":
                    request.getCategoryA().setTypeUtilization(tipoAprovechamientoA);
                    break;
                case "B":
                    ArrayList<String> revenues = new ArrayList<>();
                    revenues.add(ingresos);
                    revenues.add(ingresosLetras);
                    request.getCategoryB().setTypeOperation(claseManejo);
                    request.getCategoryB().setRevenuesExpected(revenues);
                    request.getCategoryB().setAssociatedCategory(categoriaAsociada);
                    break;
                case "C":
                    break;
                case "D":
                    request.getCategoryD().setTypeUtilization(tipoAprovechamientoD);
                    break;
            }
        }
    }

    public void guardarInformacionSeccion4_1(String nombre, String superficie, String direccion, String tipo, String departamento,
            String municipio, String vereda, String matriculaInmobiliaria, String cedulaCatastral) {
        LinkedList<PropertyModel> properties = request.getProperties();
        for (PropertyModel property : properties) {
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

    public void guardarInformacionSeccion5_2(String otro, String estadoIndividual, String otro1) {

    }

    public void guardarInformacionSeccion6(String correo, int telefono, String direccion, String departamento, String vereda, String municipio, String nombre) {

    }

    public String getTypeProperty() {
        LinkedList<PropertyModel> propertys = request.getProperties();
        return propertys.getFirst().getTypeProperty();
    }

    public LinkedList<String> cargarDepartamentos() throws IOException {
        LinkedList<DepartmentModel> departamentos = Utils.loadMunicipalities((new File("resources\\MunicipiosDepartamentosColombia.txt")));
        LinkedList<String> nombresDepartamentos = new LinkedList<>();
        for (DepartmentModel departamento : departamentos) {
            nombresDepartamentos.add(departamento.getDEPARTMENTNAME());
        }
        return nombresDepartamentos;
    }

    public LinkedList<String> cargarMunicipios(String d) throws IOException {
        LinkedList<DepartmentModel> departamentos = Utils.loadMunicipalities((new File("resources\\MunicipiosDepartamentosColombia.txt")));
        for (DepartmentModel departamento : departamentos) {
            if (departamento.getDEPARTMENTNAME().equals(d)) {
                return departamento.getMUNICIPALITIES();
            }
        }
        return null;
    }
     public void guardarSeccion6() {
        String correo = d.txtCorreo.getText();
        int telefono = Integer.parseInt(d.txtTelefono.getText());
        String direccion = d.txtDireccionNot.getText();
        String departamento = (String) d.cmbDepartamento.getSelectedItem();
        String vereda = d.txtVereda.getText();
        String municipio = (String) d.cmbMunicipio.getSelectedItem();
        String nombre = d.txtNombre.getText();
        //falta obtener la firma
        if (d.rbSI.isSelected()) {
            if (!correo.equals("") && !direccion.equals("") && !nombre.equals("") && !vereda.equals("") && !municipio.equals("") && !departamento.equals("")) {
                guardarInformacionSeccion6(correo, telefono, direccion, departamento, vereda, municipio, nombre);
            }

        }
     }
     
     
    public void guardarSeccion5_2() {
        String estado = (String) c.cmbEstado.getSelectedItem();
        String otro = c.txtOtro.getText().trim();
        String tipo = (String) c.cmbTipo.getSelectedItem();
        RadioButton rb = (RadioButton)  c.cmb2.getChildAt();
        String texto = rb.getText().toString();
        String tipoA = (String) c.cmbTipo3.getSelectedItem();
        String causa = (String) c.cmbCausa.getSelectedItem();
        String otro1 = c.txtOtro1.getText().trim();
        String estadoIndividual = (String) c.cmbEstadoI.getSelectedItem();
        String actividad = (String) c.cmbActividad.getSelectedItem();
        String similar = c.txtOtro.getText().trim();
        if (c.cmb1.isSelected() && (!estado.equals("Seleccione"))) {
            if (estado.equals("Otro")) {
                if (!otro.equals("")) {
                    guardarInformacionSeccion5_2(otro, estadoIndividual, otro1);
                } else {
                    guardarInformacionSeccion5_2(texto, estadoIndividual, otro1);
                }
            }
        } else if (c.cmb2.isSelected()) {
            guardarInformacionSeccion5_2(texto, estadoIndividual, otro1);
        }
        if(c.cmb3.isSelected() && (!estadoIndividual.equals("Seleccione") && (!tipoA.equals("Seleccione")) )){
            if(causa.equals("Otro"))
                if (!otro1.equals("")) {
                    guardarInformacionSeccion5_2(tipoA,estadoIndividual,otro1);
        }
        }else{
            guardarInformacionSeccion5_2(tipoA,estadoIndividual,causa);
        }
        if(c.cmb4.isSelected() ){
            
        }
    
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if (ae.getSource() == a.btnSiguiente) {
            guardarSeccion4_2();
        }
        if (ae.getSource() == b.btnSiguiente1) {
            guardarSeccion5_1();
        }
        if (ae.getSource() == c.btnSiguiente2) {
            guardarSeccion5_2();
        }
        if (ae.getSource() == d.btnGuardar) {
            guardarSeccion6();
        }
    }

    private static class LinkedLink<T> {

        public LinkedLink() {
        }
    }
}
