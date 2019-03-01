package programming_exercises_c3.ej4;

import javax.swing.JOptionPane;

public class Percentages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=2, b=5;
		double c = computePercent(a, b);
		JOptionPane.showMessageDialog(null, a+" es el "+c+"% de "+b);
	}
	public static double computePercent(double a, double b) {
		double c = a/b;
		c=c*100;
		return c;
	}
}
