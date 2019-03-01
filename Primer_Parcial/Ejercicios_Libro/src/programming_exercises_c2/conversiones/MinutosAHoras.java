package programming_exercises_c2.conversiones;

public class MinutosAHoras {
	private Integer minutos;
	private Integer restanteMin;
	public static final Integer HORAMINUTO=60;
	public MinutosAHoras(Integer minutos) {
		// TODO Auto-generated constructor stub
		this.minutos=minutos;
	}
	public Integer minutosAHoras() {
		return minutos/HORAMINUTO;
	}
	public void restante() {
		this.restanteMin=minutos-minutosAHoras()*HORAMINUTO;
	}
	public Integer getMinutos() {
		return minutos;
	}
	public void setMinutos(Integer minutos) {
		this.minutos = minutos;
	}
	public Integer getRestanteMin() {
		restante();
		return restanteMin;
	}
}
