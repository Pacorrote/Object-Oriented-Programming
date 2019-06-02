package programa;

import java.util.ArrayList;

import gui.Arista;
import gui.Interfaz;
import gui.Nodo;
import objetos.Dijkstra;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaz interfaz = new Interfaz();
		ArrayList<Integer> arrayList1 = new ArrayList<>();
		arrayList1.add(1);
		ArrayList<Integer> arrayList2 = new ArrayList<>();
		for (Integer integer : arrayList1) {
			arrayList2.add(integer);
		}
		
		arrayList2.add(2);
		arrayList2.add(3);
		
		for (Integer integer : arrayList1) {
			System.out.print(integer+" ");
		}
		System.out.println("\n");
		
		for (Integer integer : arrayList2) {
			System.out.print(integer+" ");
		}
		
	}

}