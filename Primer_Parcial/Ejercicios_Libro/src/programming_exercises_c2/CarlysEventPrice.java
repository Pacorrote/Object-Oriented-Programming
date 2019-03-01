package programming_exercises_c2;

import javax.swing.JOptionPane;

public class CarlysEventPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int personas, total;
		final int precio = 35;
		String numPer =JOptionPane.showInputDialog(null, "Numero de invitados");
		personas = Integer.parseInt(numPer);
		total = personas*precio;
		boolean lEvent = personas>50;
		JOptionPane.showMessageDialog(null, "Total de "+total+"\nEvento largo \n"+lEvent);
	}

}
