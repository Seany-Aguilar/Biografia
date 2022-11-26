
package Biografia;

import Fondo.Panel3;
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

/* @author BETTERLEE*/
 
public class BioExel extends JFrame{
    
     private JPanel panel;
     private JButton boton;
     private JLabel texto;

    public BioExel(){
        this.setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Crear  Exel");
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
        this.panel = new Panel3();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

     public void Pregunta() {

        texto = new JLabel();
        texto.setBounds(210, 70, 400, 50);
        texto.setText("Se ha creado el archivo excel.");
        texto.setFont(new java.awt.Font("Strawberry", java.awt.Font.CENTER_BASELINE, 36));
        panel.add(texto);

    }
     
    private void Boton() {

        boton = new JButton("Abrir");
        boton.setBounds(210, 140, 90, 40);
        boton.setForeground(java.awt.Color.BLACK);
        boton.setContentAreaFilled(false);
        boton.setFont(new java.awt.Font("Strawberry", java.awt.Font.CENTER_BASELINE, 26));
        boton.setEnabled(true);

        panel.add(boton);
        
        ActionListener accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    File path = new File("C:\\Users\\ekt\\OneDrive\\Documentos\\NetBeansProjects\\Biografia\\Biografia  .xlsx");
                    Desktop.getDesktop().open(path);
                } catch (IOException ex) {
                   ex.printStackTrace();
                }

            }
        };

        boton.addActionListener(accion);

    }
}
