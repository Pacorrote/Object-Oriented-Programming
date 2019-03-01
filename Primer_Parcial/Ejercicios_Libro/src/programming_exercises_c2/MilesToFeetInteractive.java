package programming_exercises_c2;
import java.util.Scanner;
public class MilesToFeetInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int feet_in_miles =5280;
		Scanner Sc = new Scanner(System.in);
		float distance;
		System.out.println("Ingrese la distancia en millas de la casa de su tio: ");
		distance = Sc.nextFloat();
		System.out.println(" ");
		System.out.println("La distancia de su casa a la casa de su tio en "
				+ "pies es de: "+distance*feet_in_miles);
	}
}
