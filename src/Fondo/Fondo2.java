
package Fondo;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/*@author BETTERLEE
 */
public class Fondo2 extends JPanel{
    public Fondo2(){
        setSize(500,300);
    }
    
    @Override
    public void paintComponent(Graphics g){
        Dimension tamanio= getSize();
        ImageIcon fondo = new ImageIcon(getClass().getResource("Panel 2.png"));
        g.drawImage(fondo.getImage(), 0, 0, tamanio.width, tamanio.height, null);
        setOpaque(false);
        super.paintComponent(g);
    }
}
