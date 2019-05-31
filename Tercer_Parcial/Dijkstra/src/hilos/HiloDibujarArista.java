package hilos;

import java.awt.event.MouseEvent;

import gui.Arista;
import gui.PanelGrafo;
import objetos.AristaStatus;

public class HiloDibujarArista extends Thread{
	
	private MouseEvent e;
	private Arista arista;
	private AristaStatus status;
	private PanelGrafo aux;
	
	
	public HiloDibujarArista() {
		// TODO Auto-generated constructor stub
	}
	
	public HiloDibujarArista(Arista arista, MouseEvent evento, PanelGrafo aux) {
		// TODO Auto-generated constructor stub
		this.arista = arista;
		e = evento;
		this.aux = aux;
	}
	
	
	public AristaStatus getStatus() {
		return status;
	}

	public void setStatus(AristaStatus status) {
		this.status = status;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			arista.setX2(e.getX());
			arista.setY2(e.getY());
			aux.getAuxArista().pintarArista(aux.getGraphics());
			aux.repaint();

		System.out.println("Finalicé");
	}
	
	

}
