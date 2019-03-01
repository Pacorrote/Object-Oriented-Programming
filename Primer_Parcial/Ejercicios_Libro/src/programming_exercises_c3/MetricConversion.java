package programming_exercises_c3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MetricConversion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final float gAL=(float) 3.7854;
		final float inAC=(float) 2.54;
		Scanner Sc = new Scanner(System.in);
		System.out.println("Ingrese un valor "
				+ "numerico");
		int metrica=Sc.nextInt();
		JOptionPane.showMessageDialog(null, "Inches a centimetros: "
				+inACen(metrica, inAC)
				+"\n"+"U.S. Gallons a litros es: "
				+galALitros(metrica, gAL));
	}
	public static float inACen(int numero, float unidades) {
		return numero * unidades;
	}
	
	public static float galALitros(int numero, float unidades) {
		return numero * unidades;
	}
}
