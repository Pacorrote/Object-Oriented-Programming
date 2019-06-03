package gui;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

import excepciones.InicioOcupadoException;
import hilos.HiloDibujarArista;
import hilos.HiloPopMenu;
import hilos.HiloSelArista;
import hilos.HiloSelNodo;
import objetos.AristaStatus;
import objetos.Ruta;

public class PanelGrafo extends JPanel implements MouseMotionListener, MouseListener, KeyListener{
	
	private ArrayList<Nodo> nodos;
	private Nodo auxNodo;
	private Nodo auxNodo1;
	private Boolean eliminarNodoArista;
	private AristaStatus status;
	private Arista auxArista;
	private Integer a = 0;
	private JPopupMenu menuClickDer;
	private JMenuItem opcionesNodo [] = new JMenuItem [3];
	private JMenuItem opcionesNodoInicio[] = new JMenuItem [2];
	private JMenuItem opcionesNodoFin[] = new JMenuItem [2];
	private JMenuItem opcionesArista [] = new JMenuItem[2];
	private String nombreOpcionesNodo [] = {"Añadir/Renombrar Nodo","Nodo inicio","Nodo final"}; 
	private String nombreOpcionesNodoInicio [] =  {"Añadir/Renombrar Nodo","Quitar Nodo Inicio"};
	private String nombreOpcionesNodoFin [] = {"Añadir/Renombrar Nodo","Quitar Nodo final"};
	private String nombreOpcionesArista [] = {"Cambiar Valor","Cambiar color"};
	private Random random;
	private JLabel etiqueta;
	private ArrayList<Arista> aristaAuxiliares;
	private HiloPopMenu hiloPopMenu;
	private Ruta rutaEconomica;

	
	public PanelGrafo() {
		// TODO Auto-generated constructor stub
		this.nodos = new ArrayList<>();
		this.aristaAuxiliares = new ArrayList<>();
		eliminarNodoArista = false;
		status = AristaStatus.NO_PINTAR;
		menuClickDer = new JPopupMenu();
		menuClickDer.setFocusable(false);
		for (int i = 0; i < opcionesNodo.length; i++) {
			opcionesNodo[i] = new JMenuItem(nombreOpcionesNodo[i]);
			opcionesNodo[i].setFont(new Font("Futura", 0, 18));
		}
		for (int i = 0; i < opcionesNodoInicio.length; i++) {
			opcionesNodoInicio[i] = new JMenuItem(nombreOpcionesNodoInicio[i]);
			opcionesNodoInicio[i].setFont(new Font("Futura", 0, 18));
		}
		for (int j = 0; j < opcionesNodoFin.length; j++) {
			opcionesNodoFin[j] = new JMenuItem(nombreOpcionesNodoFin[j]);
			opcionesNodoFin[j].setFont(new Font("Futura", 0, 18));
		}
		for (int i = 0; i < opcionesArista.length; i++) {
			opcionesArista[i] = new JMenuItem(nombreOpcionesArista[i]);
			opcionesArista[i].setFont(new Font("Futura", 0, 18));
		}
		
		opcionesNodo[0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				char nombre;
				do {
					 nombre = JOptionPane.showInputDialog("Ingrese el Nombre (Un solo "
					 		+ "caracter) del nodo").charAt(0);
					 if(nombre==' ') {
						 JOptionPane.showMessageDialog(getThis(), 
									"Campo vacio/Caracter inválido",
									"ERROR",
									JOptionPane.ERROR_MESSAGE);
					 }
				} while (nombre==' ');
				auxNodo.setNombre(nombre);
				menuClickDer.removeAll();
				updateUI();
			}
		});
		random = new Random();
		opcionesNodo[1].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int r = random.nextInt(254)+1, g = random.nextInt(254)+1, b = random.nextInt(254)+1;
				auxNodo.setColor(new Color(r, g, b));
				auxNodo.setInicio(true);
				opcionesNodo[1].setEnabled(false);
				menuClickDer.removeAll();
				updateUI();
			}
		});
		opcionesNodo[2].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int r = random.nextInt(254)+1, g = random.nextInt(254)+1, b = random.nextInt(254)+1;
				auxNodo.setColor(new Color(r, g, b));
				auxNodo.setFin(true);
				for (int numeros : auxNodo.getArraylistIndiceP()) {
					System.out.println(numeros);
				}
				opcionesNodo[2].setEnabled(false);
				menuClickDer.removeAll();
				updateUI();
			}
		});
		opcionesNodoInicio[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				char nombre;
				do {
					 nombre = JOptionPane.showInputDialog("Ingrese el Nombre (Un solo "
					 		+ "caracter) del nodo").charAt(0);
					 if(nombre==' ') {
						 JOptionPane.showMessageDialog(getThis(), 
									"Campo vacio/Caracter inválido",
									"ERROR",
									JOptionPane.ERROR_MESSAGE);
					 }
				} while (nombre==' ');
				auxNodo.setNombre(nombre);
				menuClickDer.removeAll();
				updateUI();
			}
		});
		opcionesNodoInicio[1].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				auxNodo.setInicio(false);
				auxNodo.setColor(Color.BLACK);
				opcionesNodo[1].setEnabled(true);
				menuClickDer.removeAll();
				updateUI();
			}
		});
		opcionesNodoFin[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				char nombre;
				do {
					 nombre = JOptionPane.showInputDialog("Ingrese el Nombre (Un solo "
					 		+ "caracter) del nodo").charAt(0);
					 if(nombre==' ') {
						 JOptionPane.showMessageDialog(getThis(), 
									"Campo vacio/Caracter inválido",
									"ERROR",
									JOptionPane.ERROR_MESSAGE);
					 }
				} while (nombre==' ');
				auxNodo.setNombre(nombre);
				menuClickDer.removeAll();
				updateUI();
			}
		});
		opcionesNodoFin[1].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				auxNodo.setFin(false);
				auxNodo.setColor(Color.BLACK);
				opcionesNodo[2].setEnabled(true);
				menuClickDer.removeAll();
				updateUI();
			}
		});
		opcionesArista[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				boolean noerror = false;
				do {
					try {
						auxArista.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la arista")));
						updateUI();
						noerror=false;
					} catch (NumberFormatException errorIdiotoJajaj) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(getThis(), 
								"Campo vacio/Caracter inválido",
								"ERROR",
								JOptionPane.ERROR_MESSAGE);
						noerror=true;
					}
				}while(noerror);
				menuClickDer.removeAll();
				updateUI();
			}
		});
		opcionesArista[1].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				menuClickDer.removeAll();
			}
		});
		addMouseMotionListener(this);
		addMouseListener(this);
		addKeyListener(this);
		setFocusable(true);
	}
	
	public PanelGrafo getThis() {
		return this;
	}
	
	public String[] getNombreOpciones() {
		return nombreOpcionesNodo;
	}

	public void setNombreOpciones(String[] nombreOpciones) {
		this.nombreOpcionesNodo = nombreOpciones;
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
				int a2 = 0;
				boolean listo = false;
				while(a<nodos.size() && !listo) {
					++a1;
					System.out.println(a1);
					if((e.getX()<=nodos.get(a1).getX()+50
							&& e.getX()>=nodos.get(a1).getX()-50)
							&& (e.getY()<=nodos.get(a1).getY()+50
							&& e.getY()>=nodos.get(a1).getY()-50)) {
						
						if(nodos.get(a1).getArraylistIndiceP().size()>0) {
							a2=0;
							while(a2<nodos.get(a1).getArraylistIndiceP().size()) {
								Nodo auxN1 = nodos.get(a1);
								int indice = auxN1.getArraylistIndiceP().get(a2);
								if(indice<nodos.size()) {
									Nodo auxN2 = nodos.get(indice);
									boolean cerrarCiclo = false;
									a=0;
									while(a<auxN2.getAristas().size() && !cerrarCiclo) {
										Arista auxA1 = auxN2.getAristas().get(a);
										System.out.println("voy a borrar arista");
										if(auxA1.getT()==auxN1) {
											System.out.println("Borrar arista");
											auxN2.getAristas().remove(auxA1);
											cerrarCiclo=true;
										}
										a++;
									}
								}
								a2++;
							}
						}
						if(nodos.get(a1).isInicio()) {
							opcionesNodo[1].setEnabled(true);
						}
						else if(nodos.get(a1).isFin()) {
							opcionesNodo[2].setEnabled(true);
						}
						nodos.remove(a1);
						listo = true;
						repaint();
					}
				}
				etiqueta.setText("");
			}
			menuClickDer.removeAll();
		}
		else if(e.getButton()==MouseEvent.BUTTON3){
			HiloSelNodo hilo3 = new HiloSelNodo(this, e);
			HiloSelArista hilo5 = new HiloSelArista(this, e);
			hiloPopMenu = new HiloPopMenu(this, e);
			hilo3.start();
			hilo5.start();
			hiloPopMenu.start();
		}
	}
	

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getButton()==MouseEvent.BUTTON1) {
			HiloSelArista.setStatus(false);
			HiloSelNodo hilo1 = new HiloSelNodo(this, e);
			hilo1.start();
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if(status == AristaStatus.Pintar) {
			if(isNodo(e) && auxNodo!=auxNodo1) {
				aristaAuxiliares.add(auxArista);
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
		synchronized (this) {
			while(a<nodos.size() && !encontrado && !HiloSelArista.getStatus()) {
				Nodo aux = nodos.get(a);
				synchronized (e) {
					if((e.getX()<=aux.getX()+40 
							&& e.getX()>=aux.getX()-40)
							&& (e.getY()<=aux.getY()+40
							&& e.getY()>=aux.getY()-40)) {
						System.out.println("Nodo encontrado");
						auxNodo = aux;
						this.a = a;
						encontrado = true;
						HiloSelNodo.setStatus(encontrado);
					}
				}
				a++;
			}
		}
		
	}
	public void seleccionarArista(MouseEvent evento) {
		int a = 0;
		boolean encontrado = false;
		synchronized (this) {
			while(a<aristaAuxiliares.size() && !encontrado && !HiloSelNodo.getStatus()) {
				Arista aux = aristaAuxiliares.get(a);
				synchronized (evento) {
					if((evento.getX()<=aux.puntoMedioX()+40 
							&& evento.getX()>=aux.puntoMedioX()-40)
							&& (evento.getY()<=aux.puntoMedioY()+40
							&& evento.getY()>=aux.puntoMedioY()-40)) {
						auxArista = aux;
						encontrado = true;
						System.out.println(encontrado);
						HiloSelArista.setStatus(encontrado);
					}
				}
			}
		}
	}
	
	public Boolean isNodo(MouseEvent evento) {
		int a = 0;
		boolean encontrado = false;
		while(a<nodos.size() && !encontrado) {
			Nodo aux = nodos.get(a);
			if((evento.getX()<=aux.getX()+50 
					&& evento.getX()>=aux.getX()-50)
					&& (evento.getY()<=aux.getY()+50
					&& evento.getY()>=aux.getY()-50)) {
				auxNodo1 = aux;
				System.out.println("Valor: "+this.a);
				encontrado = true;
			}
			a++;
		}
		return encontrado;
	}
	
	@SuppressWarnings("deprecation")
	public synchronized void mostrarPopMenu(MouseEvent evento) {
		Boolean nada = true;
		do {
			if(auxNodo!=null) {
				System.out.println("Nodo");
				if(!auxNodo.isInicio() && !auxNodo.isFin()) {
					for (int i = 0; i < opcionesNodo.length; i++) {
						menuClickDer.add(opcionesNodo[i]);
					}
				}
				else if(auxNodo.isInicio()) {
					for (int i = 0; i < opcionesNodoInicio.length; i++) {
						menuClickDer.add(opcionesNodoInicio[i]);
					}
				}
				else if(auxNodo.isFin()) {
					for (int i = 0; i < opcionesNodoFin.length; i++) {
						menuClickDer.add(opcionesNodoFin[i]);
					}
				}
				
				menuClickDer.show(this, evento.getX(), evento.getY());
				nada = false;
			}
			else if(HiloSelArista.getStatus()){
				for (int i = 0; i < opcionesArista.length; i++) {
					menuClickDer.add(opcionesArista[i]);
				}
				menuClickDer.show(this, evento.getX(), evento.getY());
				nada = false;
				System.out.println(nada);
			}
			else if(auxNodo==null) {
				hiloPopMenu.stop();
				System.out.println("Estoy corriendo como bruto");
			}
			HiloPopMenu.yield();
		} while (nada);
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

	@Override
	public void keyTyped(KeyEvent teclado) {
		// TODO Auto-generated method stub
		//System.out.println(teclado.getKeyCode());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyCode());
	}

	@Override
	public void keyReleased(KeyEvent teclado) {
		// TODO Auto-generated method stub
		System.out.println(teclado.getKeyCode());
		System.out.println(KeyEvent.VK_ESCAPE);
		if(teclado.getKeyCode()==KeyEvent.VK_ESCAPE) {
			System.out.println("Que onda");
			if(auxNodo!=null && auxArista!=null) {
				status = AristaStatus.NO_PINTAR;
				borrarArista();
				auxNodo = null;
			}
		}
	}

	public JLabel getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(JLabel etiqueta) {
		this.etiqueta = etiqueta;
	}

	public Ruta getRutaEconomica() {
		return rutaEconomica;
	}

	public void setRutaEconomica(Ruta rutaEconomica) {
		this.rutaEconomica = rutaEconomica;
	}
	
	public void colorearRutas() {
		int r, g , b ;
		Color color;
		Boolean noRojo = false;
		do {
			r = random.nextInt(254)+1;
			g = random.nextInt(254)+1;
			b = random.nextInt(254)+1;
			color = new Color(r, g, b);
			if(color == Color.RED) {
				noRojo = true;
			}
		} while (noRojo);
		
		System.out.println("\n");
		
		for (Arista arista : aristaAuxiliares) {
			for (Arista arista1 : rutaEconomica.getAristas()) {
				if(arista==arista1) {
					System.out.println("igual");
					arista.setColor(color);
					repaint();
				}
			}
		}
		
	}
	
	
}
