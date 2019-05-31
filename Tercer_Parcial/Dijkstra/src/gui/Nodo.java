package gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class Nodo {

	private Character nombre;
	private ArrayList<Arista> aristas;
	private Boolean inicio;
	private Boolean fin;
	private Integer x;
	private Integer y;
	private Integer indiceP;
	private Color color;
	private Font fuente = new Font("Aqua", Font.PLAIN, 20);
	
	public static final Float DEFAULTGROSOR = (float) 3.5;
	
	public Nodo() {
		// TODO Auto-generated constructor stub
		aristas = new ArrayList<>();
		this.inicio = false;
		this.fin = false;
		this.color = Color.BLACK;
	}
	
	public Nodo(Integer x, Integer y) {
		// TODO Auto-generated constructor stub
		aristas = new ArrayList<>();
		this.inicio = false;
		this.fin = false;
		this.x = x;
		this.y = y;
		this.color = Color.BLACK;
	}
	
	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public Nodo(Character nombre, Integer x, Integer y) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		aristas = new ArrayList<>();
		this.inicio = false;
		this.fin = false;
		this.x = x;
		this.y = y;
	}
	
	public Boolean isInicio() {
		return inicio;
	}

	public void setInicio(Boolean inicio) {
		this.inicio = inicio;
	}

	public Boolean isFin() {
		return fin;
	}

	public void setFin(Boolean fin) {
		this.fin = fin;
	}

	public Character getNombre() {
		return nombre;
	}

	public void setNombre(Character nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Arista> getAristas() {
		return aristas;
	}

	public void setAristas(ArrayList<Arista> aristas) {
		this.aristas = aristas;
	}
	
	public void addArista(Arista arista) {
		this.aristas.add(arista);
	}
	
	public Arista selArista(Integer index) {
		return this.aristas.get(index);
	}
	
	public void ordenarAristas() {
		int n = (aristas.size()/2);
		do{
			int n1 = 0, n2 = 0;
			intercambio(n, n1, n2);
			n=n/2;
		}while(n>0);
	}
	
	private void intercambio(int n, int n1, int n2) {
		while(n<aristas.size()) {
			Arista aux1, aux2, aux3;
			aux1 = aristas.get(n1);
			aux2 = aristas.get(n2);
			aux3 = aristas.get(n);
			if(aux2.getNumero()>aux3.getNumero()) {
				Arista aux = new Arista(aux2.getP(), aux2.getT(), aux2.getNumero());
				aristas.set(n2, aux3);
				aristas.set(n, aux);
				aux2 = aux;
			}
			if(n-(aristas.size()/2)>=0) {
				if(aux2.getNumero()<aux1.getNumero()) {
					Arista aux = new Arista(aux2.getP(), aux2.getT(), aux2.getNumero());
					aristas.set(n1, aux);
					aristas.set(n2, aux1);
					n1++;
				}
			}
			n2++;
			n++;
		}
	}
	
	public Integer getIndiceP() {
		return indiceP;
	}

	public void setIndiceP(Integer indiceP) {
		this.indiceP = indiceP;
	}
	
	public void pintarNodo(Graphics g) {
		Graphics2D g1 = (Graphics2D) g;
		g1.setStroke(new BasicStroke(DEFAULTGROSOR));
		g1.setColor(color);
		if(nombre!=null) {
			g1.setFont(fuente);
			g1.drawString(nombre.toString(), x-40, y-40);
		}
		g1.drawOval(x-40, y-40, 80, 80);
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
