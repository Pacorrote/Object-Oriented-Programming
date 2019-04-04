package GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.ArrayList;


public class PanelPrecios2 extends JPanel {

    String[] valores= {"1000","5000","10000","25000","50000","75000","100000","200000","300000","400000","500000","750000","1000000"};
    private ArrayList<JLabel> labels = new ArrayList<>();



    public PanelPrecios2(){
        super.setVisible(true);
        super.setLayout(new GridLayout(13,1));
        super.setPreferredSize(new Dimension(100,50));
        super.setBackground(Color.BLACK);
        inicializar();
    }

    public void inicializar(){
        for (Integer i = 0;i<13;i++ ){
            Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
            JLabel etiqueta = new JLabel(valores[i]);
            etiqueta.setVisible(true);
            etiqueta.setBackground(Color.ORANGE);
            etiqueta.setOpaque(true);
            etiqueta.setBorder(border);
            super.add(etiqueta);
            labels.add(etiqueta);
        }
    }

    public void repintar(String numero){
        for(int i=0;i<valores.length;i++) {
            if(numero==valores[i]) {
                labels.get(i).setBackground(Color.GRAY);
                labels.get(i).setOpaque(true);
            }
        }
    }

}