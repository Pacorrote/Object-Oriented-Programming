package programming_exercises_c3;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		float inversion;
		System.out.println("Ingrese la inversion a ingresar");
		inversion = sc1.nextFloat();
		JOptionPane.showMessageDialog(null, "Su inversion total es:\n"
				+inversionPorAnno(inversion));
	}
	public static float inversionPorAnno(float inversion) {
		return (float) (inversion+(inversion*.05));
	}

}
