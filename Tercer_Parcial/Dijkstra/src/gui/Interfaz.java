package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

import excepciones.NoFinException;
import excepciones.NoInicioException;
import objetos.AristaStatus;
import objetos.Dijkstra;
import objetos.PanelMenuListener;

public class Interfaz extends JFrame{
	
	private PanelGrafo pnlGrafo;
	
	private PanelMenu pnlMenu;
	
	private Dijkstra solución;
	
	private VentanaArchivos vA;
	
	public Interfaz() {
		// TODO Auto-generated constructor stub
        super.setSize(1000, 700);
        super.setLocationRelativeTo(null);
        super.setLayout(new BorderLayout());
        pnlGrafo = new PanelGrafo();
        pnlGrafo.setPreferredSize(new Dimension(800, 700));
        pnlGrafo.setBackground(Color.WHITE);
        pnlMenu = new PanelMenu(this);
        vA = new VentanaArchivos(this);
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
					 pnlMenu.getResultado().setText(String.valueOf(Dijkstra.dijkstraCosto(getSolución().getInicio(), suma)));
					 pnlGrafo.setRutaEconomica(Dijkstra.dijkstraRutas(getSolución().getInicio(), suma));
					 pnlGrafo.colorearRutas();
					 repaint();
				} catch (NoFinException e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(getContentPane(), 
							e.getMessage(),
							"ERROR",
							JOptionPane.ERROR_MESSAGE);
				} 
			}

			@Override
			public void abrirArchivo() throws ClassNotFoundException {
				// TODO Auto-generated method stub
				vA.setMode(FileDialog.LOAD);
				vA.setVisible(true);
				Vector<Object> vector = new Vector<>();
				boolean exito = false;
				do {
					vA.setVisible(true);
					try {
						
						

						ObjectInputStream abrir = new ObjectInputStream(new FileInputStream(vA.getDirectory()+vA.getFile()));

						vector = (Vector) abrir.readObject();
						
						

						JOptionPane.showMessageDialog(getContentPane(), 
								"Error al guardar el archivo, intentelo de nuevo",
								"Exito",
								JOptionPane.INFORMATION_MESSAGE);
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						exito=true;
						JOptionPane.showMessageDialog(getContentPane(), 
								"Error al guardar el archivo, intentelo de nuevo",
								"ERROR",
								JOptionPane.ERROR_MESSAGE);
						e.printStackTrace();
					}

				} while (exito);
			}

			@Override
			public void guardarArchivo() {
				// TODO Auto-generated method stub
				vA.setMode(FileDialog.SAVE);
				Vector<Object> vector = new Vector<>();
				boolean exito = false;
				do {
					vA.setVisible(true);
					try {
						
						pnlGrafo.colorearAristas(Color.BLACK);

						vector.add(pnlGrafo.getAristaAuxiliares());

						vector.add(pnlGrafo.getNodos());

						ObjectOutputStream guardar = new ObjectOutputStream(new FileOutputStream(vA.getDirectory()+vA.getFile()));

						guardar.writeObject(vector);

						guardar.close();

						JOptionPane.showMessageDialog(getContentPane(), 
								"Archivo guardado",
								"Exito",
								JOptionPane.INFORMATION_MESSAGE);
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						exito=true;
						JOptionPane.showMessageDialog(getContentPane(), 
								"Error al guardar el archivo, intentelo de nuevo",
								"ERROR",
								JOptionPane.ERROR_MESSAGE);
						e.printStackTrace();
					}
				}while(exito);
				
				pnlGrafo.colorearRutas();
			}
		});
        pnlMenu.setPreferredSize(new Dimension(200, 700));
        pnlGrafo.setEtiqueta(pnlMenu.getResultado());
        super.add(pnlGrafo, BorderLayout.CENTER);
        super.add(pnlMenu, BorderLayout.EAST);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.setProperty("apple.awt.fileDialogForDirectories", "true");
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
	
	public void cargarDatos(Vector<Object> vector) {
		for (Object object : vector) {
			
		}
	}
	
	

}
