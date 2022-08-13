/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.minambiente.controlador;

import co.gov.minambiente.modelo.DocumentoPdf;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.layout.borders.SolidBorder;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.TextAlignment;
import java.awt.FontFormatException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.LinkedList;

/**
 *
 * @author Andrés Güiza
 */
public class Controlador {

    public static void main(String[] args) throws FileNotFoundException, IOException, FontFormatException {
        DocumentoPdf docGenerado = new DocumentoPdf("Prueba.pdf", 10, "src\\co\\gov\\minambiente\\fonts\\");
        llenarDocumento(docGenerado);
        //Utilidades.leer();
    }
   
    static void llenarDocumento(DocumentoPdf docGenerado) throws MalformedURLException, IOException{
        //Hacemos una lista de rutas de tipografías para construir otra lista 
        //Pero de fuentes pdf

        Color grayBg = new DeviceRgb(179, 181, 178);
        Color greenBg = new DeviceRgb(185, 229, 161);

        LinkedList<Text> textos = cargarBD();

        generarEncabezado(docGenerado, textos);

        int contadorIndice = 2;
        String espacio = "\u00A0";

        Paragraph datosBasicos = docGenerado.nuevoParrafo(new Text(espacio),"ArialNarrowBold.ttf",9.5f);
        docGenerado.empujarTexto(datosBasicos, textos.get(contadorIndice+1), "ArialNarrowBold.ttf", 9.5f, 0);
        datosBasicos.setBorder(new SolidBorder(0.75f));
        datosBasicos.setMarginLeft(-5);
        datosBasicos.setMarginRight(-5);
        

        
        datosBasicos.setBackgroundColor(grayBg,0.75f);
        docGenerado.empujarParrafo(datosBasicos);
        
        Text texto5 = new Text("\u00A0\u00A01. Datos del interesado\n");
        Paragraph datosInteresado = docGenerado.nuevoParrafo(texto5, "ArialNarrowBold.ttf", 9.5f);
        datosInteresado.setBorder(new SolidBorder(0.75f));
        datosInteresado.setMarginLeft(-5);
        datosInteresado.setMarginRight(-5);
        datosInteresado.setBackgroundColor(greenBg, 0.75f);
        datosInteresado.setRelativePosition(0, -9, 0, 0);
        docGenerado.empujarParrafo(datosInteresado);
        
        Paragraph p;
        
        p = docGenerado.nuevoParrafo(new Text("\u00A0\u00A01.1. Tipo de Solicitud:       "), "ArialNarrowBold.ttf", 9.5f);
        docGenerado.empujarTexto(p, new Text("Nueva   Prórroga\n"), "TimesNewRomanPSMT.ttf", 9.5f, 0);
        docGenerado.empujarTexto(p, new Text("\u00A0\u00A01.2. Identificación del interesado\n"), "ArialNarrowBold.ttf", 9.5f, 0);
        docGenerado.empujarTexto(p, new Text("\u00A0\u00A0Tipo de persona: Natural      Jurídica Pública        Jurídica Privada\n"
                + "\u00A0\u00A0Nombre o Razón Social: _________________________________________________________________________________________________________________\n"
                + "\u00A0\u00A0Tipo de identificación: CC       CE      PA      NIT     Número de Identificación: ___________________________________________\n"), 
                "TimesNewRomanPSMT.ttf", 9.5f, 0);
        docGenerado.empujarTexto(p, new Text("\u00A0\u00A01.3. Apoderado (Si aplica)\n"), "ArialNarrowBold.ttf", 9.5f, 0);
        docGenerado.empujarTexto(p, new Text("\u00A0\u00A0Nombre: ______________________________________________________________________________________________________________________________\n"
                + "\u00A0\u00A0Tipo de identificación: CC       CE      PA      Número de Identificación: ________________________________TP: ____________________________\n"), 
                "TimesNewRomanPSMT.ttf", 9.5f, 0);
        docGenerado.empujarTexto(p, new Text("\u00A0\u00A01.4. Calidad en que actúa sobre el predio donde se realizará el aprovechamiento o manejo sostenible."), "ArialNarrowBold.ttf", 9.5f, 0);
        
        p.setBorder(new SolidBorder(0.75f));
        p.setMarginLeft(-5);
        p.setMarginRight(-5);

        p.setRelativePosition(0, -18, 0, 0);
        docGenerado.empujarParrafo(p);

        docGenerado.crearPdf();
    }

    static LinkedList<Text> cargarBD() throws IOException {
        String[] textoFormatos = Utilidades.leer();
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
