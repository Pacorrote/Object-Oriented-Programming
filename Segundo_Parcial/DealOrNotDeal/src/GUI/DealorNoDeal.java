package GUI;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DealorNoDeal extends JFrame {
    private JPanel Oferta = new JPanel();
    private JLabel Ofer = new JLabel();
    private JLabel Ofer1 = new JLabel();
    private JPanel Botones = new JPanel();
    private JButton Deal = new JButton("Deal");
    private JButton NoDeal = new JButton("NoDeal");
    private int Numero = (int) (Math.random()*50000 + 100);

    public DealorNoDeal(){
        super("Oferta");
        Font fuente = new Font("Futura", 0, 60);
        super.setLayout(new BorderLayout());
        super.setSize(600,300);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null);
        super.add(Oferta);
        super.add(Botones,BorderLayout.SOUTH);
        Botones.setLayout(new GridLayout(1,2,8,2));
        Oferta.setLayout(new GridLayout(2,1,5,2));
        Ofer1.setText(Double.toString(Numero));
        Ofer.setText("El banco te ofrece: ");
        Ofer.setBackground(Color.GRAY);
        Ofer.setFont(fuente);
        Ofer.setBorder(new BevelBorder(BevelBorder.RAISED));
        Ofer.setOpaque(true);
        Ofer1.setBackground(Color.GRAY);
        Ofer1.setFont(fuente);
        Ofer1.setBorder(new BevelBorder(BevelBorder.RAISED));
        Ofer1.setOpaque(true);
        Oferta.add(Ofer);
        Oferta.add(Ofer1);
        Deal.setBackground(Color.GREEN);
        Deal.setPreferredSize(new Dimension(140,140));
        NoDeal.setPreferredSize(new Dimension(140,140));
        NoDeal.setBackground(Color.RED);
        Deal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(Oferta,Double.toString(Numero),"Felicidades has ganado",JOptionPane.INFORMATION_MESSAGE);
                DealorNoDeal.super.setVisible(false);
                System.exit(0);
            }
        });
        NoDeal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(Oferta,"¡¡Que Gallina!!","Sigue jugando",JOptionPane.INFORMATION_MESSAGE);
                DealorNoDeal.super.setVisible(false);
            }
        });

        Botones.add(Deal);
        Botones.add(NoDeal);
        super.setVisible(true);
    }
}
