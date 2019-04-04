package GUI;

import javax.swing.*;
import java.awt.*;



public class PaneldelCentro extends JPanel {

    private JButton botondeJugar;
    private ImageIcon imagen;


    public PaneldelCentro(){
        
        super.setLayout(new BorderLayout());
        super.setPreferredSize(new Dimension(100,50));
        super.setBackground(Color.lightGray);

         preinit();
        initcomponents();
        
        super.setVisible(true);

    }

    private void initcomponents() {
    }

    private void preinit(){
        //imagen = new ImageIcon("../Images/Fondo.jpeg").getImage();
        imagen = new ImageIcon(getClass().getResource("../Images/Fondo.jpeg")); 
    }

    public void paint(Graphics g){
        g.drawImage(imagen.getImage(),0,0,getWidth(),getHeight(),this);
    }



}
