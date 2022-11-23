package Biografia;

import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*@author BETTERLEE*/
public class CrearPdf {

    private void JButtonActionPerformed(java.awt.event.ActionEvent e) throws FileNotFoundException {
        try {
            File file = new File("nuevoPDF.pdf");
            InputStream stream = Datos.class.arrayType().getResourceAsStream(name);//de aquí saco el inputStream del que hablo
            OutputStream salida = new FileOutputStream(file);
            byte[] array = IOUtils.toByteArray(stream);
            salida.write(array);
            salida.close();
            stream.close();
           }catch(IOException ev){
             return;
         }
    }
    public static void main(String[] args) {
        Datos datos = new Datos();
        datos.LisDatos(datos);
        

    }

}
