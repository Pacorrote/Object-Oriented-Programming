package case_problems_c3.sammyseashore;

import java.util.Scanner;

public class RentalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rental obSurf = new Rental();
		Scanner sc = new Scanner(System.in);
		obSurf.setHoras(SammysRentalPriceWithMethods.timeInMinutes());
		System.out.println("Ingrese la clave del contrato");
		String contrato = sc.nextLine();
		obSurf.setContrato(contrato);
		SammysRentalPriceWithMethods.nombreCompannia();
		System.out.println("Contrato:\n"+obSurf.getContrato());
		System.out.println("Horas:\n"+obSurf.getHoras());
		System.out.println("Minutos:\n"+obSurf.getRestante());
		System.out.println("Preciot total:\n"+obSurf.getPrecio());
	}

}
