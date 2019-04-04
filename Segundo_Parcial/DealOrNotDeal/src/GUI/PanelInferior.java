package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelInferior extends JPanel {

    private JButton botondeJugar;
    private Deal2Frame juego;

    public PanelInferior(JFrame parent){
        super.setVisible(true);
        super.setLayout(new BorderLayout());
        super.setPreferredSize(new Dimension(100,50));
        super.setBackground(Color.lightGray);

        botondeJugar = new JButton("Empezar!");
        botondeJugar.setBackground(Color.ORANGE);


        botondeJugar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                parent.setVisible(false);
                parent.dispose();
                Deal2Frame Ir = new Deal2Frame();
                Ir.setVisible(true);

            }
        });


        super.add(botondeJugar,BorderLayout.CENTER);

    }



}
