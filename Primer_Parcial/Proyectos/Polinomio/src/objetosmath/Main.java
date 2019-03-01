package objetosmath;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		System.out.println("\t\tBienvenidos a la calculadora de polinomios");
		Polinomio p1 = new Polinomio();
		Polinomio p2 = new Polinomio();
		System.out.println("Insertar datos del polinomio 1 (coeficiente despues exponente). Con S termina la inserción");
		char opc;
		
		do {
			System.out.println("A. Imprimir");
			System.out.println("B. Simplificar");
			System.out.println("C. Sumar");
			System.out.println("D. Restar");
			System.out.println("E. Multiplicar");
			System.out.println("I. Ingresar datos");
			System.out.println("S. Salir");
			opc = sc1.next().charAt(0);
			switch(opc) {
			case 'A':
				p1.imprimir();
				p2.imprimir();
				break;
			case 'B':
				p1.simplificar();
				p2.simplificar();
				System.out.println("¡Listo!");
				break;
			case 'C':
				Polinomio.sumaPolinomios(p1, p2).imprimir();
				break;
			case 'D':
				Polinomio.restaPolinomios(p1, p2).imprimir();
				break;
			case 'E':
				Polinomio.mPolinomio(p1, p2).imprimir();
				break;
			case 'I':
				char opc1;
				do {
					p1.add(new Monomio(sc1.nextInt(), sc1.nextInt()));
					System.out.println("Desea Ingresar mas datos, ingrese S o s, si no N o n");
					opc1 = sc1.next().charAt(0);
				}while(opc=='S' || opc=='s');
				System.out.println("Insertar datos del polinomio 2 (coeficiente despues exponente). Con S termina la inserción");
				do {
					p1.add(new Monomio(sc1.nextInt(), sc1.nextInt()));
					System.out.println("Desea Ingresar mas datos, ingrese S o s, si no N o n");
					opc1 = sc1.next().charAt(0);
				}while(opc1=='S' || opc1=='s');
				break;
			case 'S':
				System.out.println("Hasta luego");
				break;
			default:
				System.out.println("Option Error");
				break;
			}
		}while(opc!='S');
	}

}
