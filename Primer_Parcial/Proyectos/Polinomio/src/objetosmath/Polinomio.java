package objetosmath;

import java.util.ArrayList;

public class Polinomio {
	private ArrayList<Monomio> terminos;
	public Polinomio() {
		// TODO Auto-generated constructor stub
		terminos = new ArrayList<>();
	}
	public void add(Monomio mono) {
		terminos.add(mono);
	}
	public void simplificar() {
		ArrayList<Monomio> otraList=new ArrayList<>();
		int a=0;
		while(terminos.size()>0) {
			Monomio aux = terminos.remove(0);
			while(a<terminos.size()) {
				if(isSemejante(aux, a)) {
					aux.setCoeficiente(aux.getCoeficiente()+terminos.get(a).getCoeficiente());
					terminos.remove(a);
				}
				else {
					a++;
				}
			}
			otraList.add(aux);
		}
		terminos=otraList;
	}
	public Boolean isSemejante(Monomio com, int posicion) {
		return com.getExponente()==terminos.get(posicion).getExponente();
	}
	
	public static Boolean isSemejante(Monomio m1, Monomio m2) {
		return m1.getExponente()==m2.getExponente();
	}
	
	public static Integer longitudMayor(Polinomio p1, Polinomio p2) {
		return p1.terminos.size()>p2.terminos.size()? p1.terminos.size(): p2.terminos.size();
	}
	
	private static Polinomio polinomioMenor(Polinomio p1, Polinomio p2) {
		return p1.terminos.size()>p2.terminos.size()? p2: p1;
	}
	
	public static Polinomio sumaPolinomios(Polinomio p1, Polinomio p2) {
		int a1=0;
		Polinomio suma = new Polinomio();
		while (a1<longitudMayor(p1, p2)) {
			if(polinomioMenor(p1, p2).terminos.size()>a1) {
				suma.add(new Monomio(polinomioMenor(p1, p2).terminos.get(a1).getCoeficiente(), 
						polinomioMenor(p1, p2).terminos.get(a1).getExponente()));
			}
			if(p1.equals(polinomioMenor(p1, p2))) {
				suma.add(new Monomio(p2.terminos.get(a1).getCoeficiente(),
						p2.terminos.get(a1).getExponente()));
			}
			else {
				suma.add(new Monomio(p1.terminos.get(a1).getCoeficiente(),
						p1.terminos.get(a1).getExponente()));
			}
		}
		suma.simplificar();
		return suma;
	}
	
	public void toNegativo() {
		ArrayList<Monomio> otraList=new ArrayList<>();
		while(terminos.size()>0) {
			Monomio aux = terminos.remove(0);
			aux.setCoeficiente(-aux.getCoeficiente());
			otraList.add(aux);
		}
		terminos=otraList;
	}
	
	public static Polinomio restaPolinomios(Polinomio p1, Polinomio p2) {
		int a1=0;
		p2.toNegativo();
		Polinomio resta = new Polinomio();
		while (a1<longitudMayor(p1, p2)) {
			if(polinomioMenor(p1, p2).terminos.size()>a1) {
				resta.add(new Monomio(polinomioMenor(p1, p2).terminos.get(a1).getCoeficiente(), 
						polinomioMenor(p1, p2).terminos.get(a1).getExponente()));
			}
			if(p1.equals(polinomioMenor(p1, p2))) {
				resta.add(new Monomio(p2.terminos.get(a1).getCoeficiente(),
						p2.terminos.get(a1).getExponente()));
			}
			else {
				resta.add(new Monomio(p1.terminos.get(a1).getCoeficiente(),
						p1.terminos.get(a1).getExponente()));
			}
			a1++;
		}
		resta.simplificar();
		return resta;
	}
	public static Polinomio mPolinomio(Polinomio p1, Polinomio p2) {
		Polinomio multi = new Polinomio();
		for (Monomio aux : p2.terminos) {
			for (Monomio aux2 : p1.terminos) {
				multi.add(new Monomio(aux.getCoeficiente()*aux2.getCoeficiente(), 
						aux.getExponente()+aux2.getExponente()));
			}
		}
		multi.simplificar();
		return multi;
	}
	
	public void imprimir() {
		for (Monomio monomio : terminos) {
			System.out.print(monomio.imprimirMonomio());
		}
		System.out.println("\n");
	}
}
