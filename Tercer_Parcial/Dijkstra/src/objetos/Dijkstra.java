package objetos;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import excepciones.NoFinException;
import excepciones.NoInicioException;
import excepciones.NodoFinNoConectadoException;
import gui.Arista;
import gui.Nodo;

public class Dijkstra {
	
	private ArrayList<Nodo> nodos;
	
	private Nodo inicio;
	
	private static ArrayList<Integer> costos;
	
	private JFrame parent;
	
	private static Boolean hayFin;
	
	private static ArrayList<Ruta> rutas;
	
	public JFrame getParent() {
		return parent;
	}


	public void setParent(JFrame parent) {
		this.parent = parent;
	}


	public static ArrayList<Integer> getCostos() {
		return costos;
	}


	public static void setCostos(ArrayList<Integer> costos) {
		Dijkstra.costos = costos;
	}


	public Dijkstra(ArrayList<Nodo> nodos, JFrame parent) throws NodoFinNoConectadoException {
		// TODO Auto-generated constructor stub
		Dijkstra.hayFin = false;
		this.parent = parent;
		this.nodos = nodos;
		discriminarNodos();
		if(inicio==null) {
			try {
				throw new NoInicioException("Inicio no encontrado o no indicado");
			} catch (NoInicioException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(parent, 
						e.getMessage(),
						"ERROR",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	
	public Dijkstra() {
		// TODO Auto-generated constructor stub
		Dijkstra.hayFin = false;
	}


	public ArrayList<Nodo> getNodos() {
		return nodos;
	}


	public void setNodos(ArrayList<Nodo> nodos) throws NodoFinNoConectadoException {
		this.nodos = nodos;
		discriminarNodos();
		
	}


	public Nodo getInicio() {
		return inicio;
	}
	

	public void setInicio(Nodo inicio) {
		this.inicio = inicio;
	}

	
	private static void recorrer(Nodo inicio, int suma) {
		inicio.ordenarAristas();
		for (Arista arista : inicio.getAristas()) {
			if(!arista.getT().isFin()) {
				recorrer(arista.getT(), suma+arista.getNumero());
			}
			else {
				suma+=arista.getNumero();
				costos.add(suma);
				suma-=arista.getNumero();
			}
		}
	}
	
	public static Integer dijkstraCosto(Nodo inicio, int suma) throws NoFinException {
		if(hayFin) {
			costos = new ArrayList<>();
			suma=0;
			recorrer(inicio, suma);
			return menorCosto();
		}
		else {
			throw new NoFinException("Nodo fin no indicado");
		}
	}
	
	private static void recorrer(Nodo inicio, ArrayList<Arista> aristas, int suma) {
		inicio.ordenarAristas();
		for (Arista arista : inicio.getAristas()) {
			aristas.add(arista);
			if(!arista.getT().isFin()) {
				recorrer(arista.getT(), aristas, suma+arista.getNumero());
			}
			else {
				suma+=arista.getNumero();
				rutas.add(new Ruta(Ruta.aristas(aristas), suma));
				suma-=arista.getNumero();
				aristas.remove(aristas.size()-1);
			}
		}
	}
	
	public static Ruta dijkstraRutas(Nodo inicio, int suma) throws NoFinException {
		if(hayFin) {
			rutas = new ArrayList<>();
			suma = 0;
			ArrayList<Arista> aristas = new ArrayList<>();
			recorrer(inicio, aristas, suma);
			return rutaEconomica();
		}
		else {
			throw new NoFinException("Nodo fin no indicado");
		}
	}
	
	private static Ruta rutaEconomica() {
		for (Ruta ruta : rutas) {
			if(ruta.getSumaTotal()==menorCosto()) {
				return ruta;
			}
		}
		return null;
	}
	
	private static Integer menorCosto() {
		int aux = costos.get(0);
		for (Integer integer : costos) {
			if(aux>integer) {
				aux=integer;
			}
		}
		return aux;
	}

	private void discriminarNodos() throws NodoFinNoConectadoException {
		for (Nodo nodo : nodos) {
			if(nodo.isInicio()) {
				inicio = nodo;
			}
			if(nodo.isFin()) {
				if (nodo.getArraylistIndiceP().size()>0) {
					hayFin = true;
				}
				else if(nodo.getArraylistIndiceP().isEmpty()){
					throw new NodoFinNoConectadoException("Nodo final no conectado, intentelo de nuevo");
				}
			}
		}
	}
}
