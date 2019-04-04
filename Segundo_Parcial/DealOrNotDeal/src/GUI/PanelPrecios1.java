package GUI;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class PanelPrecios1 extends JPanel {

    String[] valores= {"0.01","1","5","10","25","50","75","100","200","300","400","500","750"};
    private ArrayList<JLabel> labels = new ArrayList<>();


    public PanelPrecios1(){
        super.setVisible(true);
        super.setLayout(new GridLayout(13,1));
        super.setPreferredSize(new Dimension(100,50));
       // super.setBackground(Color.black);
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
