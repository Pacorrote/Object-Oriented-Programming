package programming_exercises_c3.pinturas;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TestPainting {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese Titulo, artista, medio y precio");
		Painting paint = new Painting(sc.next(), sc.next(), sc.next(), sc.nextInt());
		JOptionPane.showMessageDialog(null, "la galeria tiene una comision del "
				+(Painting.COMISIONGALERIA)*10+"%");
	}

}
