/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.minambiente.controlador;

import static co.gov.minambiente.controlador.Utils.loadMunicipalities;
import co.gov.minambiente.modelo.DepartmentModel;
import co.gov.minambiente.modelo.InterestedModel;
import co.gov.minambiente.modelo.RequestModel;
import com.itextpdf.forms.fields.PdfButtonFormField;
import com.itextpdf.forms.fields.PdfFormField;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.layout.borders.SolidBorder;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.TextAlignment;
import java.awt.FontFormatException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author Andrés Güiza
 */
public class Controlador {

    public static void main(String[] args) throws FileNotFoundException, IOException, FontFormatException {
        DocumentoPdf docGenerado = new DocumentoPdf("Prueba.pdf", 10, "src\\co\\gov\\minambiente\\fonts\\");
       
        //Utilidades.leer();
        
        RequestModel form1 = new RequestModel(1);
        HashMap <Integer,String> a = new HashMap<>();
        a.put(12000000, "Doce millones de pesos");
        
        InterestedModel interested = new InterestedModel("Natural", form1.getREFERENCE(), 
                "propietario", a, false, "bob_esponja@gmail.com", 304446985,"Bob Esponja", "cc", 1101760080);
        
        form1.setTypeRequest("nueva");
        form1.setInterested(interested);
  
        loadMunicipalities(new File("resources\\MunicipiosDepartamentosColombia.txt"));
        
        generateCheckBoxes(docGenerado);
        llenarDocumento(docGenerado, form1);    
    }
    
   /**
    * 
    * @param docGenerado
    * @throws MalformedURLException
    * @throws IOException 
    */
    static void llenarDocumento(DocumentoPdf docGenerado, RequestModel solicitude) throws MalformedURLException, IOException{
        //Hacemos una lista de rutas de tipografías para construir otra lista 
        //Pero de fuentes pdf

        Color grayBg = new DeviceRgb(179, 181, 178);
        Color greenBg = new DeviceRgb(185, 229, 161);

        LinkedList<Text> textos = cargarBD();

        generarEncabezado(docGenerado, textos);

        int contadorIndice = 3;
        String espacio = "\u00A0";

        Paragraph datosBasicos = docGenerado.nuevoParrafo(new Text(espacio + espacio),"ArialNarrowBold.ttf",9.5f);
        docGenerado.empujarTexto(datosBasicos, textos.get(contadorIndice), "ArialNarrowBold.ttf", 9.5f, 0);
        datosBasicos.setBorder(new SolidBorder(0.75f));
        datosBasicos.setMarginLeft(-5);
        datosBasicos.setMarginRight(-5);
        contadorIndice++;
        datosBasicos.setBackgroundColor(grayBg,0.75f);
        docGenerado.empujarParrafo(datosBasicos);
        
        Paragraph datosInteresado = docGenerado.nuevoParrafo(new Text(espacio + espacio), "ArialNarrowBold.ttf", 9.5f);
        docGenerado.empujarTexto(datosInteresado, textos.get(contadorIndice), "ArialNarrowBold.ttf", 9.5f , 0);
        datosInteresado.setBorder(new SolidBorder(0.75f));
        datosInteresado.setMarginLeft(-5);
        datosInteresado.setMarginRight(-5);
        datosInteresado.setBackgroundColor(greenBg, 0.75f);
        datosInteresado.setRelativePosition(0, -9, 0, 0);
        docGenerado.empujarParrafo(datosInteresado);
        contadorIndice++;
        
        Paragraph p;
        p = docGenerado.nuevoParrafo(new Text(espacio + espacio), "ArialNarrowBold.ttf", 9.5f);
        docGenerado.empujarTexto(p, textos.get(contadorIndice), "ArialNarrowBold.ttf", 9.5f, 0);
        contadorIndice++;
        docGenerado.empujarTexto(p, textos.get(contadorIndice), "ArialMT.ttf", 9f, 0);
        contadorIndice++;
        docGenerado.empujarTexto(p, textos.get(contadorIndice), "ArialNarrowBold.ttf", 9.5f, 5);
        contadorIndice++;
        docGenerado.empujarTexto(p, textos.get(contadorIndice), "ArialMT.ttf", 9f, 5);
        contadorIndice++;
        
        textos.get(contadorIndice).setText(textos.get(contadorIndice).getText() + espacio + solicitude.getInterested().getName());
        docGenerado.empujarTexto(p, textos.get(contadorIndice), "ArialMT.ttf", 9f, 5);
        contadorIndice++;
        textos.get(contadorIndice).setText(textos.get(contadorIndice).getText() + espacio + solicitude.getInterested().getId());
        docGenerado.empujarTexto(p, textos.get(contadorIndice), "ArialMT.ttf", 9f, 5);
        contadorIndice++;
        docGenerado.empujarTexto(p, textos.get(contadorIndice), "ArialNarrowBold.ttf", 9.5f, 5);
        contadorIndice++; 
        
        if(solicitude.getInterested().getAttorney() !=null){
            textos.get(contadorIndice).setText(textos.get(contadorIndice).getText() 
                    + espacio + solicitude.getInterested().getAttorney().getName());
        }
        
        p.setFixedLeading(20);
        
        p.setBorder(new SolidBorder(0.75f));
        p.setMarginLeft(-5);
        p.setMarginRight(-5);
        p.setRelativePosition(0, -18, 0, 0);
        docGenerado.empujarParrafo(p);

        docGenerado.crearPdf();
    }
    
    static void generateCheckBoxes(DocumentoPdf docGenerado){
        
        Color grayBg = new DeviceRgb(212, 216, 210);
        //first
        docGenerado.createRectangle(grayBg, 155, 818, 18, 10);
        docGenerado.createRectangle(grayBg, 220, 818, 18, 10);
        //second
        docGenerado.createRectangle(grayBg, 145, 778, 18, 10);
        docGenerado.createRectangle(grayBg, 240, 778, 18, 10);
        docGenerado.createRectangle(grayBg, 335, 778, 18, 10);
        //thirth
        docGenerado.createRectangle(grayBg, 144, 738, 18, 10);
        docGenerado.createRectangle(grayBg, 189, 738, 18, 10);
        docGenerado.createRectangle(grayBg, 234, 738, 18, 10);
        docGenerado.createRectangle(grayBg, 279, 738, 18, 10);
        
    }

    static LinkedList<Text> cargarBD() throws IOException {
        String[] textoFormatos = Utils.loadFile(new File("resources\\formularioCampos.txt"));
        LinkedList<Text> textos = new LinkedList<>();
        
        for (String textoFormato : textoFormatos) {
            textos.add(new Text(textoFormato));
        }
        
        return textos;
    }

    static void generarEncabezado(DocumentoPdf docGenerado, LinkedList<Text> textos) throws MalformedURLException, IOException {

        Paragraph encabezado = docGenerado.nuevoParrafo("minambiente.png", 44, 214, 30, 920);
        encabezado.setTextAlignment(TextAlignment.CENTER);
        //Interlineado
        encabezado.setFixedLeading(12);
        docGenerado.empujarTexto(encabezado, textos.getFirst(), "ArialNarrowBold.ttf", 11.5f, 10);
        docGenerado.empujarTexto(encabezado, textos.get(1), "ArialNarrowBold.ttf", 9.5f, 10);
        docGenerado.empujarImagen(encabezado, "sina.png", 41, 127, 450, 925);
        encabezado.setBorder(new SolidBorder(0.75f));
        encabezado.setMargin(-5);
        docGenerado.empujarParrafo(encabezado);
        
        Paragraph encabezado2 = docGenerado.nuevoParrafo(textos.get(2), "ArialMT.ttf", 8.3f);
        encabezado2.setBorder(new SolidBorder(0.75f));
        encabezado2.setMarginLeft(-5);
        encabezado2.setTextAlignment(TextAlignment.CENTER);
        encabezado2.setMarginRight(-5);
        docGenerado.empujarParrafo(encabezado2);
        
    }
}
