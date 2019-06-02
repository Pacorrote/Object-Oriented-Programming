package objetos;

import java.util.ArrayList;

import gui.Arista;

public class Ruta {
	
	private ArrayList<Arista> aristas;
	private Integer sumaTotal;
	
	public Ruta(ArrayList<Arista> aristas, Integer suma) {
		// TODO Auto-generated constructor stub
		this.aristas=aristas;
		this.sumaTotal=suma;
	}

	public ArrayList<Arista> getAristas() {
		return aristas;
	}

	public void setAristas(ArrayList<Arista> aristas) {
		this.aristas = aristas;
	}

	public Integer getSumaTotal() {
		return sumaTotal;
	}

	public void setSumaTotal(Integer sumaTotal) {
		this.sumaTotal = sumaTotal;
	}
	
	public static ArrayList<Arista> aristas (ArrayList<Arista> aristas){
		ArrayList<Arista> aristas1 = new ArrayList<>();
		for (Arista arista : aristas) {
			aristas1.add(arista);
		}
		return aristas1;
	}
	

}
