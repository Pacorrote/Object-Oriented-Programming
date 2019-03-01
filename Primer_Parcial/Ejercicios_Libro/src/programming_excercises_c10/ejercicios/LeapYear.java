package programming_excercises_c10.ejercicios;

public class LeapYear extends Year {

	public LeapYear() {
		// TODO Auto-generated constructor stub
		days=366;
	}

	@Override
	public Integer daysElapsed(Integer mes, Integer dia) {
		// TODO Auto-generated method stub
		return super.daysElapsed(mes, dia)+1;
	}
	
}
