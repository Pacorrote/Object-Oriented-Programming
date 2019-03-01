package programming_excercises_c10.ejercicios;

public class DoublesTennisGame extends TennisGame{
	private String nombre11;
	private String nombre12;
	private String nombre21;
	private String nombre22;
	public DoublesTennisGame() {
		// TODO Auto-generated constructor stub
	}
	public void setNombres(String nombre1, String nombre2, String nombre3, String nombre4) {
		this.nombre11 = nombre1;
		this.nombre12 = nombre2;
		this.nombre21 = nombre3;
		this.nombre22 = nombre4;
	}
	public String getNombre11() {
		return nombre11;
	}
	public String getNombre12() {
		return nombre12;
	}
	public String getNombre21() {
		return nombre21;
	}
	public String getNombre22() {
		return nombre22;
	}
	
}
