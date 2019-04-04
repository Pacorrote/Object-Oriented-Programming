package Control;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Juego {

    private String[] valorcillos = {"0.01","1","5","10","25","50","75","100","200","300","400","500","750","1000","5000","10000","25000","50000","75000","100000","200000","300000","400000","500000","750000","1000000"};
    public ArrayList<Suitcase>maletines = new ArrayList<>();



    public Juego(){

        for (int i = 0;i<valorcillos.length;i++){
            int index = (int)(Math.random()*valorcillos.length);

            String temp = valorcillos[i];
            valorcillos[i] = valorcillos[index];
            valorcillos[index] = temp;
        }

        for (int j = 0;j<valorcillos.length;j++){
            Suitcase thecase = new Suitcase(j,valorcillos[j]);
            ImageIcon icon = new ImageIcon(getClass().getResource("../Images/Maleta.png"));
            ImageIcon icon1 = new ImageIcon(icon.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT));


            /*thecase.setOpaque(true);
            */
            thecase.setIcon(icon1);
            thecase.setContentAreaFilled(false);
            thecase.setBorder(null);


            //thecase.setPreferredSize(new Dimension(100,100));
            maletines.add(thecase);
        }
        //return maletines;

    }

    public void chooseFirstCase(){

}
    //public ArrayList<Suitcase> inicializarCases(){

    //}





}
