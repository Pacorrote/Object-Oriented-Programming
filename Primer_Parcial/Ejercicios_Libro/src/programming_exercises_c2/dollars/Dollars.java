package programming_exercises_c2.dollars;

public class Dollars {
	private Integer dollars;
	public static final Integer DOLLAR20 = 20;
	public static final Integer DOLLAR10 = 10;
	public static final Integer DOLLAR5 = 5;
	public static final Integer DOLLAR1 = 1;
	public Dollars(Integer cantidad) {
		// TODO Auto-generated constructor stub
		dollars=cantidad;
	}
	private static Integer veinte(Dollars dinero) {
		if(dinero.getDollars()>Dollars.DOLLAR20) {
			return dinero.getDollars()/Dollars.DOLLAR20;
		}
		return 0;
	}
	private static Integer diez(Dollars dinero) {
		int restante = dinero.getDollars()-(Dollars.DOLLAR20*Dollars.veinte(dinero));
		if(restante>Dollars.DOLLAR10) {
			return restante/Dollars.DOLLAR10;
		}
		return 0;
	}
	private static Integer restante(Dollars dinero) {
		int restante = dinero.getDollars()-(Dollars.DOLLAR20*Dollars.veinte(dinero)+
				Dollars.DOLLAR10*Dollars.diez(dinero));
		return restante;
	}
	private static Integer cinco(Dollars dinero) {
		return Dollars.restante(dinero)/Dollars.DOLLAR5;
	}
	private static Integer uno(Dollars dinero) {
		return dinero.getDollars()-(Dollars.DOLLAR20*Dollars.veinte(dinero)+Dollars.DOLLAR10*Dollars.diez(dinero)+
				Dollars.DOLLAR5*Dollars.cinco(dinero));
	}
	public String billet(Dollars dinero) {
		return String.format("%d de 20\n"
				+ "%d de 10\n"
				+ "%d de 5 y \n"
				+ "%d de 1", Dollars.veinte(dinero), Dollars.diez(dinero), Dollars.cinco(dinero), Dollars.uno(dinero));
	}
	public Integer getDollars() {
		return dollars;
	}
	public void setDollars(Integer dollars) {
		this.dollars = dollars;
	}
}
