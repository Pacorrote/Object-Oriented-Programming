package programming_exercises_c2;

import javax.swing.JOptionPane;

public class DogBoarding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PRECIO = .5;
		int libra, dias;
		String l=JOptionPane.showInputDialog(null, "Inserte el numero de libras");
		libra = Integer.parseInt(l);
		String d=JOptionPane.showInputDialog(null, "Inserte el numero de dias");
		dias = Integer.parseInt(d);
		JOptionPane.showMessageDialog(null, "El precio a pagar es de "+(PRECIO*dias+PRECIO*libra));
	}

}
