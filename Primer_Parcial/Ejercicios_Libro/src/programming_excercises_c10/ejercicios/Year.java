package programming_excercises_c10.ejercicios;

public class Year {
	protected Integer days;
	public Year() {
		// TODO Auto-generated constructor stub
		this.days=365;
	}
	public Integer getDays() {
		return days;
	}
	public Integer daysElapsed(Integer mes, Integer dia) {
		int dias=0;
		for (int i = 1; i <mes; i++) {
			if(Mes31(i)) {
				dias+=31;
			}
			else if(Mes30(i)) {
				dias+=30;
			}
			else {
				dias+=28;
			}
		}
		return dias+dia-1;
	}
	private Boolean Mes31(Integer mes) {
		return mes==1 || mes==3
				|| mes==5 || mes==7
				|| mes==8 || mes==10
				|| mes==12;
	}
	private Boolean Mes30(Integer mes) {
		return mes==4 || mes==6
				|| mes==9 || mes==11;
	}
}
