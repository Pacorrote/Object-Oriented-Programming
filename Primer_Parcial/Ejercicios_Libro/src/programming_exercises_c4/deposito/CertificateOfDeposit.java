package programming_exercises_c4.deposito;

import programming_exercises_c4.gregoriancalendar.NextMonth;
import programming_exercises_c4.gregoriancalendar.YearEnd;

public class CertificateOfDeposit {
	private Integer nCertificado;
	private String apellido;
	private Float saldo;
	private NextMonth aux1;
	private NextMonth aux2;
	public CertificateOfDeposit(Integer nCertificado, String apellido, Float saldo, Integer diaFechaEmision,
			Integer mesFechaEmision) {
		this.nCertificado = nCertificado;
		this.apellido = apellido;
		this.saldo = saldo;
		this.aux1 = new NextMonth(diaFechaEmision, mesFechaEmision);
		this.aux2 = new NextMonth(diaFechaEmision, mesFechaEmision);
	}
	
	public Integer getnCertificado() {
		return nCertificado;
	}

	public void setnCertificado(Integer nCertificado) {
		this.nCertificado = nCertificado;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Float getSaldo() {
		return saldo;
	}

	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}

	public NextMonth getAux1() {
		return aux1;
	}

	public NextMonth getAux2() {
		return aux2;
	}	

	
}
