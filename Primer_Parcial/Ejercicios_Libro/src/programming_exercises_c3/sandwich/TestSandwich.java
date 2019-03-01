package programming_exercises_c3.sandwich;
import java.util.Scanner;
public class TestSandwich {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Ingrese ingredientes:");
		String ingrediente = sc1.nextLine();
		System.out.println("Ingrese tipo de pan:");
		String tP = sc1.nextLine();
		System.out.println("Ingrese el precio del "
				+ "Sandwich:");
		double precioSandwich = sc1.nextDouble();
		Sandwich sandwich = new Sandwich();
		sandwich.setIngrediente(ingrediente);
		sandwich.setTipoPan(tP);
		sandwich.setPrecio(precioSandwich);
	}

}
