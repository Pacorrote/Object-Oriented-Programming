package case_problems_c2.sammysrentalprice;
import javax.swing.JOptionPane;
public class SammysRentalPrice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minutos, total;
		final int equipo = 40;
		String tiempoUsado =JOptionPane.showInputDialog(null, "Numero de minutos");
		minutos = Integer.parseInt(tiempoUsado);
		MinutosAHoras tiempoRentado = new MinutosAHoras(minutos);
		JOptionPane.showMessageDialog(null, "Horas "+tiempoRentado.minutosAHoras()+"\nMinutos "
		+tiempoRentado.getRestanteMin()+"\nPrecio total\n"+(tiempoRentado.minutosAHoras()*equipo
		+tiempoRentado.getRestanteMin()));
	}

}
