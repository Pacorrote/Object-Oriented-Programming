/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import files.exception.ModoAperturaIncorrectoException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import objetos.FuncionSudoku;

/**
 *
 * @author Victor
 */
public class PrincipalFrame extends JFrame{
    private JLabel error;
    private JButton btnjugar;
    private Icon img;
    private JPanel pnlBoton;
    private JPanel pnlImag;
    private JPanel pnlJuego;
    private JTextField t00;
    private JTextField t01;
    private JTextField t02;
    private JTextField t03;
    private JTextField t04;
    private JTextField t05;
    private JTextField t06;
    private JTextField t07;
    private JTextField t08;
    private JTextField t10;
    private JTextField t11;
    private JTextField t12;
    private JTextField t13;
    private JTextField t14;
    private JTextField t15;
    private JTextField t16;
    private JTextField t17;
    private JTextField t18;
    private JTextField t20;
    private JTextField t21;
    private JTextField t22;
    private JTextField t23;
    private JTextField t24;
    private JTextField t25;
    private JTextField t26;
    private JTextField t27;
    private JTextField t28;
    private JTextField t30;
    private JTextField t31;
    private JTextField t32;
    private JTextField t33;
    private JTextField t34;
    private JTextField t35;
    private JTextField t36;
    private JTextField t37;
    private JTextField t38;
    private JTextField t40;
    private JTextField t41;
    private JTextField t42;
    private JTextField t43;
    private JTextField t44;
    private JTextField t45;
    private JTextField t46;
    private JTextField t47;
    private JTextField t48;
    private JTextField t50;
    private JTextField t51;
    private JTextField t52;
    private JTextField t53;
    private JTextField t54;
    private JTextField t55;
    private JTextField t56;
    private JTextField t57;
    private JTextField t58;
    private JTextField t60;
    private JTextField t61;
    private JTextField t62;
    private JTextField t63;
    private JTextField t64;
    private JTextField t65;
    private JTextField t66;
    private JTextField t67;
    private JTextField t68;
    private JTextField t70;
    private JTextField t71;
    private JTextField t72;
    private JTextField t73;
    private JTextField t74;
    private JTextField t75;
    private JTextField t76;
    private JTextField t77;
    private JTextField t78;
    private JTextField t80;
    private JTextField t81;
    private JTextField t82;
    private JTextField t83;
    private JTextField t84;
    private JTextField t85;
    private JTextField t86;
    private JTextField t87;
    private JTextField t88;
    private JPanel pnlTablero;
    private JPanel encabezado;
    private FuncionSudoku ng;
    //private DialogoDatos datos;
    private JButton btnevaluar;
    private JButton btnresolver;
    private JButton btnSalir;
    public PrincipalFrame() throws IOException, FileNotFoundException, ModoAperturaIncorrectoException{
        super("Sudoku");
        super.setSize(600,600);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setLayout(new BorderLayout());
        pnlTablero=new JPanel(new GridLayout(9,9));
        btnjugar = new JButton("Click");
        //datos = new DialogoDatos(this);
        encabezado=new JPanel(new FlowLayout());
        encabezado.setPreferredSize(new Dimension(0,50));
        error=new JLabel("Bien");
        error.setForeground(Color.WHITE);
        btnevaluar=new JButton("Evaluar");
        btnresolver=new JButton("Resolver");
        encabezado.add(btnresolver);
        encabezado.add(error);
        encabezado.add(btnevaluar);
        
        pnlTablero.setPreferredSize(new Dimension(600,600));
        btnjugar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              pnlImag.setVisible(false);
              pnlBoton.setVisible(false);
              //pnlTablero.setVisible(true);
              //datos.setVisible(true);
              //if(datos.activo()){
                  pnlTablero.setVisible(true);
                  encabezado.setVisible(true);
              //}
            }
        });
        pnlBoton=new JPanel(new FlowLayout());
        pnlBoton.add(new JLabel("Click para jugar "));
        pnlBoton.add(btnjugar);
        img = new ImageIcon(getClass().getResource("/sudoku.jpg"));
        JLabel gif = new JLabel(img);
        pnlImag = new JPanel(new BorderLayout());
        pnlImag.add(gif,BorderLayout.NORTH);
        pnlImag.add(pnlBoton,BorderLayout.SOUTH);
        
        super.getContentPane().add(pnlImag,BorderLayout.NORTH);
        pnlTablero.setVisible(false);
        super.add(pnlTablero,BorderLayout.CENTER);
        //super.setVisible(true);
        //-------------------------------------
        ng = new FuncionSudoku();
        //ng.cargar_juego();
        
        t00= new JTextField();
        t00.setBackground(Color.CYAN);
        t01= new JTextField();
        t01.setBackground(Color.CYAN);
        t02= new JTextField();
        t02.setBackground(Color.CYAN);
        t03= new JTextField();
        t03.setBackground(Color.RED);
        t04= new JTextField();
        t04.setBackground(Color.RED);
        t05= new JTextField();
        t05.setBackground(Color.RED);
        t06= new JTextField();
        t06.setBackground(Color.CYAN);
        t07= new JTextField();
        t07.setBackground(Color.CYAN);
        t08= new JTextField();
        t08.setBackground(Color.CYAN);
        t10= new JTextField();
        t10.setBackground(Color.CYAN);
        t11= new JTextField();
        t11.setBackground(Color.CYAN);
        t12= new JTextField();
        t12.setBackground(Color.CYAN);
        t13= new JTextField();
        t13.setBackground(Color.RED);
        t14= new JTextField();
        t14.setBackground(Color.RED);
        t15= new JTextField();
        t15.setBackground(Color.RED);
        t16= new JTextField();
        t16.setBackground(Color.CYAN);
        t17= new JTextField();
        t17.setBackground(Color.CYAN);
        t18= new JTextField();
        t18.setBackground(Color.CYAN);
        t20= new JTextField();
        t20.setBackground(Color.CYAN);
        t21= new JTextField();
        t21.setBackground(Color.CYAN);
        t22= new JTextField();
        t22.setBackground(Color.CYAN);
        t23= new JTextField();
        t23.setBackground(Color.RED);
        t24= new JTextField();
        t24.setBackground(Color.RED);
        t25= new JTextField();
        t25.setBackground(Color.RED);
        t26= new JTextField();
        t26.setBackground(Color.CYAN);
        t27= new JTextField();
        t27.setBackground(Color.CYAN);
        t28= new JTextField();
        t28.setBackground(Color.CYAN);
        t30= new JTextField();
        t30.setBackground(Color.RED);
        t31= new JTextField();
        t31.setBackground(Color.RED);
        t32= new JTextField();
        t32.setBackground(Color.RED);
        t33= new JTextField();
        t33.setBackground(Color.CYAN);
        t34= new JTextField();
        t34.setBackground(Color.CYAN);
        t35= new JTextField();
        t35.setBackground(Color.CYAN);
        t36= new JTextField();
        t36.setBackground(Color.RED);
        t37= new JTextField();
        t37.setBackground(Color.RED);
        t38= new JTextField();
        t38.setBackground(Color.RED);
        t40= new JTextField();
        t40.setBackground(Color.RED);
        t41= new JTextField();
        t41.setBackground(Color.RED);
        t42= new JTextField();
        t42.setBackground(Color.RED);
        t43= new JTextField();
        t43.setBackground(Color.CYAN);
        t44= new JTextField();
        t44.setBackground(Color.CYAN);
        t45= new JTextField();
        t45.setBackground(Color.CYAN);
        t46= new JTextField();
        t46.setBackground(Color.RED);
        t47= new JTextField();
        t47.setBackground(Color.RED);
        t48= new JTextField();
        t48.setBackground(Color.RED);
        t50= new JTextField();
        t50.setBackground(Color.RED);
        t51= new JTextField();
        t51.setBackground(Color.RED);
        t52= new JTextField();
        t52.setBackground(Color.RED);
        t53= new JTextField();
        t53.setBackground(Color.CYAN);
        t54= new JTextField();
        t54.setBackground(Color.CYAN);
        t55= new JTextField();
        t55.setBackground(Color.CYAN);
        t56= new JTextField();
        t56.setBackground(Color.RED);
        t57= new JTextField();
        t57.setBackground(Color.RED);
        t58= new JTextField();
        t58.setBackground(Color.RED);
        t60= new JTextField();
        t60.setBackground(Color.CYAN);
        t61= new JTextField();
        t61.setBackground(Color.CYAN);
        t62= new JTextField();
        t62.setBackground(Color.CYAN);
        t63= new JTextField();
        t63.setBackground(Color.RED);
        t64= new JTextField();
        t64.setBackground(Color.RED);
        t65= new JTextField();
        t65.setBackground(Color.RED);
        t66= new JTextField();
        t66.setBackground(Color.CYAN);
        t67= new JTextField();
        t67.setBackground(Color.CYAN);
        t68= new JTextField();
        t68.setBackground(Color.CYAN);
        t70= new JTextField();
        t70.setBackground(Color.CYAN);
        t71= new JTextField();
        t71.setBackground(Color.CYAN);
        t72= new JTextField();
        t72.setBackground(Color.CYAN);
        t73= new JTextField();
        t73.setBackground(Color.RED);
        t74= new JTextField();
        t74.setBackground(Color.RED);
        t75= new JTextField();
        t75.setBackground(Color.RED);
        t76= new JTextField();
        t76.setBackground(Color.CYAN);
        t77= new JTextField();
        t77.setBackground(Color.CYAN);
        t78= new JTextField();
        t78.setBackground(Color.CYAN);
        t80= new JTextField();
        t80.setBackground(Color.CYAN);
        t81= new JTextField();
        t81.setBackground(Color.CYAN);
        t82= new JTextField();
        t82.setBackground(Color.CYAN);
        t83= new JTextField();
        t83.setBackground(Color.RED);
        t84= new JTextField();
        t84.setBackground(Color.RED);
        t85= new JTextField();
        t85.setBackground(Color.RED);
        t86= new JTextField();
        t86.setBackground(Color.CYAN);
        t87= new JTextField();
        t87.setBackground(Color.CYAN);
        t88= new JTextField();
        t88.setBackground(Color.CYAN);
        //valores asignados
        t00.setText(String.valueOf(ng.matriz[0][0]));
        t00.setEditable(false);
        t02.setText(String.valueOf(ng.matriz[0][2]));
        t02.setEditable(false);
        t05.setText(String.valueOf(ng.matriz[0][5]));
        t05.setEditable(false);
        t06.setText(String.valueOf(ng.matriz[0][6]));
        t06.setEditable(false);
        t07.setText(String.valueOf(ng.matriz[0][7]));
        t07.setEditable(false);
        t18.setText(String.valueOf(ng.matriz[1][8]));
        t18.setEditable(false);
        t21.setText(String.valueOf(ng.matriz[2][1]));
        t21.setEditable(false);
        t22.setText(String.valueOf(ng.matriz[2][2]));
        t22.setEditable(false);
        t24.setText(String.valueOf(ng.matriz[2][4]));
        t24.setEditable(false);
        t26.setText(String.valueOf(ng.matriz[2][6]));
        t26.setEditable(false);
        t33.setText(String.valueOf(ng.matriz[3][3]));
        t33.setEditable(false);
        t35.setText(String.valueOf(ng.matriz[3][5]));
        t35.setEditable(false);
        t36.setText(String.valueOf(ng.matriz[3][6]));
        t36.setEditable(false);
        t37.setText(String.valueOf(ng.matriz[3][7]));
        t37.setEditable(false);
        t41.setText(String.valueOf(ng.matriz[4][1]));
        t41.setEditable(false);
        t42.setText(String.valueOf(ng.matriz[4][2]));
        t42.setEditable(false);
        t46.setText(String.valueOf(ng.matriz[4][6]));
        t46.setEditable(false);
        t47.setText(String.valueOf(ng.matriz[4][7]));
        t47.setEditable(false);
        t51.setText(String.valueOf(ng.matriz[5][1]));
        t51.setEditable(false);
        t52.setText(String.valueOf(ng.matriz[5][2]));
        t52.setEditable(false);
        t53.setText(String.valueOf(ng.matriz[5][3]));
        t53.setEditable(false);
        t55.setText(String.valueOf(ng.matriz[5][5]));
        t55.setEditable(false);
        t62.setText(String.valueOf(ng.matriz[6][2]));
        t62.setEditable(false);
        t64.setText(String.valueOf(ng.matriz[6][4]));
        t64.setEditable(false);
        t66.setText(String.valueOf(ng.matriz[6][6]));
        t66.setEditable(false);
        t67.setText(String.valueOf(ng.matriz[6][7]));
        t67.setEditable(false);
        t70.setText(String.valueOf(ng.matriz[7][0]));
        t70.setEditable(false);
        t74.setText(String.valueOf(ng.matriz[7][4]));
        t74.setEditable(false);
        t81.setText(String.valueOf(ng.matriz[8][1]));
        t81.setEditable(false);
        t82.setText(String.valueOf(ng.matriz[8][2]));
        t82.setEditable(false);
        t83.setText(String.valueOf(ng.matriz[8][3]));
        t83.setEditable(false);
        t87.setText(String.valueOf(ng.matriz[8][7]));
        t87.setEditable(false);
        
        pnlTablero.add(t00);
        //ActionListener
        pnlTablero.add(t01);
        pnlTablero.add(t02);
        pnlTablero.add(t03);
        pnlTablero.add(t04);
        pnlTablero.add(t05);
        pnlTablero.add(t06);
        pnlTablero.add(t07);
        pnlTablero.add(t08);
        pnlTablero.add(t10);
        pnlTablero.add(t11);
        pnlTablero.add(t12);
        pnlTablero.add(t13);
        pnlTablero.add(t14);
        pnlTablero.add(t15);
        pnlTablero.add(t16);
        pnlTablero.add(t17);
        pnlTablero.add(t18);
        pnlTablero.add(t20);
        pnlTablero.add(t21);
        pnlTablero.add(t22);
        pnlTablero.add(t23);
        pnlTablero.add(t24);
        pnlTablero.add(t25);
        pnlTablero.add(t26);
        pnlTablero.add(t27);
        pnlTablero.add(t28);
        pnlTablero.add(t30);
        pnlTablero.add(t31);
        pnlTablero.add(t32);
        pnlTablero.add(t33);
        pnlTablero.add(t34);
        pnlTablero.add(t35);
        pnlTablero.add(t36);
        pnlTablero.add(t37);
        pnlTablero.add(t38);
        pnlTablero.add(t40);
        pnlTablero.add(t41);
        pnlTablero.add(t42);
        pnlTablero.add(t43);
        pnlTablero.add(t44);
        pnlTablero.add(t45);
        pnlTablero.add(t46);
        pnlTablero.add(t47);
        pnlTablero.add(t48);
        pnlTablero.add(t50);
        pnlTablero.add(t51);
        pnlTablero.add(t52);
        pnlTablero.add(t53);
        pnlTablero.add(t54);
        pnlTablero.add(t55);
        pnlTablero.add(t56);
        pnlTablero.add(t57);
        pnlTablero.add(t58);
        pnlTablero.add(t60);
        pnlTablero.add(t61);
        pnlTablero.add(t62);
        pnlTablero.add(t63);
        pnlTablero.add(t64);
        pnlTablero.add(t65);
        pnlTablero.add(t66);
        pnlTablero.add(t67);
        pnlTablero.add(t68);
        pnlTablero.add(t70);
        pnlTablero.add(t71);
        pnlTablero.add(t72);
        pnlTablero.add(t73);
        pnlTablero.add(t74);
        pnlTablero.add(t75);
        pnlTablero.add(t76);
        pnlTablero.add(t77);
        pnlTablero.add(t78);
        pnlTablero.add(t80);
        pnlTablero.add(t81);
        pnlTablero.add(t82);
        pnlTablero.add(t83);
        pnlTablero.add(t84);
        pnlTablero.add(t85);
        pnlTablero.add(t86);
        pnlTablero.add(t87);
        pnlTablero.add(t88);        
        t01.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t01.getText())){
                    if(ng.existe_fila(Integer.valueOf(t01.getText()),0)){
                        error.setText("Mal");
                        t01.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t01.getText()),1)){
                            error.setText("Mal");
                            t01.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t01.getText()),0,1)){
                                error.setText("Mal");
                                t01.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[0][1] = Integer.valueOf(t01.getText());
                                error.setText("Bien");
                                //t01.setEditable(false);
                                t01.setBackground(Color.CYAN);
                                ng.terminado();
                                
                            }
                        }
                    
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t01.setBackground(Color.CYAN);
                ng.matriz[0][1]=0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t01.setBackground(Color.CYAN);
                //ng.matriz[8][8] =0;
            }
        });
        t03.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t03.getText())){
                    if(ng.existe_fila(Integer.valueOf(t03.getText()),0)){
                        error.setText("Mal");
                        t03.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t03.getText()),3)){
                            error.setText("Mal");
                            t03.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t03.getText()),0,3)){
                                error.setText("Mal");
                                t03.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[0][3] = Integer.valueOf(t03.getText());
                                error.setText("Bien");
                                t03.setBackground(Color.decode("#FBFBEF"));
                                ng.terminado();
                                //t03.setEditable(false);
                            }
                        }
                    
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e){
                t03.setBackground(Color.decode("#FBFBEF"));
                ng.matriz[0][3]=0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t03.setBackground(Color.decode("#FBFBEF"));
                //ng.matriz[0][3]=0;
            }
        });
        t04.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t04.getText())){
                    if(ng.existe_fila(Integer.valueOf(t04.getText()),0)){
                        error.setText("Mal");
                        t04.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t04.getText()),4)){
                            error.setText("Mal");
                            t04.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t04.getText()),0,4)){
                                error.setText("Mal");
                                t04.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[0][4] = Integer.valueOf(t04.getText());
                                error.setText("Bien");
                                t04.setBackground(Color.decode("#FBFBEF"));
                                ng.terminado();
                                //t04.setEditable(false);
                            }
                        }
                    
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t04.setBackground(Color.decode("#FBFBEF"));
                ng.matriz[0][4]=0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t04.setBackground(Color.decode("#FBFBEF"));
                //ng.matriz[8][8] =0;
            }
        });
        t07.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t07.getText())){
                    if(ng.existe_fila(Integer.valueOf(t07.getText()),0)){
                        error.setText("Mal");
                        t07.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t07.getText()),7)){
                            error.setText("Mal");
                            t07.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t07.getText()),0,7)){
                                error.setText("Mal");
                                t07.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[0][7] = Integer.valueOf(t07.getText());
                                error.setText("Bien");
                                t07.setBackground(Color.CYAN);
                                ng.terminado();
                                //t07.setEditable(false);
                            }
                        }
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t07.setBackground(Color.CYAN);
                ng.matriz[0][7] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t07.setBackground(Color.CYAN);
                //ng.matriz[8][8] =0;
            }
        });
        t08.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t08.getText())){
                    if(ng.existe_fila(Integer.valueOf(t08.getText()),0)){
                        error.setText("Mal");
                        t08.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t08.getText()),8)){
                            error.setText("Mal");
                            t08.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t08.getText()),0,8)){
                                error.setText("Mal");
                                t08.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[0][8] = Integer.valueOf(t08.getText());
                                error.setText("Bien");
                                t08.setBackground(Color.CYAN);
                                ng.terminado();
                                //t08.setEditable(false);
                            }
                        }
                    
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t08.setBackground(Color.CYAN);
                ng.matriz[0][8]=0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t08.setBackground(Color.CYAN);
                //ng.matriz[8][8] =0;
            }
        });
        t10.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t10.getText())){
                    if(ng.existe_fila(Integer.valueOf(t10.getText()),1)){
                        error.setText("MAL");
                        t10.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t10.getText()),0)){
                            error.setText("Mal");
                            t10.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t10.getText()),1,0)){
                                t10.setBackground(Color.decode("#FF9633"));
                                error.setText("Mal");
                            }else{
                                ng.matriz[1][0] = Integer.valueOf(t10.getText());
                                t10.setBackground(Color.CYAN);
                                error.setText("Bien");
                                ng.terminado();
                                //t10.setEditable(false);
                            }
                        }
                    
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t10.setBackground(Color.CYAN);
                ng.matriz[1][0]=0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t10.setBackground(Color.CYAN);
                //ng.matriz[8][8] =0;
            }
        });
        t11.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t11.getText())){
                    if(ng.existe_fila(Integer.valueOf(t11.getText()),1)){
                        error.setText("Mal");
                        t11.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t11.getText()),1)){
                            t11.setBackground(Color.decode("#FF9633"));
                            error.setText("Mal");
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t11.getText()),1,1)){
                                t11.setBackground(Color.decode("#FF9633"));
                                error.setText("Mal");
                            }else{
                                ng.matriz[1][1] = Integer.valueOf(t11.getText());
                                error.setText("Bien");
                                t11.setBackground(Color.CYAN);
                                ng.terminado();
                                //t11.setEditable(false);
                            }
                        }
                    
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t11.setBackground(Color.CYAN);
                ng.matriz[1][1]=0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t11.setBackground(Color.CYAN);
                //ng.matriz[8][8] =0;
            }
        });
        t12.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t12.getText())){
                    if(ng.existe_fila(Integer.valueOf(t12.getText()),1)){
                        error.setText("Mal");
                        t12.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t12.getText()),2)){
                            error.setText("Mal");
                            t12.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t12.getText()),1,2)){
                                t12.setBackground(Color.decode("#FF9633"));
                                error.setText("Mal");
                            }else{
                                ng.matriz[1][2] = Integer.valueOf(t12.getText());
                                error.setText("Bien");
                                t12.setBackground(Color.CYAN);
                                ng.terminado();
                                //t12.setEditable(false);
                            }
                        }
                    
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t12.setBackground(Color.CYAN);
                ng.matriz[1][2]=0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t12.setBackground(Color.CYAN);
                //ng.matriz[8][8] =0;
            }
        });
        t13.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t13.getText())){
                    if(ng.existe_fila(Integer.valueOf(t13.getText()),1)){
                        error.setText("Mal");
                        t13.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t13.getText()),3)){
                            error.setText("Mal");
                            t13.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t13.getText()),1,3)){
                                t13.setBackground(Color.decode("#FF9633"));
                                error.setText("Mal");
                            }else{
                                ng.matriz[1][3] = Integer.valueOf(t13.getText());
                                error.setText("Bien");
                                t13.setBackground(Color.decode("#FBFBEF"));
                                ng.terminado();
                                //t13.setEditable(false);
                            }
                        }
                    
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t13.setBackground(Color.decode("#FBFBEF"));
                ng.matriz[1][3] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t13.setBackground(Color.decode("#FBFBEF"));
                //ng.matriz[8][8] =0;
            }
        });
        t14.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t14.getText())){
                    if(ng.existe_fila(Integer.valueOf(t14.getText()),1)){
                        error.setText("Mal");
                        t14.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t14.getText()),4)){
                            error.setText("Mal");
                            t14.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t14.getText()),1,4)){
                                error.setText("Mal");
                                t14.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[1][4] = Integer.valueOf(t14.getText());
                                error.setText("Bien");
                                t14.setBackground(Color.decode("#FBFBEF"));
                                ng.terminado();
                                //t14.setEditable(false);
                            }
                        }
                    
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t14.setBackground(Color.decode("#FBFBEF"));
                ng.matriz[1][4] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t14.setBackground(Color.decode("#FBFBEF"));
                //ng.matriz[8][8] =0;
            }
        });
        t15.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t15.getText())){
                    if(ng.existe_fila(Integer.valueOf(t15.getText()),1)){
                        error.setText("Mal");
                        t15.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t15.getText()),5)){
                            error.setText("Mal");
                            t15.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t15.getText()),1,5)){
                                error.setText("Mal");
                                t15.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[1][5] = Integer.valueOf(t15.getText());
                                error.setText("Bien");
                                t15.setBackground(Color.decode("#FBFBEF"));
                                ng.terminado();
                                //t15.setEditable(false);
                            }
                        }
                    
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t15.setBackground(Color.decode("#FBFBEF"));
                ng.matriz[1][5] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t15.setBackground(Color.decode("#FBFBEF"));
                //ng.matriz[8][8] =0;
            }
        });
        t16.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t16.getText())){
                    if(ng.existe_fila(Integer.valueOf(t16.getText()),1)){
                        error.setText("Mal");
                        t16.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t16.getText()),6)){
                            error.setText("Mal");
                            t16.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t16.getText()),1,6)){
                                error.setText("Mal");
                                t16.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[1][6] = Integer.valueOf(t16.getText());
                                error.setText("Bien");
                                t16.setBackground(Color.CYAN);
                                ng.terminado();
                                //t16.setEditable(false);
                            }
                        }
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t16.setBackground(Color.CYAN);
                ng.matriz[1][6]=0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t16.setBackground(Color.CYAN);
                //ng.matriz[1][6]=0;
            }
        });
        t17.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t17.getText())){
                    if(ng.existe_fila(Integer.valueOf(t17.getText()),1)){
                        error.setText("Mal");
                        t17.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t17.getText()),7)){
                            error.setText("Mal");
                            t17.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t17.getText()),1,7)){
                                error.setText("Mal");
                                t17.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[1][7] = Integer.valueOf(t17.getText());
                                error.setText("Bien");
                                t17.setBackground(Color.CYAN);
                                ng.terminado();
                                //t17.setEditable(false);
                            }
                        }
                    
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                 t17.setBackground(Color.CYAN);
                 ng.matriz[1][7]=0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                 t17.setBackground(Color.CYAN);
                 //ng.matriz[8][8] =0;
            }
        });
         t20.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t20.getText())){
                    if(ng.existe_fila(Integer.valueOf(t20.getText()),2)){
                        error.setText("Mal");
                        t20.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t20.getText()),0)){
                            error.setText("Mal");
                            t20.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t20.getText()),2,0)){
                                error.setText("Mal");
                                t20.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[2][0] = Integer.valueOf(t20.getText());
                                error.setText("Bien");
                                t20.setBackground(Color.CYAN);
                                ng.terminado();
                                //t20.setEditable(false);
                            }
                        }
                    
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t20.setBackground(Color.CYAN);
                ng.matriz[2][0] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t20.setBackground(Color.CYAN);
                //ng.matriz[8][8] =0;
            }
        }); 
         t23.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t23.getText())){
                    if(ng.existe_fila(Integer.valueOf(t23.getText()),2)){
                        error.setText("Mal");
                        t23.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t23.getText()),3)){
                            error.setText("Mal");
                            t23.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t23.getText()),2,3)){
                                error.setText("Mal");
                                t23.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[2][3] = Integer.valueOf(t23.getText());
                                error.setText("Bien");
                                t23.setBackground(Color.decode("#FBFBEF"));
                                ng.terminado();
                                //t23.setEditable(false);
                            }
                        }
                    
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t23.setBackground(Color.decode("#FBFBEF"));
                ng.matriz[2][3]=0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t23.setBackground(Color.decode("#FBFBEF"));
                //ng.matriz[8][8] =0;
            }
        }); 
         t25.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t25.getText())){
                    if(ng.existe_fila(Integer.valueOf(t25.getText()),2)){
                        error.setText("Mal");
                        t25.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t25.getText()),5)){
                            error.setText("Mal");
                            t25.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t25.getText()),2,5)){
                                error.setText("Mal");
                                t25.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[2][5] = Integer.valueOf(t25.getText());
                                error.setText("Bien");
                                t25.setBackground(Color.decode("#FBFBEF"));
                                ng.terminado();
                                //t25.setEditable(false);
                            }
                        }
                    
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t25.setBackground(Color.decode("#FBFBEF"));
                ng.matriz[2][5] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t25.setBackground(Color.decode("#FBFBEF"));
                //ng.matriz[8][8] =0;
            }
        }); 
         t27.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t27.getText())){
                    if(ng.existe_fila(Integer.valueOf(t27.getText()),2)){
                        error.setText("Mal");
                        t27.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t27.getText()),7)){
                            error.setText("Mal");
                            t27.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t27.getText()),2,7)){
                                error.setText("Mal");
                                t27.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[2][7] = Integer.valueOf(t27.getText());
                                error.setText("Bien");
                                t27.setBackground(Color.CYAN);
                                ng.terminado();
                                //t27.setEditable(false);
                            }
                        }
                    
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t27.setBackground(Color.CYAN);
                ng.matriz[2][7] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t27.setBackground(Color.CYAN);
                //ng.matriz[8][8] =0;
            }
        }); 
         t28.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t28.getText())){
                    if(ng.existe_fila(Integer.valueOf(t28.getText()),2)){
                        error.setText("Mal");
                        t28.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t28.getText()),8)){
                            error.setText("Mal");
                            t28.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t28.getText()),2,8)){
                                error.setText("Mal");
                                t28.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[2][8] = Integer.valueOf(t28.getText());
                                error.setText("Bien");
                                t28.setBackground(Color.CYAN);
                                ng.terminado();
                                //t28.setEditable(false);
                            }
                        }
                    
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t28.setBackground(Color.CYAN);
                ng.matriz[2][8] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t28.setBackground(Color.CYAN);
                //ng.matriz[8][8] =0;
            }
        }); 
         t30.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t30.getText())){
                    if(ng.existe_fila(Integer.valueOf(t30.getText()),3)){
                        error.setText("Mal");
                        t30.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t30.getText()),0)){
                            error.setText("Mal");
                            t30.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t30.getText()),3,0)){
                                error.setText("Mal");
                                t30.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[3][0] = Integer.valueOf(t30.getText());
                                error.setText("Bien");
                                t30.setBackground(Color.decode("#FBFBEF"));
                                ng.terminado();
                                //t30.setEditable(false);
                            }
                        }
                    
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t30.setBackground(Color.decode("#FBFBEF"));
                ng.matriz[3][0] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t30.setBackground(Color.decode("#FBFBEF"));
                //ng.matriz[8][8] =0;
            }
        }); 
         t31.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t31.getText())){
                    if(ng.existe_fila(Integer.valueOf(t31.getText()),3)){
                        error.setText("Mal");
                        t31.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t31.getText()),1)){
                            error.setText("Mal");
                            t31.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t31.getText()),3,1)){
                                error.setText("Mal");
                                t31.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[3][1] = Integer.valueOf(t31.getText());
                                error.setText("Bien");
                                t31.setBackground(Color.decode("#FBFBEF"));
                                ng.terminado();
                                //t31.setEditable(false);
                            }
                        }
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t31.setBackground(Color.decode("#FBFBEF"));
                ng.matriz[3][1] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t31.setBackground(Color.decode("#FBFBEF"));
                //ng.matriz[8][8] =0;
            }
        }); 
         t32.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t32.getText())){
                    if(ng.existe_fila(Integer.valueOf(t32.getText()),3)){
                        error.setText("Mal");
                        t32.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t32.getText()),2)){
                            error.setText("Mal");
                            t32.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t32.getText()),3,2)){
                                error.setText("Mal");
                                t32.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[3][2] = Integer.valueOf(t32.getText());
                                error.setText("Bien");
                                t32.setBackground(Color.decode("#FBFBEF"));
                                ng.terminado();
                                //t32.setEditable(false);
                            }
                        }
                    
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t32.setBackground(Color.decode("#FBFBEF"));
                ng.matriz[3][2] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t32.setBackground(Color.decode("#FBFBEF"));
                //ng.matriz[8][8] =0;
            }
        });
        t34.getDocument().addDocumentListener(new DocumentListener() {
           @Override
           public void insertUpdate(DocumentEvent e) {
               if(ng.comprobar_valor(t34.getText())){
                   if(ng.existe_fila(Integer.valueOf(t34.getText()),3)){
                       error.setText("Mal");
                       t34.setBackground(Color.decode("#FF9633"));
                   }else{
                       if(ng.existe_columna(Integer.valueOf(t34.getText()),4)){
                           error.setText("Mal");
                           t34.setBackground(Color.decode("#FF9633"));
                       }else{
                            if(ng.existe_caja(Integer.valueOf(t34.getText()),3,4)){
                                error.setText("Mal");
                                t34.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[3][4] = Integer.valueOf(t34.getText());
                                error.setText("Bien");
                                t34.setBackground(Color.CYAN);
                                ng.terminado();
                                //t34.setEditable(false);
                            }
                        }
                    
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t34.setBackground(Color.CYAN);
                ng.matriz[3][4] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t34.setBackground(Color.CYAN);
                //ng.matriz[8][8] =0;
            }
        });
        t38.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t38.getText())){
                    if(ng.existe_fila(Integer.valueOf(t38.getText()),3)){
                        error.setText("Mal");
                        t38.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t38.getText()),8)){
                            error.setText("Mal");
                            t38.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t38.getText()),3,8)){
                                error.setText("Mal");
                                t38.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[3][8] = Integer.valueOf(t38.getText());
                                error.setText("Bien");
                                t38.setBackground(Color.decode("#FBFBEF"));
                                ng.terminado();
                                //t38.setEditable(false);
                            }
                        }
                    
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t38.setBackground(Color.decode("#FBFBEF"));
                ng.matriz[3][8] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t38.setBackground(Color.decode("#FBFBEF"));
                //ng.matriz[8][8] =0;
            }
        });
        t40.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t40.getText())){
                    if(ng.existe_fila(Integer.valueOf(t40.getText()),4)){
                        error.setText("Mal");
                        t40.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t40.getText()),0)){
                            error.setText("Mal");
                            t40.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t40.getText()),4,0)){
                                error.setText("Mal");
                                t40.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[4][0] = Integer.valueOf(t40.getText());
                                error.setText("Bien");
                                t40.setBackground(Color.decode("#FBFBEF"));
                                ng.terminado();
                                //t40.setEditable(false);
                            }
                        }
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t40.setBackground(Color.decode("#FBFBEF"));
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t40.setBackground(Color.decode("#FBFBEF"));
                //ng.matriz[8][8] =0;
            }
        });
        t43.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t43.getText())){
                    if(ng.existe_fila(Integer.valueOf(t43.getText()),4)){
                        error.setText("Mal");
                        t43.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t43.getText()),3)){
                            error.setText("Mal");
                            t43.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t43.getText()),4,3)){
                                error.setText("Mal");
                                t43.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[4][3] = Integer.valueOf(t43.getText());
                                error.setText("Bien");
                                t43.setBackground(Color.CYAN);
                                ng.terminado();
                                //t43.setEditable(false);
                            }
                        }
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t43.setBackground(Color.CYAN);
                ng.matriz[4][3] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t43.setBackground(Color.CYAN);
                //ng.matriz[8][8] =0;
            }
        });
        t44.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t44.getText())){
                    if(ng.existe_fila(Integer.valueOf(t44.getText()),4)){
                        error.setText("Mal");
                        t44.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t44.getText()),4)){
                            error.setText("Mal");
                            t44.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t44.getText()),4,4)){
                                error.setText("Mal");
                                t44.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[4][4] = Integer.valueOf(t44.getText());
                                error.setText("Bien");
                                t44.setBackground(Color.CYAN);
                                //t44.setEditable(false);
                                ng.terminado();
                            }
                        }
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t44.setBackground(Color.CYAN);
                ng.matriz[4][4] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t44.setBackground(Color.CYAN);
                //ng.matriz[8][8] =0;
            }
        });
        t45.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t45.getText())){
                    if(ng.existe_fila(Integer.valueOf(t45.getText()),4)){
                        error.setText("Mal");
                        t45.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t45.getText()),5)){
                            error.setText("Mal");
                            t45.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t45.getText()),4,5)){
                                error.setText("Mal");
                                t45.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[4][5] = Integer.valueOf(t45.getText());
                                error.setText("Bien");
                                t45.setBackground(Color.CYAN);
                                ng.terminado();
                                //t45.setEditable(false);
                            }
                        }
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t45.setBackground(Color.CYAN);
                ng.matriz[4][5] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t45.setBackground(Color.CYAN);
                //ng.matriz[8][8] =0;
            }
        });
        t48.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t48.getText())){
                    if(ng.existe_fila(Integer.valueOf(t48.getText()),4)){
                        error.setText("Mal");
                        t48.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t48.getText()),8)){
                            error.setText("Mal");
                            t48.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t48.getText()),4,8)){
                                error.setText("Mal");
                                t48.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[4][8] = Integer.valueOf(t48.getText());
                                error.setText("Bien");
                                t48.setBackground(Color.decode("#FBFBEF"));
                                ng.terminado();
                                //t48.setEditable(false);
                            }
                        }
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t48.setBackground(Color.decode("#FBFBEF"));
                ng.matriz[4][8] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t48.setBackground(Color.decode("#FBFBEF"));
                //ng.matriz[8][8] =0;
            }
        });
        t50.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t50.getText())){
                    if(ng.existe_fila(Integer.valueOf(t50.getText()),5)){
                        error.setText("Mal");
                        t50.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t50.getText()),0)){
                            error.setText("Mal");
                            t50.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t50.getText()),5,0)){
                                error.setText("Mal");
                                t50.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[5][0] = Integer.valueOf(t50.getText());
                                error.setText("Bien");
                                t50.setBackground(Color.decode("#FBFBEF"));
                                ng.terminado();
                                //t50.setEditable(false);
                            }
                        }
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t50.setBackground(Color.decode("#FBFBEF"));
                ng.matriz[5][0] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t50.setBackground(Color.decode("#FBFBEF"));
                //ng.matriz[8][8] =0;
            }
        });
        t54.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t54.getText())){
                    if(ng.existe_fila(Integer.valueOf(t54.getText()),5)){
                        error.setText("Mal");
                        t54.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t54.getText()),4)){
                            error.setText("Mal");
                            t54.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t54.getText()),5,4)){
                                error.setText("Mal");
                                t54.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[5][4] = Integer.valueOf(t54.getText());
                                error.setText("Bien");
                                t54.setBackground(Color.CYAN);
                                ng.terminado();
                                //t54.setEditable(false);
                            }
                        }
                    
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t54.setBackground(Color.CYAN);
                ng.matriz[5][4] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t54.setBackground(Color.CYAN);
                //ng.matriz[8][8] =0;
            }
        });
        t56.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t56.getText())){
                    if(ng.existe_fila(Integer.valueOf(t56.getText()),5)){
                        error.setText("Mal");
                        t56.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t56.getText()),6)){
                            error.setText("Mal");
                            t56.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t56.getText()),5,6)){
                                error.setText("Mal");
                                t56.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[5][6] = Integer.valueOf(t56.getText());
                                error.setText("Bien");
                                t56.setBackground(Color.decode("#FBFBEF"));
                                ng.terminado();
                                //t56.setEditable(false);
                            }
                        }
                    
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t56.setBackground(Color.decode("#FBFBEF"));
                ng.matriz[5][6] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t56.setBackground(Color.decode("#FBFBEF"));
                //ng.matriz[8][8] =0;
            }
        });
        t57.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t57.getText())){
                    if(ng.existe_fila(Integer.valueOf(t57.getText()),5)){
                        error.setText("Mal");
                        t57.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t57.getText()),7)){
                            error.setText("Mal");
                            t57.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t57.getText()),5,7)){
                                error.setText("Mal");
                                t57.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[5][7] = Integer.valueOf(t57.getText());
                                error.setText("Bien");
                                t57.setBackground(Color.decode("#FBFBEF"));
                                ng.terminado();
                                //t57.setEditable(false);
                            }
                        }
                    
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t57.setBackground(Color.decode("#FBFBEF"));
                ng.matriz[5][7] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t57.setBackground(Color.decode("#FBFBEF"));
                //ng.matriz[8][8] =0;
            }
        });
        t58.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t58.getText())){
                    if(ng.existe_fila(Integer.valueOf(t58.getText()),5)){
                        error.setText("Mal");
                        t58.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t58.getText()),8)){
                            error.setText("Mal");
                            t58.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t58.getText()),5,8)){
                                error.setText("Mal");
                                t58.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[5][8] = Integer.valueOf(t58.getText());
                                error.setText("Bien");
                                t58.setBackground(Color.decode("#FBFBEF"));
                                ng.terminado();
                                //t58.setEditable(false);
                            }
                        }
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t58.setBackground(Color.decode("#FBFBEF"));
                ng.matriz[5][8] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t58.setBackground(Color.decode("#FBFBEF"));
                //ng.matriz[8][8] =0;
            }
        });
        //HASTA AQUI
        t60.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t60.getText())){
                    if(ng.existe_fila(Integer.valueOf(t60.getText()),6)){
                        error.setText("Mal");
                        t60.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t60.getText()),0)){
                            error.setText("Mal");
                            t60.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t60.getText()),6,0)){
                                error.setText("Mal");
                                t60.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[6][0] = Integer.valueOf(t60.getText());
                                error.setText("Bien");
                                t60.setBackground(Color.CYAN);
                                ng.terminado();
                                //t60.setEditable(false);
                            }
                        }
                    
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t60.setBackground(Color.CYAN);
                ng.matriz[6][0] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t60.setBackground(Color.CYAN);
                //ng.matriz[8][8] =0;
            }
        });
        t61.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t61.getText())){
                    if(ng.existe_fila(Integer.valueOf(t61.getText()),6)){
                        error.setText("Mal");
                        t61.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t61.getText()),1)){
                            error.setText("Mal");
                            t61.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t61.getText()),6,1)){
                                error.setText("Mal");
                                t61.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[6][1] = Integer.valueOf(t61.getText());
                                error.setText("Bien");
                                t61.setBackground(Color.CYAN);
                                ng.terminado();
                                //t61.setEditable(false);
                            }
                        }
                    
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t61.setBackground(Color.CYAN);
                ng.matriz[6][1] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t61.setBackground(Color.CYAN);
                //ng.matriz[8][8] =0;
            }
        });
        t63.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t63.getText())){
                    if(ng.existe_fila(Integer.valueOf(t63.getText()),6)){
                        error.setText("Mal");
                        t63.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t63.getText()),3)){
                            error.setText("Mal");
                            t63.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t63.getText()),6,3)){
                                error.setText("Mal");
                                t63.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[6][3] = Integer.valueOf(t63.getText());
                                error.setText("Bien");
                                t63.setBackground(Color.decode("#FBFBEF"));
                                ng.terminado();
                                //t63.setEditable(false);
                            }
                        }
                    
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t63.setBackground(Color.decode("#FBFBEF"));
                ng.matriz[6][3] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t63.setBackground(Color.decode("#FBFBEF"));
                //ng.matriz[8][8] =0;
            }
        });
        t65.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t65.getText())){
                    if(ng.existe_fila(Integer.valueOf(t65.getText()),6)){
                        error.setText("Mal");
                        t65.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t65.getText()),5)){
                            error.setText("Mal");
                            t65.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t65.getText()),6,5)){
                                error.setText("Mal");
                                t65.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[6][5] = Integer.valueOf(t65.getText());
                                error.setText("Bien");
                                t65.setBackground(Color.decode("#FBFBEF"));
                                ng.terminado();
                                //t65.setEditable(false);
                            }
                        }
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t65.setBackground(Color.decode("#FBFBEF"));
                ng.matriz[6][5] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t65.setBackground(Color.decode("#FBFBEF"));
                //ng.matriz[8][8] =0;
            }
        });
        t68.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t68.getText())){
                    if(ng.existe_fila(Integer.valueOf(t68.getText()),6)){
                        error.setText("Mal");
                        t68.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t68.getText()),8)){
                            error.setText("Mal");
                            t68.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t68.getText()),6,8)){
                                error.setText("Mal");
                                t68.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[6][8] = Integer.valueOf(t68.getText());
                                error.setText("Bien");
                                t68.setBackground(Color.CYAN);
                                ng.terminado();
                                //t68.setEditable(false);
                            }
                        }
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t68.setBackground(Color.CYAN);
                ng.matriz[6][8] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t68.setBackground(Color.CYAN);
                //ng.matriz[8][8] =0;
            }
        });
        t71.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t71.getText())){
                    if(ng.existe_fila(Integer.valueOf(t71.getText()),7)){
                        error.setText("Mal");
                        t71.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t71.getText()),1)){
                            error.setText("Mal");
                            t71.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t71.getText()),7,1)){
                                error.setText("Mal");
                                t71.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[7][1] = Integer.valueOf(t71.getText());
                                error.setText("Bien");
                                t71.setBackground(Color.CYAN);
                                ng.terminado();
                                //t71.setEditable(false);
                            }
                        }
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t71.setBackground(Color.CYAN);
                ng.matriz[7][1] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t71.setBackground(Color.CYAN);
                //ng.matriz[8][8] =0;
            }
        });
        t72.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t72.getText())){
                    if(ng.existe_fila(Integer.valueOf(t72.getText()),7)){
                        error.setText("Mal");
                        t72.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t72.getText()),2)){
                            error.setText("Mal");
                            t72.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t72.getText()),7,2)){
                                error.setText("Mal");
                                t72.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[7][2] = Integer.valueOf(t72.getText());
                                error.setText("Bien");
                                t72.setBackground(Color.CYAN);
                                ng.terminado();
                                //t72.setEditable(false);
                            }
                        }
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t72.setBackground(Color.CYAN);
                ng.matriz[7][2] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t72.setBackground(Color.CYAN);
                //ng.matriz[8][8] =0;
            }
        });
        t73.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t73.getText())){
                    if(ng.existe_fila(Integer.valueOf(t73.getText()),7)){
                        error.setText("Mal");
                        t73.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t73.getText()),3)){
                            error.setText("Mal");
                            t73.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t73.getText()),7,3)){
                                error.setText("Mal");
                                t73.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[7][3] = Integer.valueOf(t73.getText());
                                error.setText("Bien");
                                t73.setBackground(Color.decode("#FBFBEF"));
                                ng.terminado();
                                //t73.setEditable(false);
                            }
                        }
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t73.setBackground(Color.decode("#FBFBEF"));
                ng.matriz[7][3] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t73.setBackground(Color.decode("#FBFBEF"));
                //ng.matriz[8][8] =0;
            }
        });
        t75.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t75.getText())){
                    if(ng.existe_fila(Integer.valueOf(t75.getText()),7)){
                        error.setText("Mal");
                        t75.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t75.getText()),5)){
                            error.setText("Mal");
                            t75.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t75.getText()),7,5)){
                                error.setText("Mal");
                                t75.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[7][5] = Integer.valueOf(t75.getText());
                                error.setText("Bien");
                                t75.setBackground(Color.decode("#FBFBEF"));
                                //t75.setEditable(false);
                                ng.terminado();
                            }
                        }
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t75.setBackground(Color.decode("#FBFBEF"));
                ng.matriz[7][5] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t75.setBackground(Color.decode("#FBFBEF"));
                //ng.matriz[8][8] =0;
            }
        });
        t76.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t76.getText())){
                    if(ng.existe_fila(Integer.valueOf(t76.getText()),7)){
                        error.setText("Mal");
                        t76.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t76.getText()),6)){
                            error.setText("Mal");
                            t76.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t76.getText()),7,6)){
                                error.setText("Mal");
                                t76.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[7][6] = Integer.valueOf(t76.getText());
                                error.setText("Bien");
                                t76.setBackground(Color.CYAN);
                                ng.terminado();
                                //t76.setEditable(false);
                            }
                        }
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t76.setBackground(Color.CYAN);
                ng.matriz[7][6] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t76.setBackground(Color.CYAN);
                //ng.matriz[8][8] =0;
            }
        });
        t77.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t77.getText())){
                    if(ng.existe_fila(Integer.valueOf(t77.getText()),7)){
                        error.setText("Mal");
                        t77.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t77.getText()),7)){
                            error.setText("Mal");
                            t77.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t77.getText()),7,7)){
                                error.setText("Mal");
                                t77.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[7][7] = Integer.valueOf(t77.getText());
                                error.setText("Bien");
                                t77.setBackground(Color.CYAN);
                                ng.terminado();
                                //t77.setEditable(false);
                            }
                        }
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t77.setBackground(Color.CYAN);
                ng.matriz[7][7] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t77.setBackground(Color.CYAN);
                //ng.matriz[8][8] =0;
            }
        });
        t78.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t78.getText())){
                    if(ng.existe_fila(Integer.valueOf(t78.getText()),7)){
                        error.setText("Mal");
                        t78.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t78.getText()),8)){
                            error.setText("Mal");
                            t78.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t78.getText()),7,8)){
                                error.setText("Mal");
                                t78.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[7][8] = Integer.valueOf(t78.getText());
                                error.setText("Bien");
                                t78.setBackground(Color.CYAN);
                                ng.terminado();
                                //t78.setEditable(false);
                            }
                        }
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t78.setBackground(Color.CYAN);
                ng.matriz[7][8] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t78.setBackground(Color.CYAN);
                //ng.matriz[8][8] =0;
            }
        });
        t80.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t80.getText())){
                    if(ng.existe_fila(Integer.valueOf(t80.getText()),8)){
                        error.setText("Mal");
                        t80.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t80.getText()),0)){
                            error.setText("Mal");
                            t80.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t80.getText()),8,0)){
                                error.setText("Mal");
                                t80.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[8][0] = Integer.valueOf(t80.getText());
                                error.setText("Bien");
                                t80.setBackground(Color.CYAN);
                                ng.terminado();
                                //t80.setEditable(false);
                            }
                        }
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t80.setBackground(Color.CYAN);
                ng.matriz[8][0] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t80.setBackground(Color.CYAN);
                //ng.matriz[8][8] =0;
            }
        });
        t84.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t84.getText())){
                    if(ng.existe_fila(Integer.valueOf(t84.getText()),8)){
                        error.setText("Mal");
                        t84.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t84.getText()),4)){
                            error.setText("Mal");
                            t84.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t84.getText()),8,4)){
                                error.setText("Mal");
                                t84.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[8][4] = Integer.valueOf(t84.getText());
                                error.setText("Bien");
                                t84.setBackground(Color.decode("#FBFBEF"));
                                ng.terminado();
                                //t84.setEditable(false);
                            }
                        }
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t84.setBackground(Color.decode("#FBFBEF"));
                ng.matriz[8][4] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t84.setBackground(Color.decode("#FBFBEF"));
                //ng.matriz[8][8] =0;
            }
        });
        t85.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t85.getText())){
                    if(ng.existe_fila(Integer.valueOf(t85.getText()),8)){
                        error.setText("Mal");
                        t85.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t85.getText()),5)){
                            error.setText("Mal");
                            t85.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t85.getText()),8,5)){
                                error.setText("Mal");
                                t85.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[8][5] = Integer.valueOf(t85.getText());
                                error.setText("Bien");
                                t85.setBackground(Color.decode("#FBFBEF"));
                                ng.terminado();
                                //t85.setEditable(false);
                            }
                        }
                    
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t85.setBackground(Color.decode("#FBFBEF"));
                ng.matriz[8][5] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t85.setBackground(Color.decode("#FBFBEF"));
                //ng.matriz[8][8] =0;
            }
        });
        t86.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t86.getText())){
                    if(ng.existe_fila(Integer.valueOf(t86.getText()),8)){
                        error.setText("Mal");
                        t86.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t86.getText()),6)){
                            error.setText("Mal");
                            t86.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t86.getText()),8,6)){
                                error.setText("Mal");
                                t86.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[8][6] = Integer.valueOf(t86.getText());
                                error.setText("Bien");
                                t86.setBackground(Color.CYAN);
                                ng.terminado();
                                //t86.setEditable(false);
                            }
                        }
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t86.setBackground(Color.CYAN);
                ng.matriz[8][6] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                t86.setBackground(Color.CYAN);
                //ng.matriz[8][8] =0;
            }
        });
        t88.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(ng.comprobar_valor(t88.getText())){
                    if(ng.existe_fila(Integer.valueOf(t88.getText()),8)){
                        error.setText("Mal");
                        t88.setBackground(Color.decode("#FF9633"));
                    }else{
                        if(ng.existe_columna(Integer.valueOf(t88.getText()),8)){
                            error.setText("Mal");
                            t88.setBackground(Color.decode("#FF9633"));
                        }else{
                            if(ng.existe_caja(Integer.valueOf(t88.getText()),8,8)){
                                error.setText("Mal");
                                t88.setBackground(Color.decode("#FF9633"));
                            }else{
                                ng.matriz[8][8] = Integer.valueOf(t88.getText());
                                error.setText("Bien");
                                t88.setBackground(Color.CYAN);
                                ng.terminado();
                                //t88.setEditable(false);
                            }
                        }
                    }
                }
            }   
            @Override
            public void removeUpdate(DocumentEvent e) {
                t88.setBackground(Color.CYAN);
                ng.matriz[8][8] =0;
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                 t88.setBackground(Color.CYAN);
                 //ng.matriz[8][8] =0;
            }
        });
        btnevaluar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ng.terminado();
                
            }
        });
        btnresolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnevaluar.setVisible(false);
                 t01.setText("7");
                 t03.setText("3");
                 t04.setText("6");
                 t07.setText("4");
                 t08.setText("2");
                 t10.setText("2");
                 t11.setText("6");
                 t12.setText("8");
                 t13.setText("1");
                 t14.setText("4");
                 t15.setText("5");
                 t16.setText("9");
                 t17.setText("3");
                 t20.setText("3");
                 t23.setText("7");
                 t25.setText("2");
                 t27.setText("8");
                 t28.setText("6");
                 t30.setText("7");
                 t31.setText("9");
                 t32.setText("1");
                 t34.setText("5");
                 t38.setText("8");
                 t40.setText("6");
                 t43.setText("9");
                 t44.setText("7");
                 t45.setText("3");
                 t48.setText("5");
                 t50.setText("4");
                 t54.setText("8");
                 t56.setText("7");
                 t57.setText("6");
                 t58.setText("9");
                 t60.setText("8");
                 t61.setText("1");
                 t63.setText("6");
                 t65.setText("9");
                 t68.setText("4");
                 t71.setText("2");
                 t72.setText("6");
                 t73.setText("5");
                 t75.setText("4");
                 t76.setText("8");
                 t77.setText("7");
                 t78.setText("3");
                 t80.setText("5");
                 t84.setText("2");
                 t85.setText("7");
                 t86.setText("6");
                 t88.setText("1");
                 btnresolver.setVisible(false);
            }
        });
        btnSalir = new JButton("Salir");
        encabezado.add(btnSalir);
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 System.exit(0);
            }
        });
        encabezado.setVisible(false);
        encabezado.setBackground(Color.BLACK);
        super.add(encabezado,BorderLayout.SOUTH);
        super.setVisible(true);
    }
}
