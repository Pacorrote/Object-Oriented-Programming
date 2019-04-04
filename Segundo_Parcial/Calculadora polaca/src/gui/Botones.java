package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import controller.Controller;
import controller.Controller_Listener;

public class Botones extends JPanel {
	JButton botones [] = new JButton[24];
	Controller_Listener accion;
	public Botones() {
		// TODO Auto-generated constructor stub
		super.setLayout(new GridLayout(6, 4, 10, 10));
		super.setBackground(Color.DARK_GRAY);
		for (int i = 0; i < botones.length && i < Etiquetas.CARACTERES.length; i++) {
			botones[i] = new JButton(Etiquetas.CARACTERES[i]);
			botones[i].setFont(new Font("Futura", 0, 22));
			if(i==0 || i==1) {
				botones[i].setForeground(new Color(212, 175, 55));
			}
			int op = i;
			botones[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					switch (op) {
					case 0:
						accion.eliminarCaracter();
						break;
					case 1:
						accion.elimnarEcuacion();
						break;
					case 2:
						
						break;
					case 7:
						accion.addCharacter('/');
						break;
					case 23:
						accion.mostrarResultado();
						break;
					default:
						accion.addCharacter(Etiquetas.CARACTERES[op].charAt(0));
						break;
					}
				}
			});
			super.add(botones[i]);
		}
	}
	public void setAccion(Controller_Listener accion) {
		this.accion = accion;
	}

	

}
