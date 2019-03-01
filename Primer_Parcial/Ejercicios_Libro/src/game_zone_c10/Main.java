package game_zone_c10;

import java.util.Scanner;

import game_zone_c10.objects.Jupiterian;
import game_zone_c10.objects.Martian;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int opc, dos=2;
		Jupiterian jupiteriano;
		Martian marciano;
		do {
			System.out.println("Inserte 1 si quiere crear un Jupiteriano");
			System.out.println("Inserte 2 si quiere crear un Marciano");
			opc = sc.nextInt();
			switch(opc) {
			case 1:
				System.out.println("Inserte el color y vidas");
				jupiteriano = new Jupiterian(sc.next(), sc.nextInt());
				System.out.println(jupiteriano.descripcion());
				break;
			case 2:
				System.out.println("Inserte el color y vidas");
				marciano = new Martian(sc.next(), sc.nextInt());
				System.out.println(marciano.descripcion());
			}
			dos--;
		}while(dos>0);
		
	}

}
