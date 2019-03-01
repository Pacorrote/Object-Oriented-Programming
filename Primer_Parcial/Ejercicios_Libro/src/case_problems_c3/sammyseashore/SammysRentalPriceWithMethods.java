package case_problems_c3.sammyseashore;
import case_problems_c2.sammysrentalprice.MinutosAHoras;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class SammysRentalPriceWithMethods {

	public static void main(String[] args) {
		int minutos, total;
		final int equipo = 40;
		MinutosAHoras tiempoRentado = new MinutosAHoras(timeInMinutes());
		nombreCompannia();
		computes(equipo, tiempoRentado);
	}
	public static int timeInMinutes() {
		Scanner sc = new Scanner(System.in);
		int minutos;
		System.out.println("Ingrese los minutos que va a rentar el equipo");
		minutos = sc.nextInt();
		return minutos;
	}
	public static void nombreCompannia() {
		System.out.println("Sammy´s Seashore\n beach equipment\n");
	}
	public static void computes(final int precio, MinutosAHoras conversion) {
		System.out.println("Horas: "+conversion.minutosAHoras());
		System.out.println("Minutos: "+conversion.getRestanteMin());
		System.out.println("precio total: "+(conversion.minutosAHoras()*precio+conversion.getRestanteMin()));
	}
}
