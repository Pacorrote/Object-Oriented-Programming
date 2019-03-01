package programming_exercises_c2.conversiones;

import javax.swing.JOptionPane;

public class FahrenheitToCelsius {

	public static float fahrenheitToCelsius(int farenheit) {
		float celsius = farenheit-32;
		return celsius*(5f/9f);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int farenheit;
		String f =JOptionPane.showInputDialog(null, "Grados farenheit");
		farenheit = Integer.parseInt(f);
		float celsius = fahrenheitToCelsius(farenheit);
		JOptionPane.showMessageDialog(null, celsius+" grados celsius");
	}
}
