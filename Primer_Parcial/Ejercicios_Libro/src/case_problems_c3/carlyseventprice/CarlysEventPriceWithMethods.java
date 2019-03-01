package case_problems_c3.carlyseventprice;

import java.util.Scanner;


public class CarlysEventPriceWithMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int precio = 35;
		int personas = numberOfGuests();
		nombreCompannia();
		computes(precio, personas);
		//boolean lEvent = personas>50;
		
	}
	public static int numberOfGuests() {
		Scanner sc = new Scanner(System.in);
		int invitados;
		System.out.println("Ingrese la cantidad de invitados");
		invitados = sc.nextInt();
		return invitados;
	}
	public static void nombreCompannia() {
		System.out.println("Carly´s Catering special events");
	}
	public static void computes(final int precio, int personas) {
		boolean lEvent = personas>50;
		System.out.println("precio por persona: "+precio);
		System.out.println("precio total: "+precio*personas);
		System.out.println("Es evento largo: "+lEvent);
	}
}
