/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.minambiente.controlador;

import co.gov.minambiente.modelo.RequestModel;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.layout.borders.SolidBorder;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Tab;
import com.itextpdf.layout.element.TabStop;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.TextAlignment;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.LinkedList;

/**
 *
 * @author Andrés Güiza
 */
public class PdfController {

    public static String espacio = "\u00A0";
    public static LinkedList<Text> texts;
    public static String titleFont = "ArialNarrowBold.ttf";
    public static String bodyFont = "ArialMT.ttf";
    public static Color grayBg = new DeviceRgb(200, 188, 190);
    public static Color greenBg = new DeviceRgb(185, 229, 161);
    public static Color blueBg = new DeviceRgb(57, 205, 220);

    public static void fillDocument(PdfWorkspace generatedDoc, RequestModel solicitude) throws MalformedURLException, IOException {

        texts = PdfController.cargarBD();

        addHeader(generatedDoc, texts);

        int lineCounter = 3;

        lineCounter = addSingleTitle(generatedDoc, lineCounter, grayBg, 0);
        lineCounter = addSingleTitle(generatedDoc, lineCounter, greenBg, 9);

        Paragraph p;
        p = generatedDoc.nuevoParrafo(new Text(espacio + espacio), titleFont, 10f, 5);
        lineCounter = addBodyTitleLine(p, generatedDoc, lineCounter);
        lineCounter = addTitleLine(p, generatedDoc, lineCounter);
        lineCounter = addBodyLine(p, generatedDoc, lineCounter);
        lineCounter = addBodyLine(p, generatedDoc, lineCounter, solicitude.getInterested().getName() + "\n");
        lineCounter = addBodyTitleLine(p, generatedDoc, lineCounter, String.valueOf(solicitude.getInterested().getId()) + "\n");
        lineCounter = addTitleLine(p, generatedDoc, lineCounter);

        if (solicitude.getInterested().getAttorney().getName() != null) {
            lineCounter = addBodyLine(p, generatedDoc, lineCounter, solicitude.getInterested().getAttorney().getName() + "\n");
            lineCounter = addBodyTitleLine(p, generatedDoc, lineCounter,
                    String.valueOf(solicitude.getInterested().getAttorney().getId()),
                    String.valueOf(solicitude.getInterested().getAttorney().getProfesionalCard()) + "\n");
        } else {
            lineCounter = addBodyLine(p, generatedDoc, lineCounter, "" + "\n");
            lineCounter = addBodyTitleLine(p, generatedDoc, lineCounter,
                    "",
                    "" + "\n");
        }

        lineCounter = addBodyTitleLine(p, generatedDoc, lineCounter);
        lineCounter = addBodyLine(p, generatedDoc, lineCounter);

        if (!(solicitude.getInterested().getInterestedQuality().equals("Propietario")
                || solicitude.getInterested().getInterestedQuality().equals("Poseedor")
                || solicitude.getInterested().getInterestedQuality().equals("Tenedor")
                || solicitude.getInterested().getInterestedQuality().equals("Ocupante")
                || solicitude.getInterested().getInterestedQuality().equals("Autorizado")
                || solicitude.getInterested().getInterestedQuality().equals("Ente territorial")
                || solicitude.getInterested().getInterestedQuality().equals("Consejo comunitario")
                || solicitude.getInterested().getInterestedQuality().equals("Resguardo indígena"))) {
            lineCounter = addBodyLine(p, generatedDoc, lineCounter, solicitude.getInterested().getInterestedQuality() + "\n");
        } else {
            lineCounter = addBodyLine(p, generatedDoc, lineCounter);
            lineCounter = addBodyLine(p, generatedDoc, lineCounter);
        }

        lineCounter = addTitleLine(p, generatedDoc, lineCounter);
        lineCounter = addBodyLine(p, generatedDoc, lineCounter);
        lineCounter = addTitleLine(p, generatedDoc, lineCounter);

        if (solicitude.getInterested().getProjectCost().get(0) != null) {
            lineCounter = addBodyLine(p, generatedDoc, lineCounter, String.valueOf(solicitude.getInterested().getProjectCost().get(0)) + "\n");
            lineCounter = addBodyLine(p, generatedDoc, lineCounter, String.valueOf(solicitude.getInterested().getProjectCost().get(1)) + "\n");
        } else {
            p.add(new Text("No aplica").setFontSize(9.5f));
        }

        p.setFixedLeading(20);
        p.setBorder(new SolidBorder(0.75f));
        p.setMarginLeft(-5);
        p.setMarginRight(-5);
        p.setRelativePosition(0, -18, 0, 0);
        generatedDoc.empujarParrafo(p);

        generatedDoc.crearPdf();
    }

    /**
     * Cada línea de texto en Y, difiere en 20 coordenadas de la anterior
     *
     * @param generatedDoc
     * @param color
     */
    public static void generateCheckBoxes(PdfWorkspace generatedDoc, Color color) {

        //first
        generatedDoc.createRectangle(color, 160, 801, 18, 10);
        generatedDoc.createRectangle(color, 225, 801, 18, 10);
        //second
        generatedDoc.createRectangle(color, 144, 761, 18, 10);
        generatedDoc.createRectangle(color, 239, 761, 18, 10);
        generatedDoc.createRectangle(color, 334, 761, 18, 10);
        //thirth
        generatedDoc.createRectangle(color, 149, 721, 18, 10);
        generatedDoc.createRectangle(color, 194, 721, 18, 10);
        generatedDoc.createRectangle(color, 239, 721, 18, 10);
        generatedDoc.createRectangle(color, 286, 721, 18, 10);
        //Fourth
        generatedDoc.createRectangle(color, 149, 661, 18, 10);
        generatedDoc.createRectangle(color, 194, 661, 18, 10);
        generatedDoc.createRectangle(color, 239, 661, 18, 10);
    }

    public static int addBodyTitleLine(Paragraph p, PdfWorkspace generatedDoc, int lineCounter) throws IOException {

        try {
            generatedDoc.pushText(p, texts.get(lineCounter), titleFont, 10f);
            lineCounter++;
            generatedDoc.pushText(p, texts.get(lineCounter), bodyFont, 9f);
            lineCounter++;
        } catch (IOException e) {
            System.out.println("Imposible generar la linea, la fuente no es válida");
        }
        return lineCounter;
    }

    public static int addBodyTitleLine(Paragraph p, PdfWorkspace generatedDoc, int lineCounter, String... datas) throws IOException {

        try {
            generatedDoc.pushText(p, texts.get(lineCounter), titleFont, 10f);
            lineCounter++;
            lineCounter = addBodyLine(p, generatedDoc, lineCounter, datas);
        } catch (IOException e) {
            System.out.println("Imposible generar la linea, la fuente no es válida");
        }
        return lineCounter;
    }

    public static int addTitleLine(Paragraph p, PdfWorkspace generatedDoc, int lineCounter) throws IOException {

        try {
            generatedDoc.pushText(p, texts.get(lineCounter), titleFont, 10f);
            lineCounter++;
        } catch (IOException e) {
            System.out.println("Imposible generar la linea, la fuente no es válida");
        }
        return lineCounter;
    }

    public static int addBodyLine(Paragraph p, PdfWorkspace generatedDoc, int lineCounter) throws IOException {

        try {
            generatedDoc.pushText(p, texts.get(lineCounter), bodyFont, 9f);
            lineCounter++;
        } catch (IOException e) {
            System.out.println("Imposible generar la linea, la fuente no es válida");
        }
        return lineCounter;
    }

    public static int addBodyLine(Paragraph p, PdfWorkspace generatedDoc, int lineCounter, String... datas) throws IOException {

        String temporal = "";
        for (String data : datas) {
            texts.get(lineCounter + 1).setText(data + "       ");
            temporal = temporal + texts.get(lineCounter).getText() + texts.get(lineCounter + 1).getText();
            lineCounter += 2;
        }

        generatedDoc.pushText(p, new Text(temporal), bodyFont, 9f);
        return lineCounter;
    }

    public static int addSingleTitle(PdfWorkspace generatedDoc, int i, Color color, int relativePosition) throws IOException {
        Paragraph title = generatedDoc.nuevoParrafo(new Text(espacio + espacio), "ArialNarrowBold.ttf", 10f, 5);
        generatedDoc.pushText(title, texts.get(i), "ArialNarrowBold.ttf", 10f);
        title.setBorder(new SolidBorder(0.75f));
        title.setMarginLeft(-5);
        title.setMarginRight(-5);
        i++;
        title.setBackgroundColor(color, 0.75f);
        title.setRelativePosition(0, 0, 0, relativePosition);
        generatedDoc.empujarParrafo(title);
        return i;
    }

    public static LinkedList<Text> cargarBD() throws IOException {
        String[] textoFormatos = Utils.loadFile(new File("resources\\formularioCampos.txt"));
        LinkedList<Text> textsList = new LinkedList<>();

        for (String textoFormato : textoFormatos) {
            textsList.add(new Text(textoFormato));
        }

        return textsList;
    }

    public static void addHeader(PdfWorkspace generatedDoc, LinkedList<Text> texts) throws MalformedURLException, IOException {

        Paragraph encabezado = generatedDoc.nuevoParrafo("minambiente.png", 44, 214, 30, 920, 0);
        encabezado.setTextAlignment(TextAlignment.CENTER);
        //Interlineado
        encabezado.setFixedLeading(12);
        generatedDoc.pushText(encabezado, texts.getFirst().setRelativePosition(10, 0, 0, 0), "ArialNarrowBold.ttf", 11.5f);
        generatedDoc.pushText(encabezado, texts.get(1).setRelativePosition(10, 0, 0, 0), "ArialNarrowBold.ttf", 9.5f);
        generatedDoc.empujarImagen(encabezado, "sina.png", 41, 127, 450, 925);
        encabezado.setBorder(new SolidBorder(0.75f));
        encabezado.setMargin(-5);
        generatedDoc.empujarParrafo(encabezado);

        encabezado = generatedDoc.nuevoParrafo(texts.get(2), "ArialMT.ttf", 9f, 0);
        encabezado.setBorder(new SolidBorder(0.75f));
        encabezado.setMarginLeft(-5);
        encabezado.setTextAlignment(TextAlignment.CENTER);
        encabezado.setMarginRight(-5);
        generatedDoc.empujarParrafo(encabezado);

    }

}
