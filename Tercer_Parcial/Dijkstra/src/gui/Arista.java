package gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.Serializable;

public class Arista implements Serializable{
	
	private Integer numero;
	private Nodo p;
	private Nodo t;
	private Integer x2;
	private Integer y2;
	private Integer indiceP;
	private Color color = Color.RED;

	
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
		t.getArraylistIndiceP().add(indiceP);
		for (int numero : t.getArraylistIndiceP()) {
			System.out.println(numero);
		}
	}
	
	public void pintarArista(Graphics g) {
		Graphics2D g1 = (Graphics2D) g;
		g1.setStroke(new BasicStroke(DEFAULTGROSOR));
		g1.setColor(color);
		if(t==null) {
			g1.drawLine(p.getX(), p.getY(), x2, y2);
		}
		else {
			if(numero!=null) {
				g1.setFont(new Font("Futura", Font.BOLD, 20));
				g1.drawString(numero.toString(), puntoMedioX()+10, puntoMedioY()+10);
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
	
	public Float puntoMedioX() {
		float xpm;
		if(t!=null) {
			xpm = t.getX()+p.getX();
			xpm = xpm/2;
			return xpm;
		}
		else {
			xpm = x2+p.getX();
			xpm = xpm/2;
			return xpm;
		}
	}
	
	public Float puntoMedioY() {
		float ypm;
		if(t!=null) {
			ypm = t.getY()+p.getY();
			ypm = ypm/2;
			return ypm;
		}
		else {
			ypm = y2+p.getY();
			ypm = ypm/2;
			return ypm;
		}
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
}
