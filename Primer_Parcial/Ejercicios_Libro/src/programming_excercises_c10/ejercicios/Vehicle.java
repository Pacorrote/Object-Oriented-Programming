package programming_excercises_c10.ejercicios;

public class Vehicle {
	private Integer llantas;
	private Integer MPG;
	public Vehicle(Integer llantas, Integer mPG) {
		this.llantas = llantas;
		MPG = mPG;
	}
	public String toString() {
		return String.format("num. llantas: %d, MPG: %d", this.llantas, this.MPG);
	}

}
