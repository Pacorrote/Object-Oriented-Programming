package test;

import java.util.ArrayList;
import java.util.Scanner;

import coleccion.MiArrayList;
import objects.Camion;
import objects.Camioneta;
import objects.Particular;
import objects.Taxi;
import objects.Vehiculo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generVehiculohod stub
		MiArrayList vehiculos = new MiArrayList();
		Scanner sc = new Scanner(System.in);
		int opc, opc1;
		System.out.println("Calculadora de impuestos vehiculares Oaxaca");
		do {
			System.out.println("Ingrese la opcion numerica correcta");
			System.out.println("1.Ingresar vehiculos\n"
					+ "2.Ver impuesto de cada uno\n"
					+ "3.Salir");
			opc=sc.nextInt();
			switch(opc) {
			case 1:
				System.out.println("Ingrese el tipo de vehículo según la opción");
				System.out.println("1.Particular\n"
						+ "2.Taxi\n"
						+ "3.Camioneta"
						+ "4.Camion");
				opc1=sc.nextInt();
				System.out.println("Placa, noSerie, marca, modelo, valor de la factura");
				switch(opc1) {
				case 1:
					System.out.print(", no de pasajero");
					vehiculos.add(new Particular(sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.nextFloat(),sc.nextInt()));
					break;
				case 2:
					System.out.println(", no de pasajero, años de concesion");
					vehiculos.add(new Taxi(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextFloat(), sc.nextInt(), sc.nextInt()));
					break;
				case 3:
					System.out.println(", no de toneladas y Publico (true o false)");
					vehiculos.add(new Camioneta(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextFloat(), sc.nextInt(), sc.nextBoolean()));
					break;
				case 4:
					System.out.println(", no de toneladas, Publico (true o false) y numero de ejes");
					vehiculos.add(new Camion(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextFloat(), sc.nextInt(), sc.nextBoolean(), sc.nextInt()));
					break;
				}
				break;
			case 2:
				for (Vehiculo vehiculo : vehiculos) {
					System.out.println(vehiculo.informacion());
				}
				break;
			default:
				System.out.println("Opcion invalida\nIntentelo de nuevo");
			}
			opc=sc.nextInt();
		} while (opc!=3);
	}

}
