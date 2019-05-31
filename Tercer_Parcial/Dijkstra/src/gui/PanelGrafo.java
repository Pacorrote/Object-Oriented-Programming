package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

import excepciones.InicioOcupadoException;
import hilos.HiloDibujarArista;
import hilos.HiloPopMenu;
import hilos.HiloSelNodo;
import objetos.AristaStatus;

public class PanelGrafo extends JPanel implements MouseMotionListener, MouseListener{
	
	private ArrayList<Nodo> nodos;
	private Nodo auxNodo;
	private Nodo auxNodo1;
	private Boolean eliminarNodoArista;
	private AristaStatus status;
	private Arista auxArista;
	private Integer a = 0;
	private JPopupMenu menuClickDer;
	private JMenuItem opciones [] = new JMenuItem [3];
	private String nombreOpciones [] = {"Añadir/Renombrar Nodo","Nodo inicio","Nodo final"}; 
	private Random random;
	
	public PanelGrafo() {
		// TODO Auto-generated constructor stub
		this.nodos = new ArrayList<>();
		eliminarNodoArista = false;
		status = AristaStatus.NO_PINTAR;
		menuClickDer = new JPopupMenu();
		for (int i = 0; i < opciones.length; i++) {
			opciones[i] = new JMenuItem(nombreOpciones[i]);
			opciones[i].setFont(new Font("Futura", 0, 18));
			menuClickDer.add(opciones[i]);
		}
		opciones[0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				char nombre;
				do {
					 nombre = JOptionPane.showInputDialog("Ingrese el valor de la arista").charAt(0);
					 if(nombre==' ') {
						 JOptionPane.showMessageDialog(getThis(), 
									"Campo vacio/Caracter inválido",
									"ERROR",
									JOptionPane.ERROR_MESSAGE);
					 }
				} while (nombre==' ');
				auxNodo.setNombre(nombre);
				updateUI();
			}
		});
		random = new Random();
		opciones[1].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(auxNodo.isFin()) {
					try {
						throw new InicioOcupadoException();
					} catch (InicioOcupadoException e1) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(getThis(), 
								e1.getMessage(),
								"ERROR",
								JOptionPane.ERROR_MESSAGE);
					}
				}
				else {
					int r=random.nextInt(254)+1, g=random.nextInt(254)+1, b=random.nextInt(254)+1;
					auxNodo.setInicio(true);
					auxNodo.setColor(new Color(r, g, b));
					repaint();
					opciones[1].setEnabled(false);
				}
			}
		});
		opciones[2].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(auxNodo.isInicio()) {
					try {
						throw new InicioOcupadoException();
					} catch (InicioOcupadoException e1) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(getThis(), 
								e1.getMessage(),
								"ERROR",
								JOptionPane.ERROR_MESSAGE);
					}
				}
				else {
					int r=random.nextInt(254)+1, g=random.nextInt(254)+1, b=random.nextInt(254)+1;
					auxNodo.setFin(true);
					auxNodo.setColor(new Color(r, g, b));
					repaint();
					opciones[2].setEnabled(false);
				}
			}
		});
		addMouseMotionListener(this);
		addMouseListener(this);
	}
	
	public PanelGrafo getThis() {
		return this;
	}
	
	public String[] getNombreOpciones() {
		return nombreOpciones;
	}

	public void setNombreOpciones(String[] nombreOpciones) {
		this.nombreOpciones = nombreOpciones;
	}

	public Arista getAuxArista() {
		return auxArista;
	}

	public void setAuxArista(Arista auxArista) {
		this.auxArista = auxArista;
	}

	public AristaStatus getStatus() {
		return status;
	}

	public void setStatus(AristaStatus status) {
		this.status = status;
	}



	public void addNodo(Nodo nodo) {
		this.nodos.add(nodo);
	}
	
	

	public Boolean getEliminarNodoArista() {
		return eliminarNodoArista;
	}

	public void setEliminarNodoArista(Boolean eliminarNodoArista) {
		this.eliminarNodoArista = eliminarNodoArista;
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		for (Nodo nodo : nodos) {
			nodo.pintarNodo(g);
			for (Arista arista : nodo.getAristas()) {
				arista.pintarArista(g);
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getButton()==MouseEvent.BUTTON1) {
			if(eliminarNodoArista) {
				int a1 = -1;
				int a = 0;
				boolean listo = false;
				while(a<nodos.size() && !listo) {
					++a1;
					if((e.getX()<=nodos.get(a1).getX()+40
							&& e.getX()>=nodos.get(a1).getX()-40)
							&& (e.getY()<=nodos.get(a1).getY()+40
							&& e.getY()>=nodos.get(a1).getY()-40)) {
						if(nodos.get(a1).getIndiceP()!=null) {
							System.out.println("No soy nulo");
							Nodo auxN1 = nodos.get(a1);
							Nodo auxN2 = nodos.get(auxN1.getIndiceP());
							boolean cerrarCiclo = false;
							while(a<auxN2.getAristas().size() && !cerrarCiclo) {
								Arista auxA1 = auxN2.getAristas().get(a);
								if(auxA1.getT()==auxN1) {
									auxN2.getAristas().remove(auxA1);
									cerrarCiclo=true;
								}
								a++;
							}
						}
						nodos.remove(a1);
						listo = true;
						repaint();
					}
				}
			}
		}
		else if(e.getButton()==MouseEvent.BUTTON3){
			HiloSelNodo hilo3 = new HiloSelNodo(this, e);
			HiloPopMenu hilo4 = new HiloPopMenu(this, e);
			hilo3.start();
			hilo4.start();
		}
	}
	

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getButton()==MouseEvent.BUTTON1) {
			HiloSelNodo hilo1 = new HiloSelNodo(this, e);
			hilo1.start();
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if(status == AristaStatus.Pintar) {
			if(isNodo(e)) {
				
				auxArista.setT(auxNodo1, a);
				repaint();
				boolean noerror = false;
				do {
					try {
						int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la arista"));
						auxArista.setNumero(n);
						repaint();
						noerror = false;
					}catch (NumberFormatException errorIdiotoJajaj) {
						// TODO: handle exception

						JOptionPane.showMessageDialog(this, 
								"Campo vacio/Caracter inválido",
								"ERROR",
								JOptionPane.ERROR_MESSAGE);
						noerror=true;
					}
				}while(noerror);
			}
			else {
				borrarArista();
			}
		}
		auxNodo = null;
		status = AristaStatus.NO_PINTAR;
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		if(status == AristaStatus.Pintar) {
			HiloDibujarArista hilo2 = new HiloDibujarArista(auxArista, e, this);
			hilo2.start();
		}
		if(auxNodo!=null && status == AristaStatus.NO_PINTAR) {
			auxNodo.setX(e.getX());
			auxNodo.setY(e.getY());
			repaint();
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	public ArrayList<Nodo> getNodos() {
		return nodos;
	}

	public void setNodos(ArrayList<Nodo> nodos) {
		this.nodos = nodos;
	}

	public synchronized Nodo getAuxNodo() {
		return auxNodo;
	}

	public synchronized void setAuxNodo(Nodo aux) {
		this.auxNodo = aux;
	}
	
	
	public void seleccionarNodo(MouseEvent e) {
		int a = 0;
		boolean encontrado = false;
		while(a<nodos.size() && !encontrado) {
			Nodo aux = nodos.get(a);
			if((e.getX()<=aux.getX()+40 
					&& e.getX()>=aux.getX()-40)
					&& (e.getY()<=aux.getY()+40
					&& e.getY()>=aux.getY()-40)) {
				auxNodo = aux;
				this.a = a;
				encontrado = true;
			}
			a++;
		}
	}
	
	public Boolean isNodo(MouseEvent evento) {
		int a = 0;
		boolean encontrado = false;
		while(a<nodos.size() && !encontrado) {
			Nodo aux = nodos.get(a);
			if((evento.getX()<=aux.getX()+40 
					&& evento.getX()>=aux.getX()-40)
					&& (evento.getY()<=aux.getY()+40
					&& evento.getY()>=aux.getY()-40)) {
				auxNodo1 = aux;
				System.out.println("Valor: "+this.a);
				encontrado = true;
			}
			a++;
		}
		return encontrado;
	}
	
	public void mostrarPopMenu(MouseEvent evento) {
		do {
			if(auxNodo!=null) {
				System.out.println("Si entré");
				menuClickDer.show(this, evento.getX(), evento.getY());
			}
		}while(auxNodo==null);
	}

	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}
	
	public void borrarArista() {
		int a = 0;
		boolean parar = false;
		Arista aux = auxNodo.getAristas().get(a);
		while(a<auxNodo.getAristas().size() && !parar) {
			if(aux == auxArista) {
				auxNodo.getAristas().remove(aux);
				repaint();
				parar=true;
			}
			a++;
		}
	}
	
}
