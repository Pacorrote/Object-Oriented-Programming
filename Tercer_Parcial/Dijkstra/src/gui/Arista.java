package gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Arista {
	
	private Integer numero;
	private Nodo p;
	private Nodo t;
	private Integer x2;
	private Integer y2;
	private Integer indiceP;
	
	public static final Float DEFAULTGROSOR = (float) 4;
	
	public Arista() {
		// TODO Auto-generated constructor stub
	}
	
	public Arista(Nodo p, Nodo t) {
		// TODO Auto-generated constructor stub
		this.p = p;
		this.t = t;
	}
	
	public Arista(Integer numero) {
		// TODO Auto-generated constructor stub
		this.numero = numero;
	}
	
	public Arista(Nodo p, Nodo t, Integer numero) {
		// TODO Auto-generated constructor stub
		this.p = p;
		this.t = t;
		this.numero = numero;
	}
	

	public Integer getX2() {
		return x2;
	}

	public void setX2(Integer x2) {
		this.x2 = x2;
	}


	public Integer getY2() {
		return y2;
	}

	public void setY2(Integer y2) {
		this.y2 = y2;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Nodo getP() {
		return p;
	}

	public void setP(Nodo p) {
		this.p = p;
	}

	public Nodo getT() {
		return t;
	}

	public void setT(Nodo t, Integer index) {
		this.t = t;
		setX2(t.getX());
		setY2(t.getY());
		this.indiceP = index;
		t.setIndiceP(indiceP);
	}
	
	public void pintarArista(Graphics g) {
		Graphics2D g1 = (Graphics2D) g;
		g1.setStroke(new BasicStroke(DEFAULTGROSOR));
		g1.setColor(Color.RED);
		if(t==null) {
			g1.drawLine(p.getX(), p.getY(), x2, y2);
		}
		else {
			if(numero!=null) {
				g1.setFont(new Font("Futura", Font.BOLD, 20));
				g1.drawString(numero.toString(), ((p.getX()+t.getX())/2)+10, ((p.getY()+t.getY())/2)+10);
			}
			g1.drawLine(p.getX(), p.getY(), t.getX(), t.getY());
		}
	}

	public Integer getIndiceP() {
		return indiceP;
	}

	public void setIndiceP(Integer indiceP) {
		this.indiceP = indiceP;
	}
	
	
}
