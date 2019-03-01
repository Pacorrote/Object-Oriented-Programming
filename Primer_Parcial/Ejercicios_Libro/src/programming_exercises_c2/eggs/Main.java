package programming_exercises_c2.eggs;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String h =JOptionPane.showInputDialog(null, "Ingrese la cantidad de huevos ");
		int eggs = Integer.parseInt(h);
		Eggs huevos = new Eggs (eggs);
		JOptionPane.showMessageDialog(null, huevos.precioTotal(huevos));
	}

}
