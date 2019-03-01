package programming_exercises_c3.banco;

public class CuentaBancaria {
	private Integer numeroDeCuenta;
	private String nombreDeLaC;
	private float saldoDeLaC;
	public CuentaBancaria(Integer nc, String nombreC, float saldoCuenta) {
		// TODO Auto-generated constructor stub
		numeroDeCuenta=nc;
		nombreDeLaC=nombreC;
		saldoDeLaC=saldoCuenta;
	}
	public float deductMonthlyFee() {
		return saldoDeLaC-4;
	}
	public float getSaldoDeLaC() {
		deductMonthlyFee();
		return saldoDeLaC;
	}
	public void setSaldoDeLaC(float saldoDeLaC) {
		this.saldoDeLaC += saldoDeLaC;
	}
	
}
