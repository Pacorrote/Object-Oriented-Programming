package hilos;

import java.awt.event.MouseEvent;

import gui.PanelGrafo;
import objetos.AristaStatus;

public class HiloSelNodo extends Thread{
	
	private PanelGrafo pnlGrafo;
	private MouseEvent e;
	private static Boolean status = false;
	
	public HiloSelNodo() {
		// TODO Auto-generated constructor stub
	}
	
	public HiloSelNodo(PanelGrafo pnlGrafo, MouseEvent e) {
		// TODO Auto-generated constructor stub
		this.pnlGrafo = pnlGrafo;
		this.e = e;
		HiloSelNodo.status = false;
	}
	

	public PanelGrafo getPnlGrafo() {
		return pnlGrafo;
	}

	public void setPnlGrafo(PanelGrafo pnlGrafo) {
		this.pnlGrafo = pnlGrafo;
	}
	

	public static Boolean getStatus() {
		return status;
	}
	

	public static void setStatus(Boolean status) {
		HiloSelNodo.status = status;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		pnlGrafo.seleccionarNodo(e);
		if(pnlGrafo.getStatus()==AristaStatus.Pintar) {
			pnlGrafo.getAuxArista().setP(pnlGrafo.getAuxNodo());
			pnlGrafo.getAuxNodo().addArista(pnlGrafo.getAuxArista());
		}
	}

}
