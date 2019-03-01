package programming_exercises_c2.conversiones;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inches1;
		String numero =JOptionPane.showInputDialog(null, "Numero de pulgadas: ");
		inches1 = Integer.parseInt(numero);
		InchesToFeet inches = new InchesToFeet(inches1);
		JOptionPane.showMessageDialog(null, inches.conversion()+" pies y "+
		(inches1-inches.FEETTOINCHES*inches.conversion())+" pulgadas");
	}

}

