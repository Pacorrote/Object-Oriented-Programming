package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Controller;

public class PanelEyS extends JPanel{
	private JPanel pnlEntrada;
	private JPanel pnlSalida;
	private JLabel lblEntrada;
	private JLabel lblSalida;
	public PanelEyS() {
		// TODO Auto-generated constructor stub
		super.setLayout(new GridLayout(2, 1, 20, 20));
		super.setBackground(Color.DARK_GRAY);
		pnlEntrada = new JPanel();
		pnlSalida = new JPanel();
		pnlEntrada.setBackground(Color.WHITE);
		pnlEntrada.setBorder(new EmptyBorder(10, 20, 10, 20));
		pnlSalida.setBackground(Color.GRAY);
		pnlEntrada.setPreferredSize(new Dimension(660, 140));
		pnlSalida.setPreferredSize(new Dimension(660, 140));
		pnlSalida.setBorder(new EmptyBorder(10, 20, 10, 20));
		lblEntrada = new JLabel();
		lblSalida = new JLabel();
		Font fuente = new Font("Monaco", 0, 40);
		lblEntrada.setFont(fuente);
		lblSalida.setFont(fuente);
		lblSalida.setForeground(Color.ORANGE);
		pnlEntrada.add(lblEntrada);
		pnlSalida.add(lblSalida);
		//pnlEntrada.setBounds(0, 0, 700, 100);
		//pnlSalida.setBounds(0, 100, 700, 100);
		super.add(pnlEntrada);
		super.add(pnlSalida);
	}
	public JLabel getLblEntrada() {
		return lblEntrada;
	}
	public void setLblEntrada(JLabel lblEntrada) {
		this.lblEntrada = lblEntrada;
	}
	public JLabel getLblSalida() {
		return lblSalida;
	}
	public void setLblSalida(JLabel lblSalida) {
		this.lblSalida = lblSalida;
	}
	public JPanel getPnlEntrada() {
		return pnlEntrada;
	}
	public void setPnlEntrada(JPanel pnlEntrada) {
		this.pnlEntrada = pnlEntrada;
	}
	public JPanel getPnlSalida() {
		return pnlSalida;
	}
	public void setPnlSalida(JPanel pnlSalida) {
		this.pnlSalida = pnlSalida;
	}
	public void insertarEcuacion(String texto) {
		this.lblEntrada.setText(texto);
	}
	public void eliminarEcuacion() {
		this.lblEntrada.setText(" ");
		this.lblSalida.setText(" ");
	}
	public void mostrarResultado(String texto) {
		this.lblSalida.setText(texto);
	}
}
