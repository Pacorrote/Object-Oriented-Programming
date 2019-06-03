package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.LineBorder;

import excepciones.NodoFinNoConectadoException;
import objetos.AristaStatus;
import objetos.Dijkstra;
import objetos.PanelMenuListener;

public class PanelMenu extends JPanel{
	
	private JButton nodo;
	private JButton arista;
	private JButton resolver;
	private JToggleButton eliminarDibujo;
	private PanelMenuListener pnlMenuListener;
	private JPanel pnlresultado;
	private JLabel resultado;
	private Font fuente;
	private JPanel botones;
	private JButton abrirArch;
	private JButton guardarDibujo;

	public PanelMenu(Interfaz parent) {
		// TODO Auto-generated constructor stub
		super.setLayout(new BorderLayout(10, 10));
		fuente = new Font("Aqua", Font.PLAIN, 20);
		nodo = new JButton("Nodo");
		nodo.setFont(fuente);
		nodo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pnlMenuListener.pintarNodo();
			}
		});
		nodo.setFocusable(false);
		arista = new JButton("Arista");
		arista.setFont(fuente);
		arista.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pnlMenuListener.pintarArista(AristaStatus.Pintar);
			}
		});
		arista.setFocusable(false);
		resolver = new JButton("Resolver");
		resolver.setFont(fuente);
		resolver.setFocusable(false);
		resolver.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					pnlMenuListener.resolverDijkstra(new Dijkstra(parent.getPnlGrafo().getNodos(), parent));
				} catch (NodoFinNoConectadoException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(parent, 
							e1.getMessage(),
							"ERROR",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		eliminarDibujo = new JToggleButton ("Eliminar objeto");
		eliminarDibujo.setFont(fuente);
		eliminarDibujo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(eliminarDibujo.isSelected()) {
					pnlMenuListener.eliminarNodoArista(true);
				}
				else {
					pnlMenuListener.eliminarNodoArista(false);
				}
				
			}
		});
		eliminarDibujo.setFocusable(false);
		abrirArch = new JButton("Abrir archivo");
		abrirArch.setFont(fuente);
		abrirArch.setFocusable(false);
		abrirArch.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pnlMenuListener.abrirArchivo();
			}
		});
		guardarDibujo = new JButton("Guardar dibujo");
		guardarDibujo.setFont(fuente);
		guardarDibujo.setFocusable(false);
		guardarDibujo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		botones = new JPanel(new GridLayout(6, 1, 20, 15));
		botones.setPreferredSize(new Dimension(200,495));
		botones.add(nodo);
		botones.add(arista);
		botones.add(eliminarDibujo);
		botones.add(resolver);
		botones.add(abrirArch);
		botones.add(guardarDibujo);
		pnlresultado = new JPanel();
		pnlresultado.setBackground(Color.WHITE);
		LineBorder borde = new LineBorder(Color.BLACK, 4, false);
		pnlresultado.setBorder(borde);
		pnlresultado.setPreferredSize(new Dimension(200, 195));
		resultado = new JLabel();
		resultado.setFont(new Font("Gothica", 0, 18));
		resultado.setPreferredSize(new Dimension(200, 195));
		pnlresultado.add(resultado);
		super.add(botones, BorderLayout.NORTH);
		super.add(pnlresultado, BorderLayout.SOUTH);
	}

	public JPanel getPnlresultado() {
		return pnlresultado;
	}

	public void setPnlresultado(JPanel pnlresultado) {
		this.pnlresultado = pnlresultado;
	}

	public JLabel getResultado() {
		return resultado;
	}

	public void setResultado(JLabel resultado) {
		this.resultado = resultado;
	}

	public Font getFuente() {
		return fuente;
	}

	public void setFuente(Font fuente) {
		this.fuente = fuente;
	}

	public JButton getNodo() {
		return nodo;
	}

	public void setNodo(JButton nodo) {
		this.nodo = nodo;
	}

	public JButton getArista() {
		return arista;
	}

	public void setArista(JButton arista) {
		this.arista = arista;
	}

	public JButton getResolver() {
		return resolver;
	}

	public void setResolver(JButton resolver) {
		this.resolver = resolver;
	}
	
	public PanelMenuListener getPnlMenuListener() {
		return pnlMenuListener;
	}

	public void setPnlMenuListener(PanelMenuListener pnlMenuListener) {
		this.pnlMenuListener = pnlMenuListener;
	}

}
