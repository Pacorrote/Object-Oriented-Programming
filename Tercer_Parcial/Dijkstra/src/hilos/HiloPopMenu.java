package hilos;


import java.awt.event.MouseEvent;

import gui.PanelGrafo;

public class HiloPopMenu extends Thread{
	
	private PanelGrafo pnlGrafo;
	private MouseEvent evento;

	public HiloPopMenu(PanelGrafo pnlGrafo, MouseEvent evento) {
		this.pnlGrafo = pnlGrafo;
		this.evento = evento;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		pnlGrafo.mostrarPopMenu(evento);
		yield();
	}
	
	

}
