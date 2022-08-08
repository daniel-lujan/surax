/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.minambiente.controlador;

import co.gov.minambiente.modelo.DocumentoPdfModelo;
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

// aaaaaa
//asdasd
/*






*/

/**
 *
 * @author Andrés Güiza
 */
public class Controlador {

    public static void main(String[] args) throws FileNotFoundException, IOException, FontFormatException {
        DocumentoPdfModelo a = new DocumentoPdfModelo("Prueba.pdf", 10, "src\\co\\gov\\minambiente\\fonts\\");
        //Hacemos una lista de rutas de tipografías para construir otra lista 
        //Pero de fuentes pdf
        
        Text texto1 = new Text("FORMATO ÚNICO NACIONAL DE SOLICITUD DE\n"
                + "APROVECHAMIENTO FORESTAL Y MANEJO\n"
                + "SOSTENIBLE DE FLORA SILVESTRE Y LOS\n"
                + "PRODUCTOS FORESTALES NO MADERABLES\n"
                + "NUEVO/PRÓRROGA\n");
        Text texto2 = new Text("Base legal: Ley 99 de 1993, Decreto 2811 de 1974,\n"
                + "Decreto 1076 de 2015, Resolución 1740 de 2016, Decreto 2106\n"
                + "de 2019, Decreto 690 de 2021,\n ");
        
        Text texto3 = new Text(" POR FAVOR LEA ATENTAMENTE LAS INSTRUCCIONES QUE SE INTEGRAN AL PRESENTE FORMATO ANTES DE SU DILIGENCIAMIENTO   ");
        //texto3.setBorder(new SolidBorder(0.75f));
        //texto3.set
        
        Paragraph encabezado = a.nuevoParrafo("minambiente.png", 44, 214, 30, 920);
        encabezado.setTextAlignment(TextAlignment.CENTER);
        //Interlineado
        encabezado.setFixedLeading(12);
        a.empujarTexto(encabezado, texto1, "ArialNarrowBold.ttf", 11.5f, 10);
        a.empujarTexto(encabezado, texto2, "ArialNarrowBold.ttf", 9.5f, 10);
        a.empujarImagen(encabezado, "sina.png", 41, 127, 450, 925);
        encabezado.setBorder(new SolidBorder(0.75f));
        encabezado.setMargin(-5);
        a.empujarParrafo(encabezado);
        
        Paragraph encabezado2 = a.nuevoParrafo(texto3, "ArialMT.ttf", 8.3f);
        encabezado2.setBorder(new SolidBorder(0.75f));
        encabezado2.setMarginLeft(-5);
        encabezado2.setTextAlignment(TextAlignment.CENTER);
        encabezado2.setMarginRight(-5);
        a.empujarParrafo(encabezado2);
        
        
        Text texto4 = new Text("\u00A0\u00A0DATOS BÁSICOS DE LA SOLICITUD:\n");
        Paragraph datosBasicos = a.nuevoParrafo(texto4,"ArialNarrowBold.ttf",9.5f);
        datosBasicos.setBorder(new SolidBorder(0.75f));
        datosBasicos.setMarginLeft(-5);
        datosBasicos.setMarginRight(-5);
        
        Color grayBg = new DeviceRgb(179, 181, 178);
        Color greenBg = new DeviceRgb(185, 229, 161);
        
        datosBasicos.setBackgroundColor(grayBg,0.75f);
        a.empujarParrafo(datosBasicos);
        
        Text texto5 = new Text("\u00A0\u00A01. Datos del interesado\n");
        Paragraph datosInteresado = a.nuevoParrafo(texto5, "ArialNarrowBold.ttf", 9.5f);
        datosInteresado.setBorder(new SolidBorder(0.75f));
        datosInteresado.setMarginLeft(-5);
        datosInteresado.setMarginRight(-5);
        datosInteresado.setBackgroundColor(greenBg, 0.75f);
        datosInteresado.setRelativePosition(0, -9, 0, 0);
        a.empujarParrafo(datosInteresado);
        
        
        Paragraph p;
        
        p = a.nuevoParrafo(new Text("\u00A0\u00A01.1. Tipo de Solicitud: Nueva       "), "ArialNarrowBold.ttf", 9.5f);
        a.empujarTexto(p, new Text("Prórroga\n"), "TimesNewRomanPSMT.ttf", 9.5f, 0);
        a.empujarTexto(p, new Text("\u00A0\u00A01.2. Identificación del interesado\n"), "ArialNarrowBold.ttf", 9.5f, 0);
        a.empujarTexto(p, new Text("\u00A0\u00A0Tipo de persona: Natural      Jurídica Pública        Jurídica Privada\n"
                + "\u00A0\u00A0Nombre o Razón Social: _________________________________________________________________________________________________________________\n"
                + "\u00A0\u00A0Tipo de identificación: CC       CE      PA      NIT     Número de Identificación: ___________________________________________\n"), 
                "TimesNewRomanPSMT.ttf", 9.5f, 0);
        a.empujarTexto(p, new Text("\u00A0\u00A01.3. Apoderado (Si aplica)\n"), "ArialNarrowBold.ttf", 9.5f, 0);
        a.empujarTexto(p, new Text("\u00A0\u00A0Nombre: ______________________________________________________________________________________________________________________________\n"
                + "\u00A0\u00A0Tipo de identificación: CC       CE      PA      Número de Identificación: ________________________________TP: ____________________________\n"), 
                "TimesNewRomanPSMT.ttf", 9.5f, 0);
        a.empujarTexto(p, new Text("\u00A0\u00A01.4. Calidad en que actúa sobre el predio donde se realizará el aprovechamiento o manejo sostenible."), "ArialNarrowBold.ttf", 9.5f, 0);
        
        p.setBorder(new SolidBorder(0.75f));
        p.setMarginLeft(-5);
        p.setMarginRight(-5);

        p.setRelativePosition(0, -18, 0, 0);
        a.empujarParrafo(p);

        a.crearPdf();

    }

}
