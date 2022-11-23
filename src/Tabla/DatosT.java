package Tabla;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*@author BETTERLEE*/
public class DatosT extends JFrame {

    private JTable tabla;
    private JScrollPane scrollPane;

    public static void main(String[] args) {
        DatosT frame = new DatosT();
        frame.setVisible(true);

    }

    public DatosT() {
        initGUI();
    }

    private void initGUI() {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tabla Principal");
        getContentPane().setLayout(null);
    }

    {
        scrollPane = new JScrollPane();
        getContentPane().add(scrollPane);
        scrollPane.setBounds(40, 20, 320, 120);
        {
            String[][] datos = {{"Seany", "Bautista Aguilar", "24/07/03", "Licenciatura", "Viajar a Corea"},
            {"Yasmin", "Aguilar Gomez ", "24/11/02", "Preparatoria", "Tener una carrera"},
            {"Maite", "Guadarrama Daniel", "12/08/03", "Licenciatura", "Conocer a BTS"},};
            String[] titulos = new String[]{"Nombre", "Apellido", "Fecha de nacimiento", "Grado de estudios", "Metas"};
            TableModel modeloTabla = new DefaultTableModel(datos, titulos);
            tabla = new JTable();
            tabla.setModel(modeloTabla);
            tabla.setPreferredSize(new Dimension(850, datos.length * 15));
            scrollPane.setViewportView(tabla);
            TableRowSorter ordenador = new TableRowSorter(modeloTabla);
            tabla.setRowSorter(ordenador);
        }
        setSize(500, 300);
    }

    private void boton() {
        JButton boton = new JButton("Excel");
        boton.setBounds(90, 250, 150, 40);
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                final String nombreArchivo = "Exel de Java.xlsx";

            }
        };
    };

}
