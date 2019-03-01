package programming_exercises_c3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Insurance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Ingrese la edad del "
				+ "cliente");
		int edad = sc1.nextInt();
		JOptionPane.showMessageDialog(null, "La cantidad a pagar "
				+"es de $"+calculatesAmount(edad));
		
	}
	private static int decada(int edad) {
		return edad/10;
	}
	public static int calculatesAmount(int edad) {
		int decada = decada(edad);
		return (decada+15)*20;
	}
}
