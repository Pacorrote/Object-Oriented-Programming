package GUI;

import Control.Juego;
import Control.Suitcase;

import javax.swing.*;
import java.awt.*;



public class BotonesPanel extends JPanel {

    private ImageIcon imagen;
    private Juego partida;


    public BotonesPanel(){

        partida = new Juego();


        super.setVisible(true);

    }




    /*public void agregarCasesFrame(Juego partida){
        for (Suitcase i : partida.inicializarCases()) {
            super.add(i);
        }
    }*/
    private void initcomponents() {
    }

    public void paint(Graphics g){
        Dimension tam = getSize();
        imagen = new ImageIcon(getClass().getResource("../Images/Fondo.jpeg"));
        g.drawImage(imagen.getImage(),0,0,tam.width,tam.height,null);
        setOpaque(false);
        super.paint(g);
    }

}
