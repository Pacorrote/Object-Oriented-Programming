package GUI;

import Control.Juego;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Control.Suitcase;



public class Deal2Frame extends JFrame {

    private BotonesPanel portafolios = new BotonesPanel();
    private  PanelPrecios1 izquierdo = new PanelPrecios1();
    private PanelPrecios2 derecho;
    private Juego partida = new Juego();
    int acumulador=0;
    private JButton Maleta = new JButton();


    public Deal2Frame(){
        super("Deal or Not Deal");
        super.setSize(1000,600);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);
        portafolios.setLayout(new GridLayout(4,3));


        for (int i=0; i<partida.maletines.size(); i++) {
            String valor = partida.maletines.get(i).getValor();
            portafolios.add(partida.maletines.get(i));
            JButton Boton = partida.maletines.get(i);
            partida.maletines.get(i).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    if(acumulador==0){
                        Boton.setEnabled(false);
                        portafolios.repaint();
                        Maleta=Boton;
                    }
                    else if(acumulador<24){
                        JOptionPane.showMessageDialog(portafolios,valor,"Valor",JOptionPane.INFORMATION_MESSAGE);
                        izquierdo.repintar(valor);
                        izquierdo.repaint();
                        derecho.repintar(valor);
                        portafolios.remove(Boton);
                        portafolios.repaint();
                    }else if(acumulador==24){
                        JOptionPane.showMessageDialog(portafolios,valor,"Valor",JOptionPane.INFORMATION_MESSAGE);
                        izquierdo.repintar(valor);
                        izquierdo.repaint();
                        derecho.repintar(valor);
                        portafolios.remove(Boton);
                        portafolios.repaint();
                        Maleta.setEnabled(true);
                        JOptionPane.showMessageDialog(portafolios,"Elige la maleta que quieras para ganar","Valor",JOptionPane.INFORMATION_MESSAGE);
                    }else {
                        JOptionPane.showMessageDialog(portafolios,valor,"Felicidades Ganaste",JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    }
                    if(acumulador%6==0&&acumulador!=0){
                        DealorNoDeal j = new DealorNoDeal();
                    }
                    acumulador++;
                }
            });
        }
        super.add(portafolios,BorderLayout.CENTER);

        super.add(izquierdo,BorderLayout.WEST);

        derecho = new PanelPrecios2();
        super.add(derecho,BorderLayout.EAST);

        super.setVisible(true);
        //super.repaint();

    }


}
