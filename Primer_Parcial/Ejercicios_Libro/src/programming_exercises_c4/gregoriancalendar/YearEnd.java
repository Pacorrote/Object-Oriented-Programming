package programming_exercises_c4.gregoriancalendar;

public class YearEnd {
	public static final Integer DIASANNO=365;	
	public YearEnd() {

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
	public Integer diasRestAnno(Integer mes, Integer dia) {
		return -(daysElapsed(mes, dia)-DIASANNO);
	}

}
