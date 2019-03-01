package programming_exercises_c3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Ingrese el salario del "
				+ "empleado por dia");
		int salary=sc1.nextInt();
		System.out.println("Ingrese las horas extras "
				+ "del empleado");
		int horasExtras=sc1.nextInt();
		JOptionPane.showMessageDialog(null, "Su salario total es de "
				+"$"+salarioTotal(salary,horasExtras));
	}
	private static int horasExtras(int horasExtras) {
		return (int) (horasExtras*1.5);
	}
	public static int salarioTotal(int salario, int horas) {
		return salario+horasExtras(horas);
	}
}
