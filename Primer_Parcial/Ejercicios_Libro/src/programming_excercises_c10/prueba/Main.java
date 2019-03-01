package programming_excercises_c10.prueba;


import java.util.ArrayList;
import java.util.Scanner;

import programming_excercises_c10.ejercicios.Candle;
import programming_excercises_c10.ejercicios.Car;
import programming_excercises_c10.ejercicios.CarRental;
import programming_excercises_c10.ejercicios.CollegeCourse;
import programming_excercises_c10.ejercicios.CollegeEmployee;
import programming_excercises_c10.ejercicios.DoublesTennisGame;
import programming_excercises_c10.ejercicios.Faculty;
import programming_excercises_c10.ejercicios.Horse;
import programming_excercises_c10.ejercicios.LeapYear;
import programming_excercises_c10.ejercicios.LuxuryCarRental;
import programming_excercises_c10.ejercicios.MotorCycle;
import programming_excercises_c10.ejercicios.RaceHorse;
import programming_excercises_c10.ejercicios.ScentedCandle;
import programming_excercises_c10.ejercicios.SizeCar;
import programming_excercises_c10.ejercicios.Student;
import programming_excercises_c10.ejercicios.TennisGame;
import programming_excercises_c10.ejercicios.Year;
import programming_excercises_c10.ejercicios.Package;
import programming_excercises_c10.ejercicios.Person;
import programming_excercises_c10.ejercicios.InsuredPackage;
import programming_excercises_c10.ejercicios.LabCourse;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Ejercicio 1\n\n");
		String name, color;
		System.out.println("Inserte el nombre del caballo");
		name=sc1.next();
		System.out.println("Inserte el color del caballo");
		color=sc1.next();
		System.out.println("Inserte el año de nacimiendo del caballo");
		int year = sc1.nextInt();
		Horse caballo = new Horse(name, color, year);
		System.out.println("Inserte el nombre del caballo de carreras");
		name=sc1.next();
		System.out.println("Inserte el color del caballo de carreras");
		color=sc1.next();
		System.out.println("Inserte el año de nacimiendo del caballo de carreras");
		year = sc1.nextInt();
		System.out.println("Inserte el numero de competiciones del caballo de carreras");
		int numVeces = sc1.nextInt();
		RaceHorse caballoCarrera = new RaceHorse(name,color,year, numVeces);
		System.out.println("El nombre del caballo "+caballo.getName()+
				" Color "+caballo.getColor()+" Nacido en el año "+caballo.getBirthY());
		System.out.println("\n");
		System.out.println("El nombre del caballo "+caballoCarrera.getName()+
				" Color "+caballoCarrera.getColor()+" Nacido en el año "+caballoCarrera.getBirthY()
				+" con "+caballoCarrera.getNumVeces()+" veces competidas");
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Ejercicio 2\n\n");
		float height;
		String aroma;
		System.out.println("Inserte el color de la vela");
		color=sc2.next();
		System.out.println("Inserte la altura");
		height=sc2.nextFloat();
		Candle vela = new Candle();
		vela.setColor(color);
		vela.setHeight(height);
		System.out.println("Inserte el olor de la vela");
		aroma=sc2.next();
		System.out.println("Inserte la altura de la vela aromática");
		height=sc2.nextFloat();
		ScentedCandle velaAromatica = new ScentedCandle(aroma);
		velaAromatica.setHeight(height);
		System.out.println("El precio de la vela es de: $"+vela.getPrice());
		System.out.println("El precio de la vela aromatica es de: $"+velaAromatica.getPrice());
		
		Scanner sc3 = new Scanner(System.in);
		String name2, name3, name4;
		int score1, score2;
		System.out.println("Ejercicio 3\n\n");
		TennisGame uno = new TennisGame();
		DoublesTennisGame dos = new DoublesTennisGame();
		System.out.println("Inserte el nombre del primer jugador");
		name=sc3.next();
		System.out.println("Inserte el nombre del segundo jugador");
		name2=sc3.next();
		System.out.println("Escribe el score del primer jugador");
		score1=sc3.nextInt();
		System.out.println("Escribe el score del segundo jugador");
		score2=sc3.nextInt();
		uno.setNombres(name, name2);
		uno.setScores(score1, score2);
		System.out.println("Inserte el nombre del primer jugador");
		name=sc3.next();
		System.out.println("Inserte el nombre del segundo jugador");
		name2=sc3.next();
		System.out.println("Inserte el nombre del tercer jugador");
		name3=sc3.next();
		System.out.println("Inserte el nombre del cuarto jugador");
		name4=sc3.next();
		System.out.println("Escribe el score del primer equipo");
		score1=sc3.nextInt();
		System.out.println("Escribe el score del segundo equipo");
		score2=sc3.nextInt();
		dos.setNombres(name, name2, name3, name4);
		dos.setScores(score1, score2);
		System.out.println("Primer jugador: "+uno.getScore1()+", "+uno.getCadenaScore1());
		System.out.println("Segundo jugador: "+uno.getScore2()+", "+uno.getCadenaScore2());
		System.out.println("Primer equipo: "+dos.getScore1()+", "+dos.getCadenaScore1());
		System.out.println("Segundo equipi: "+dos.getScore2()+", "+dos.getCadenaScore2());
		
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Ejercicio 4\n\n");
		Year anno = new Year();
		LeapYear annoBi = new LeapYear();
		System.out.println(anno.getDays());
		System.out.println(annoBi.getDays());
		System.out.println("Ingrese un dia");
		int dia = sc4.nextInt();
		System.out.println("Ingrese un mes");
		int mes = sc4.nextInt();
		System.out.println(anno.daysElapsed(mes, dia));
		System.out.println(annoBi.daysElapsed(mes, dia));
		
		Scanner sc5 = new Scanner(System.in);
		System.out.println("Ejercicio 6\n\n");
		System.out.println("Ingrese el peso en onzas");
		int pesoOnzas = sc5.nextInt();
		System.out.println("Ingrese el medio del envío");
		char medio = sc5.next().charAt(0); 
		InsuredPackage paquete = new InsuredPackage(pesoOnzas, medio);
		System.out.println(paquete.display());
		
		Scanner sc6 = new Scanner(System.in);
		String nombre, tamanno, nombre1;
		int zip_Code, diasRent;
		System.out.println("Ejercicio 7\n\n");
		System.out.println("CarRental");
		CarRental autos = new CarRental(nombre=sc6.next(), zip_Code=sc6.nextInt(), SizeCar.valueOf(tamanno=sc6.next()),
				diasRent=sc6.nextInt());
		System.out.println(autos.display());
		System.out.println("LuxuryCarRental lujo1");
		LuxuryCarRental lujo1 = new LuxuryCarRental(nombre=sc6.next(), zip_Code=sc6.nextInt(), SizeCar.valueOf(tamanno=sc6.next()),
				diasRent=sc6.nextInt());
		System.out.println("LuxuryCarRental lujo2");
		LuxuryCarRental lujo2 = new LuxuryCarRental(nombre=sc6.next(), zip_Code=sc6.nextInt(), SizeCar.valueOf(tamanno=sc6.next()), 
				diasRent=sc6.nextInt(), nombre1=sc6.next());
		System.out.println(lujo1.display());
		System.out.println(lujo2.display());
		
		Scanner sc7 = new Scanner(System.in);
		System.out.println("Ejercicio 8\n\n");
		CollegeCourse curso = new LabCourse("POO", 401, (byte) 6);
		System.out.println(curso.display());
		
		Scanner sc8 = new Scanner(System.in);
		System.out.println("Ejercicio 9\n\n");
		Car auto = new Car(47);
		MotorCycle moto = new MotorCycle(19);
		System.out.println(auto.toString());
		System.out.println(moto.toString());
		
		Scanner sc9 = new Scanner(System.in);
		System.out.println("Ejercicio 10\n\n");
		ArrayList <Person> escuela  = new ArrayList<>();
		int C=4, F=3, S=7;
		char persona;
		System.out.println("Bienvenidos");
		do {
			System.out.println("Inserte la opción correcta");
			System.out.println("C. Inserta Empleado");
			System.out.println("F. Insertar Profesor");
			System.out.println("S. Insertar Estudiante");
			System.out.println("Q. Salir");
			persona = sc7.next().charAt(0);
			switch(persona) {
			case 'C':
				if(C>0) {
					escuela.add(new CollegeEmployee());
					C--;
					System.out.println("Le restan "+C+" disponibles");
				}
				else {
					System.out.println("Espacio no disponible");
				}
				break;
			case 'F':
				if(F>0) {
					escuela.add(new Faculty());
					F--;
					System.out.println("Le restan "+F+" disponibles");
				}
				else {
					System.out.println("Espacio no disponible");
				}
				break;
			case 'S':
				if(S>0) {
					escuela.add(new Student());
					S--;
					System.out.println("Le restan "+S+" disponibles");
				}
				else {
					System.out.println("Espacio no disponible");
				}
				break;
			case 'Q':
				break;
			default:
				System.out.println("Error");
				System.out.println("Intentelo de nuevo\n");
			}
		}while(persona!='Q');
		for (Person person : escuela) {
			if(person instanceof CollegeEmployee) {
				System.out.println("Ingrese Nombre, Apellido/s, direccion, zip code, numero de telefono, numero de"
						+ "seguro social, salario anual y departamento(String)");
				person.setFirstName(sc7.next());
				person.setLastName(sc7.next());
				person.setAddress(sc7.next());
				person.setZip_Code(sc7.nextInt());
				person.setpNumber(sc7.nextInt());
				((CollegeEmployee) person).setSs(sc7.nextInt());
				((CollegeEmployee) person).setAnnualSalary((Number)(sc7.nextFloat()));
				((CollegeEmployee) person).setDepartamento(sc7.next());
			}
			if(person instanceof Faculty) {
				System.out.println("Ingrese Nombre, Apellido/s, direccion, zip code, numero de telefono, numero de" 
						+ "seguro social, salario anual, departamento(String) y ¿titular? (boolean)");
				person.setFirstName(sc7.next());
				person.setLastName(sc7.next());
				person.setAddress(sc7.next());
				person.setZip_Code(sc7.nextInt());
				person.setpNumber(sc7.nextInt());
				((CollegeEmployee) person).setSs(sc7.nextInt());
				((CollegeEmployee) person).setAnnualSalary((Number)(sc7.nextFloat()));
				((CollegeEmployee) person).setDepartamento(sc7.next());
				((Faculty) person).setTitular(sc7.nextBoolean());
			}
			if(person instanceof Student) {
				System.out.println("Ingrese Nombre, Apellido/s, direccion, zip code, numero de telefono, promedio (float)"
						+ "Carrera (String)");
				person.setFirstName(sc7.next());
				person.setLastName(sc7.next());
				person.setAddress(sc7.next());
				person.setZip_Code(sc7.nextInt());
				person.setpNumber(sc7.nextInt());
				((Student) person).setPromedio(sc7.nextFloat());
				((Student) person).setCarrera(sc7.next());
			}
		}
		for (Person person : escuela) {
			System.out.println(person.informacion());
		}
	}
}
