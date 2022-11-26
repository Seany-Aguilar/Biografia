
package Biografia;

import Fondo.Imagen;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/*---------------------------------------------------*/
//Librerias para Exel
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/* *************************************************************/
 //Librerias para pdf
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

/*@author BETTERLEE*/
 
public class DatosBio extends JFrame{

    private JPanel panel;
    
    
    public DatosBio(){
        this.panel = new Imagen();

        this.setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Crear Biografa en pdf o Exel");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));

        Iniciar();
    }
    
    private void Iniciar() {

        Panel();
       // Etiquetas();
        BotonExcel();
        BotonPDF();
    }
    
    private void Panel() {
        //panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }


    private void BotonExcel() {
        JButton boton = new JButton("Excel");
        boton.setBounds(100, 250, 140, 40);
        boton.setForeground(Color.BLACK);
        boton.setContentAreaFilled(false);
        boton.setFont(new Font("Strawberry", Font.CENTER_BASELINE, 25));
        boton.setEnabled(true);
        panel.add(boton);

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                
                Workbook libro = new XSSFWorkbook();
                final String nombreArchivo = ".xlsx";
                Sheet hoja = libro.createSheet("Hoja 1");
                
               Row cuartaFila = hoja.createRow(1);
                Row terceraFila = hoja.createRow(1);
                Row segundaFila = hoja.createRow(1);
                Row primeraFila = hoja.createRow(0);
                Cell primeraCelda = primeraFila.createCell(0);
                Cell segundaCelda = segundaFila.createCell(0);
                Cell terceraCelda = segundaFila.createCell(0);
                Cell cuartaCelda = segundaFila.createCell(0);
                primeraCelda.setCellValue("Hola Yo me llamo Seany Xochitl Bautista Aguilar");
                segundaCelda.setCellValue("Estudio Ingeniera en Computacion ");
                terceraCelda.setCellValue("Me gusta leer y baiar kpop");
                cuartaCelda.setCellValue("Me gustaria ser una exelente programadora");

                File directorioActual = new File("C:\\Users\\ekt\\OneDrive\\Documentos\\NetBeansProjects\\Biografia ");
                String ubicacion = directorioActual.getAbsolutePath();
                String ubicacionArchivoSalida = ubicacion.substring(0, ubicacion.length() - 1) + nombreArchivo;
                FileOutputStream outputStream;
                try {
                    outputStream = new FileOutputStream(ubicacionArchivoSalida);
                    libro.write(outputStream);
                    libro.close();
                    System.out.println("Libro guardado correctamente");
                } catch (FileNotFoundException ex) {
                    System.out.println("Error de filenotfound");
                } catch (IOException ex) {
                    System.out.println("Error de IOException");
                }

                BioExel excel = new BioExel();
                excel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                excel.setVisible(true);

                setVisible(false);

            }
        });

    }

    private void BotonPDF() {
        JButton boton = new JButton("PDF");
        boton.setBounds(310, 250, 140, 40);
        boton.setForeground(Color.BLACK);
        boton.setContentAreaFilled(false);
        boton.setFont(new Font("Strawberry", Font.CENTER_BASELINE, 25));
        boton.setEnabled(true);
        panel.doLayout();
        panel.add(boton);

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                String imagen = "C:\\Users\\ekt\\OneDrive\\Documentos\\NetBeansProjects\\Biografia\\My biografia.jpg";
                try {
                    PDDocument documento = new PDDocument();
                    PDPage pagina = new PDPage(PDRectangle.LETTER);
                    documento.addPage(pagina);

                    PDImageXObject image = PDImageXObject.createFromFile(imagen, documento);
                    PDPageContentStream contenido = new PDPageContentStream(documento, pagina);

                   // contenido.drawImage(image, 4.5f, 0.3f);
                   contenido.drawImage(image, 55, 40, 500, 650);
                    contenido.beginText();
                    contenido.setFont(PDType1Font.TIMES_BOLD, 17);
                    contenido.setLeading(14.5f);
                    contenido.newLineAtOffset(20, pagina.getMediaBox().getHeight() - 52);
                    contenido.showText("Hola * Le habla * ");
                    
                    contenido.endText();

                    contenido.close();

                    documento.save("C:\\Users\\ekt\\OneDrive\\Documentos\\NetBeansProjects\\Biografia\\My biografia.pdf");

                } catch (Exception x) {
                    System.out.println("Error: " + x.getMessage().toString());
                }

                /******************************************************/   
                BioPDF p = new BioPDF();
                p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                p.setVisible(true);

                setVisible(false);

            }
        });

    }
}
