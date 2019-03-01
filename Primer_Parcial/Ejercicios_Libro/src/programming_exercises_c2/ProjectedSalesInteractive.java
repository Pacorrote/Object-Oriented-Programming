package programming_exercises_c2;

import javax.swing.JOptionPane;
public class ProjectedSalesInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final float incremento = (float) 0.1;
		String dNorte=JOptionPane.showInputDialog(null, "Ventas totales division norte: ");
		String dSur=JOptionPane.showInputDialog(null, "Ventas totales division sur");
		int norte = Integer.parseInt(dNorte);
		int sur = Integer.parseInt(dSur);
		JOptionPane.showMessageDialog(null, "Ventas proyectadas para el siguente año"
				+ "en division norte es de "+(norte+(norte*incremento))+"  y en división sur "
				+(sur+(sur*incremento)));
	}
}
