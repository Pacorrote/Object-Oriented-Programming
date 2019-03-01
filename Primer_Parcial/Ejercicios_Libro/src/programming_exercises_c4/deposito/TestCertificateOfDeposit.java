package programming_exercises_c4.deposito;

import java.util.Scanner;

public class TestCertificateOfDeposit {
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Certificado 1");
		System.out.println("Inserte el apellido\n"
				+ "Saldo\n"
				+ "dia de emision (numero)\n"
				+ "mes de emision (numero)\n");
		
		
		CertificateOfDeposit uno = new CertificateOfDeposit(sc1.nextInt(), 
				sc1.next(), 
				sc1.nextFloat(),
				sc1.nextInt(), sc1.nextInt());
		
		System.out.println("Certificado 2");
		System.out.println("Inserte el apellido\n"
				+ "Saldo\n"
				+ "dia de emision (numero)\n"
				+ "mes de emision (numero)\n");
		
		CertificateOfDeposit dos = new CertificateOfDeposit(sc1.nextInt(), 
				sc1.next(), 
				sc1.nextFloat(),
				sc1.nextInt(), sc1.nextInt());
		
		System.out.println("Certificado 1");
		System.out.println("Certifiado: "+
				uno.getnCertificado()+
				"\n"+
				uno.getApellido()+
				"\n"+
				"Saldo: "+
				uno.getSaldo()+
				"\n"+
				"fecha de emision: "+
				uno.getAux1().getDia()+
				"/"+uno.getAux1().getMes()+
				"/"+2018+"\n"+
				"fecha de vencimiento: "+
				uno.getAux2().getMes()+
				"/"+uno.getAux2().getMes()+
				"/"+2019+"\n");
		
		System.out.println("Certificado 2");
		System.out.println("Certifiado: "+
				dos.getnCertificado()+
				"\n"+
				dos.getApellido()+
				"\n"+
				"Saldo: "+
				dos.getSaldo()+
				"\n"+
				"fecha de emision: "+
				dos.getAux1().getDia()+
				"/"+dos.getAux1().getMes()+
				"/"+2018+"\n"+
				"fecha de vencimiento: "+
				dos.getAux2().getMes()+
				"/"+dos.getAux2().getMes()+
				"/"+2019+"\n");
		
	}

}
