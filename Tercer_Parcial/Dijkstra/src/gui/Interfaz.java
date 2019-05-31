package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;


import javax.swing.JFrame;

import excepciones.NoFinException;
import excepciones.NoInicioException;
import objetos.AristaStatus;
import objetos.Dijkstra;
import objetos.PanelMenuListener;

public class Interfaz extends JFrame{
	
	private PanelGrafo pnlGrafo;
	
	private PanelMenu pnlMenu;
	
	private Dijkstra solución;
	
	public Interfaz() {
		// TODO Auto-generated constructor stub
        super.setSize(1000, 700);
        super.setLocationRelativeTo(null);
        super.setLayout(new BorderLayout());
        pnlGrafo = new PanelGrafo();
        pnlGrafo.setPreferredSize(new Dimension(800, 700));
        pnlGrafo.setBackground(Color.WHITE);
        pnlMenu = new PanelMenu(this);
        pnlMenu.setPnlMenuListener(new PanelMenuListener() {
			
			@Override
			public void pintarNodo() {
				// TODO Auto-generated method stub
				Nodo nodo = new Nodo(50, 80);
				pnlGrafo.addNodo(nodo);
				nodo.pintarNodo(getGraphics());
			}

			@Override
			public void eliminarNodoArista(Boolean activado) {
				// TODO Auto-generated method stub
				pnlGrafo.setEliminarNodoArista(activado);
			}

			@Override
			public void pintarArista(AristaStatus pintarArista) {
				// TODO Auto-generated method stub
				Arista arista = new Arista();
				pnlGrafo.setStatus(pintarArista);
				pnlGrafo.setAuxArista(arista);
			}

			@Override
			public void resolverDijkstra (Dijkstra solucion) {
				// TODO Auto-generated method stub
				 int suma = 0; 
				 setSolucion(solucion);
				 try {
					 pnlMenu.getResultado().setText(String.valueOf(Dijkstra.dijkstra(getSolución().getInicio(), suma)));
				} catch (NoFinException e) {
					// TODO: handle exception
					
				} 
			}
		});
        pnlMenu.setPreferredSize(new Dimension(200, 700));
        super.add(pnlGrafo, BorderLayout.CENTER);
        super.add(pnlMenu, BorderLayout.EAST);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
	}

	public Dijkstra getSolución() {
		return solución;
	}

	public void setSolucion(Dijkstra solución) {
		this.solución = solución;
	}

	public PanelGrafo getPnlGrafo() {
		return pnlGrafo;
	}

	public void setPnlGrafo(PanelGrafo pnlGrafo) {
		this.pnlGrafo = pnlGrafo;
	}
	
	
	

}