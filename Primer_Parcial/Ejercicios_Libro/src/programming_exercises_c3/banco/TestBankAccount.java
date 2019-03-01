package programming_exercises_c3.banco;

import java.util.Scanner;

public class TestBankAccount {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		
		
		System.out.println("Ingrese numero de cuenta, Nombre y saldo de la cuenta1");
		CuentaBancaria cuenta1 = new CuentaBancaria(sc1.nextInt(), sc1.next(), sc1.nextFloat());
		System.out.println("Ingrese numero de cuenta, Nombre y saldo de la cuenta2");
		CuentaBancaria cuenta2 = new CuentaBancaria(sc1.nextInt(), sc1.next(), sc1.nextFloat());
		System.out.println("Ingrese numero de cuenta, Nombre y saldo de la cuenta3");
		CuentaBancaria cuenta3 = new CuentaBancaria(sc1.nextInt(), sc1.next(), sc1.nextFloat());
		System.out.println("Ingrese numero de cuenta, Nombre y saldo de la cuenta4");
		CuentaBancaria cuenta4 = new CuentaBancaria(sc1.nextInt(), sc1.next(), sc1.nextFloat());
		System.out.println("Saldo de la cuenta1: "+cuenta1.getSaldoDeLaC());
		System.out.println("Saldo de la cuenta2: "+cuenta2.getSaldoDeLaC());
		System.out.println("Saldo de la cuenta3: "+cuenta3.getSaldoDeLaC());
		System.out.println("Saldo de la cuenta4: "+cuenta4.getSaldoDeLaC());
	}

}
