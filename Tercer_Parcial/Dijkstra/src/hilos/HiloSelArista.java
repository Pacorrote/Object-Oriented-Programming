package hilos;

import java.awt.event.MouseEvent;

import gui.PanelGrafo;

public class HiloSelArista extends Thread{
	
	private PanelGrafo pnlGrafo;
	private MouseEvent e;
	private static Boolean status;

	public HiloSelArista() {
		// TODO Auto-generated constructor stub
	}
	
	public HiloSelArista(PanelGrafo pnlGrafo, MouseEvent e) {
		// TODO Auto-generated constructor stub
		this.pnlGrafo = pnlGrafo;
		this.e = e;
		HiloSelArista.status=false;
	}
	

	public static Boolean getStatus() {
		return status;
	}
	

	public static void setStatus(Boolean status) {
		HiloSelArista.status = status;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		pnlGrafo.seleccionarArista(e);

	}
	
	

}
