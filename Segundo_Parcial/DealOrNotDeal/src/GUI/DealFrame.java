package GUI;

import javax.swing.*;
import java.awt.*;

public class DealFrame extends JFrame {

    private PaneldelCentro vaEnElCentro;
    private PanelInferior vaAbajo;



    public DealFrame(){
        super("Deal or not Deal !");
        vaEnElCentro = new PaneldelCentro();
        vaAbajo = new PanelInferior(this);

        super.setLayout(new BorderLayout());
        super.setSize(600,300);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null);

        super.add(vaEnElCentro,BorderLayout.CENTER);
        super.add(vaAbajo,BorderLayout.SOUTH);
        super.setVisible(true);



    }






}
