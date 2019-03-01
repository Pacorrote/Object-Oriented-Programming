package programming_exercises_c2.conversiones;

public class InchesToFeet {
	private Integer inches;
	public static final Integer FEETTOINCHES = 12;
	public InchesToFeet(Integer numero) {
		// TODO Auto-generated constructor stub
		inches=numero;
	}
	public Integer conversion() {
		return inches/FEETTOINCHES;
	}
}