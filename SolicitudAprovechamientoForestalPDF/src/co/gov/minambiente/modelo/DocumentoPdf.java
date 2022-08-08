/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.minambiente.modelo;

import com.itextpdf.io.font.FontProgram;
import com.itextpdf.io.font.FontProgramFactory;
import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import static com.itextpdf.kernel.pdf.PdfName.Border;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.utils.PdfMerger;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.SolidBorder;
import com.itextpdf.layout.element.AreaBreak;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.TextAlignment;
import java.awt.FontFormatException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.LinkedList;

/**
 *
 * Clase creada para utilizar métodos indispensables para el funcionamiento del
 * programa
 *
 * @author Andrés Güiza
 */
public class DocumentoPdf {
    
    private String nombre;
    private File destino;
    private File destinoImagen;
    //Gestiona el contenido del pdf
    private PdfDocument pdf;
    //Gestiona el diseño del pdf
    private Document document;
    private PdfFont fuente;
    
    
    
    private String rutaFuente;

    public DocumentoPdf(String nombre, int numeroPaginas, String rutaFuente) throws FileNotFoundException, IOException, FontFormatException {

        this.nombre = nombre;
        this.rutaFuente = rutaFuente;

        this.destino = new File("pdfOutput");
        this.destinoImagen = new File("resources\\images");

        try {
            //Revisamos si la carpeta está creada, si no, la creamos
            if (revisarDirectorio(this.destino.getPath())) {
                System.out.println("El directorio pdfOutput sí está");
            } else {
                System.out.println("No existe el directorio pdfOutput");
                this.destino.mkdirs();
                System.out.println("Directorio pdfOutput creado");
            }
            // Permite escribir el archivo en el disco
            PdfWriter writer;
            writer = new PdfWriter(new File(this.destino.getPath() + "\\" + this.nombre)).setSmartMode(true);
            this.pdf = new PdfDocument(writer);
            this.pdf.setDefaultPageSize(new PageSize(612.0f, 1008.0f));

            for (int i = 0; i < numeroPaginas; i++) {
                this.pdf.addNewPage();
            }

            //Seteo del Document
            this.document = new Document(this.pdf);
            this.document.setMargins(30f, 27f, 58f, 34f);
        } catch (FileNotFoundException noEncontrado) {
            System.out.println("No se puede encontrar la ruta especificada"
                    + "solución: cree la carpeta pdfOutput manualmente"
                    + " Solución: cierre el archivo");
        }


    }

    //Métodos
    /**
     * 
     * @param texto El texto a almacenar
     * @param nombreFuente Nombre de la fuente con extensión
     * @param tamano Tamaño de la fuente
     * @return Retorna el párrafo 
     * @throws IOException Excepción que ocurre si la ruta de la fuente está mal
     */
    public Paragraph nuevoParrafo(Text texto, String nombreFuente, float tamano) throws IOException{
        FontProgram temporal;
        temporal = FontProgramFactory.createFont(this.rutaFuente + nombreFuente);
        PdfFont auxiliar = PdfFontFactory.createFont(temporal);
        texto.setFont(auxiliar);
        texto.setFontSize(tamano);
        Paragraph parrafo = new Paragraph(texto); 
        return parrafo;
    }
   
    public Paragraph nuevoParrafo(String nombreImagen, int ancho, int alto, int fixAncho, int fixAlto) throws MalformedURLException{
        Image temporal = new Image(ImageDataFactory.create(this.destinoImagen.getPath()+ "\\" + nombreImagen));
        Paragraph parrafo = new Paragraph("");
        parrafo.add(temporal);
        temporal.setMaxHeight(ancho*3/4);
        temporal.setMaxWidth(alto*3/4);
        //temporal.setRelativePosition(-100, 0, 200, 0);
        temporal.setFixedPosition(fixAncho, fixAlto);
        return parrafo;
    }
    
    public void empujarImagen(Paragraph parrafo, String nombreImagen, int ancho, int alto, int fixAncho, int fixAlto) throws MalformedURLException {

        Image temporal = new Image(ImageDataFactory.create(this.destinoImagen.getPath()+ "\\" + nombreImagen));
        temporal.setMaxHeight(ancho*3/4);
        temporal.setMaxWidth(alto*3/4);
        temporal.setFixedPosition(fixAncho, fixAlto);
        parrafo.add(temporal);
    }
    
    
    /**
     * 
     * 
     * @param parrafo
     * @param texto
     * @param nombreFuente
     * @param tamano
     * @param espacio
     * @throws MalformedURLException
     * @throws IOException 
     */
    public void empujarTexto(Paragraph parrafo, Text texto, String nombreFuente, float tamano, float espacio) throws MalformedURLException, IOException {
        FontProgram temporal;
        temporal = FontProgramFactory.createFont(this.rutaFuente + nombreFuente);
        PdfFont auxiliar = PdfFontFactory.createFont(temporal);
        texto.setFont(auxiliar);
        texto.setFontSize(tamano);
        texto.setRelativePosition(espacio, 0, 0, 0);
        parrafo.add(texto);
    }

    public void pasarPagina()  {
        document.add(new AreaBreak());
       
    }

    public void empujarParrafo(Paragraph p){
        this.document.add(p);
    }
    
    /**
     * Método que escribe el archivo pdf en el disco
     */
    public void crearPdf() {
        //Guarda el pdf en la ruta asignada
        this.document.close();
        System.out.println("Documento creado");
    }
    
    /**
     * Este método revisa si el directorio fue creado
     * @param ruta Este parámetro es la ruta que queremos revisar si existe
     * @return Retorna verdadero si el directorio existe, falso si no
     */
    public static boolean revisarDirectorio(String ruta) {
        File directorio = new File(ruta);
        return directorio.exists();
    }

    //Setters & getters
    
    /**
     * 
     * @return Retorna la ruta de destino
     */
    public File getDestino() {
        return destino;
    }

    /**
     * 
     * @param destino Edita la ruta de destino (debe ser una carpeta)
     */
    public void setDestino(File destino) {
        if (destino.isDirectory()) {
            this.destino = destino;
        }
        System.out.println("No es una carpeta");  
    }

    public PdfFont getFuente() {
        return fuente;
    }

    public void setFuente(PdfFont fuente) {
        this.fuente = fuente;
    }
    
    

}
