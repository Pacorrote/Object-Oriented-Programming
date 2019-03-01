package programming_exercises_c4.gregoriancalendar;

public class NextMonth {
	private Integer dia;
	private Integer mes;
	public NextMonth(Integer dia, Integer mes) {
		// TODO Auto-generated constructor stub
		this.dia=dia;
		this.mes=mes;
	}
	public Boolean Mes31() {
		return this.mes==1 || this.mes==3
				|| this.mes==5 || this.mes==7
				|| this.mes==8 || this.mes==10
				|| this.mes==12;
	}
	public Boolean Mes30() {
		return this.mes==4 || this.mes==6
				|| this.mes==9 || this.mes==11;
	}
	public Integer GregorianCalendar() {
		if (Mes31()) {
			return 31-this.dia;
		}
		else if(Mes30()) {
			return 30-this.dia;
		}
		else {
			return 28-this.dia;
		}
	}
	public Integer getDia() {
		return dia;
	}
	public void setDia(Integer dia) {
		this.dia = dia;
	}
	public Integer getMes() {
		return mes;
	}
	public void setMes(Integer mes) {
		this.mes = mes;
	}
	
}
