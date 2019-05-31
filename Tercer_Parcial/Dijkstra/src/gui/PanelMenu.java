package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.LineBorder;

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

	public PanelMenu(Interfaz parent) {
		// TODO Auto-generated constructor stub
		super.setLayout(new GridLayout(5, 1, 20, 15));
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
		arista = new JButton("Arista");
		arista.setFont(fuente);
		arista.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pnlMenuListener.pintarArista(AristaStatus.Pintar);
			}
		});
		resolver = new JButton("Resolver");
		resolver.setFont(fuente);
		resolver.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pnlMenuListener.resolverDijkstra(new Dijkstra(parent.getPnlGrafo().getNodos(), parent));
			}
		});
		eliminarDibujo = new JToggleButton ("Eliminar objeto");
		eliminarDibujo.setFont(fuente);
		eliminarDibujo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pnlMenuListener.eliminarNodoArista(true);
			}
		});
		pnlresultado = new JPanel();
		pnlresultado.setBackground(Color.WHITE);
		LineBorder borde = new LineBorder(Color.BLACK, 4, false);
		pnlresultado.setBorder(borde);
		resultado = new JLabel();
		resultado.setFont(new Font("Gothica", 0, 18));
		pnlresultado.add(resultado);
		super.add(nodo);
		super.add(arista);
		super.add(eliminarDibujo);
		super.add(resolver);
		super.add(pnlresultado);
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
