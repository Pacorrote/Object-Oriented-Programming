package programming_exercises_c2.dollars;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dollars;
		String dinero=JOptionPane.showInputDialog(null, "Inserte el dinero");
		dollars = Integer.parseInt(dinero);
		Dollars efectivo = new Dollars(dollars);
		JOptionPane.showMessageDialog(null, efectivo.billet(efectivo));
	}

}
