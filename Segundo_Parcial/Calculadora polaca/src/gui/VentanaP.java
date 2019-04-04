package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.Controller;
import controller.Controller_Listener;

public class VentanaP extends JFrame{
	PanelEyS pnlEyS;
	Botones botones;
	Controller arrayList;
	public VentanaP() {
		// TODO Auto-generated constructor stub
		this.getContentPane().setBackground(Color.DARK_GRAY);
		super.setSize(700, 650);
		super.setLayout(new BorderLayout(10, 20));
		arrayList = new Controller();
		pnlEyS = new PanelEyS();
		pnlEyS.setPreferredSize(new Dimension(680, 200));
		botones = new Botones();
		botones.setPreferredSize(new Dimension(680, 420));
		botones.setAccion(new Controller_Listener() {
			
			@Override
			public void addCharacter(Character a) {
				// TODO Auto-generated method stub
				arrayList.getLetra().add(a);
				for (char c : arrayList.getLetra()) {
					System.out.print(c);
				}
				pnlEyS.insertarEcuacion(arrayList.getStringRepresentation());
				
			}
			
			@Override
			public void elimnarEcuacion() {
				// TODO Auto-generated method stub
				
				arrayList.eliminarEcuacion();
				pnlEyS.eliminarEcuacion();
			}

			@Override
			public void eliminarCaracter() {
				// TODO Auto-generated method stub
				arrayList.eliminarCaracter();
				pnlEyS.insertarEcuacion(arrayList.getStringRepresentation());
			}

			@Override
			public void mostrarResultado() {
				// TODO Auto-generated method stub
				arrayList.algShunting();
				pnlEyS.mostrarResultado(arrayList.getStringRepresentation());
			}
		});
		super.add(pnlEyS, BorderLayout.NORTH);
		super.add(botones, BorderLayout.SOUTH);
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
