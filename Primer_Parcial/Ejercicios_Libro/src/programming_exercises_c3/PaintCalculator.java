package programming_exercises_c3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PaintCalculator {
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Inserte largo, ancho y alto de "
				+ "la recamara");
		int b = sc1.nextInt();
		int a = sc1.nextInt();
		int c = sc1.nextInt();
		int gT=calculoGalones(areaTotal(a, b, c));
		if (gT==0) {
			gT+=1;
		}
		int precioTotal = precio(gT);
		JOptionPane.showMessageDialog(null, "El costo total es de: "
				+"$"+precioTotal);
	}
	public static int areaTotal(int a, int b, int c) {
		return 2*((b*c)+(a*c))+(a*b);
	}
	public static int calculoGalones(int areaT) {
		return areaT/350;
	}
	public static int precio(int galones) {
		return galones*32;
	}
}
