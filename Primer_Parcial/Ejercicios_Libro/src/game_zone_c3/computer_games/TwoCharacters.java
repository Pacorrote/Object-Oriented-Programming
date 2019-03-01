package game_zone_c3.computer_games;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class TwoCharacters {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Personaje 1");
		System.out.println("Ingrese el color, numero de ojos y numero de vida");
		String color1 = sc1.nextLine();
		int ojos1 = sc1.nextInt();
		int vidas1 = sc1.nextInt();
		System.out.println("Personaje 2");
		System.out.println("Ingrese el color, numero de ojos y numero de vida");
		String color2 = sc1.nextLine();
		int ojos2 = sc1.nextInt();
		int vidas2 = sc1.nextInt();
		MyCharacter personaje1 = new MyCharacter(color1,ojos1,vidas1);
		MyCharacter personaje2 = new MyCharacter(color2,ojos2,vidas2);
		JOptionPane.showMessageDialog(null, "Personaje 1:\n"+
		personaje1.descripcion()+"\nPersonaje2"+
				personaje2.descripcion());
	}

}
