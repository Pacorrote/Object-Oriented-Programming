package objetosmath;

public class Monomio {
	private Integer coeficiente;
	private Integer exponente;
	public static final Character VARIABLE='x';
	public Monomio(Integer coeficiente, Integer exponente) {
		// TODO Auto-generated constructor stub
		this.coeficiente=coeficiente;
		this.exponente=exponente;
	}
	public Integer getCoeficiente() {
		return coeficiente;
	}
	public Integer getExponente() {
		return exponente;
	}
	public static Character getVariable() {
		return VARIABLE;
	}
	public void setCoeficiente(Integer coeficiente) {
		this.coeficiente = coeficiente;
	}
	public void setExponente(Integer exponente) {
		this.exponente = exponente;
	}
	public String imprimirMonomio() {
		return getCoeficiente()>0? String.format("+%d%c^%d", this.coeficiente, VARIABLE, this.exponente):
			String.format("%d%c^%d", this.coeficiente, VARIABLE, this.exponente);
	}

}
