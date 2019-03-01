package case_problems_c3.carlyseventprice;

import java.util.Scanner;

public class EventDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Event evento = new Event();
		evento.setNumIn(numberOfGuests());
		CarlysEventPriceWithMethods.nombreCompannia();
		evento.setPrecio(evento.PPPERSONA*evento.getNumIn());
		boolean lEvent = evento.getNumIn()>evento.LEVENTO;
		System.out.println("precio por persona: "+evento.PPPERSONA);
		System.out.println("precio total: "+evento.getPrecio());
		System.out.println("Es evento largo: "+lEvent);
	}
	public static int numberOfGuests() {
		Scanner sc = new Scanner(System.in);
		int invitados;
		System.out.println("Ingrese la cantidad de invitados");
		invitados = sc.nextInt();
		return invitados;
	}
}
