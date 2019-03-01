package programming_exercises_c3.ej4;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Percentages2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		double a, b;
		System.out.println("Ingrese dos valores"
				+ "decimales");
		a=Sc.nextDouble();
		b=Sc.nextDouble();
		double c = computePercent(a, b);
		JOptionPane.showMessageDialog(null, a+" es el "+c+"% de "+b);
	}
	public static double computePercent(double a, double b) {
		double c = a/b;
		c=c*100;
		return c;
	}
}
