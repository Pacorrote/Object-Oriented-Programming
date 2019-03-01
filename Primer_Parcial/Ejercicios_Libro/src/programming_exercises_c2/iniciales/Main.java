package programming_exercises_c2.iniciales;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a, b, c;
		String a1 =JOptionPane.showInputDialog(null, "Primer inicial: ");
		String b1 =JOptionPane.showInputDialog(null, "Segunda inicial: ");
		String c1 =JOptionPane.showInputDialog(null, "Tercera inicial: ");
		a = a1.charAt(0);
		b = b1.charAt(0);
		c = c1.charAt(0);
		Initials F = new Initials(a, b, c);
		JOptionPane.showMessageDialog(null, F.imprimir());
	}

}
