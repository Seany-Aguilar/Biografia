package Biografia;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/*@author BETTERLEE*/
public class Datos {

    private String MisDatos;
    private ArrayList<String> Misdatos;

    public void LisDatos(String datos) {
        MisDatos = datos;
        Misdatos = new ArrayList<>();
        Misdatos.add("Seany Xochitl");
        Misdatos.add("Bautista  Aguilar");
        Misdatos.add("Naci el 24/07/03");
        Misdatos.add("Tengo 19 años");
        Misdatos.add("Vivo e Toluca de Lerdo");
        Misdatos.add("Amoo leer y bailar");
        Misdatos.add("Estoy estudiando la universidad");
        Misdatos.add("Mis metas es titularme y viajar Corea");
        Misdatos.add("Mi fecha importante es el 1/07/10");
        Misdatos.add("Mi modelo a seguir es Stephen Hawking");
        Misdatos.add("Amo saltar la cuerda y hacer pilates");
        Misdatos.add("Mi mejor reuerdo es el dia del niño");
    }

    void LisDatos(Datos datos) {
        System.out.println("Bografia: \n\n" + MisDatos);
    }

}
