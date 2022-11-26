package Biografia;

import Fondo.Fondo2;
import Fondo.Imagen;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;



/*@author BETTERLEE*/

public class BioPDF extends JFrame{

private JPanel panel;
    private JButton boton;
    private JLabel texto;

    public BioPDF() {
        
        this.panel = new Imagen();
        this.setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Crear Pdf");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));

        Iniciar();

    }

    private void Iniciar() {
        Panel();
        Pregunta();
        Boton();
    }

    private void Panel() {

        panel = new JPanel();
        this.panel = new Fondo2();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

     public void Pregunta() {

        texto = new JLabel();
        texto.setBounds(216, 80, 400, 50);
        texto.setText("Se ha creado el archivo PDF.");
        texto.setFont(new java.awt.Font("Strawberry", java.awt.Font.CENTER_BASELINE, 36));
        panel.add(texto);

    }
     
    private void Boton() {

        boton = new JButton("Abrir");
        boton.setBounds(225, 150, 90, 40);
        boton.setForeground(java.awt.Color.BLACK);
        boton.setContentAreaFilled(false);
        boton.setFont(new java.awt.Font("Strawberry", java.awt.Font.CENTER_BASELINE, 26));
        boton.setEnabled(true);

        panel.add(boton);
        
        ActionListener accion = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {

                try {
                    File path = new File("C:\\Users\\ekt\\OneDrive\\Documentos\\NetBeansProjects\\Biografia\\My biografia.pdf");
                    Desktop.getDesktop().open(path);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        };

        boton.addActionListener(accion);

    }


}
