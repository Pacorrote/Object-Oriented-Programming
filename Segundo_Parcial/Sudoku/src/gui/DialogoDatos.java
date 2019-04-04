/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author Victor
 */
public class DialogoDatos extends JDialog {
    private JTextField edtName;
    private JTextField edtEdad;
    private JButton btnAceptar;
    private JButton btnCancelar;
    private JLabel lbNombre;
    private JLabel lbEdad;
    private JPanel pnlDatos;
    public DialogoDatos(JFrame parent){
        super(parent,true);
        super.setSize(400,120);
        super.setLayout(new BorderLayout());
        edtName = new JTextField(10);
        edtEdad=new JTextField(10);
        btnAceptar=new JButton("Aceptar");
        btnCancelar=new JButton("Cancelar");
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                activo();
            }
        });
        /*
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });*/
        lbNombre=new JLabel("Nombre: ");
        lbEdad=new JLabel("Edad: ");
        pnlDatos=new JPanel(new GridLayout(2,1));
        JPanel pnlBotones = new JPanel(new BorderLayout());
        pnlDatos.add(lbNombre);
        pnlDatos.add(edtName);
        pnlDatos.add(lbEdad);
        pnlDatos.add(edtEdad);
        super.add(pnlDatos,BorderLayout.CENTER);
        pnlBotones.add(btnAceptar,BorderLayout.EAST);
        //pnlBotones.add(btnCancelar,BorderLayout.WEST);
        super.add(pnlBotones,BorderLayout.SOUTH);
    }
    public boolean activo(){
        return true;
    }
    
}
