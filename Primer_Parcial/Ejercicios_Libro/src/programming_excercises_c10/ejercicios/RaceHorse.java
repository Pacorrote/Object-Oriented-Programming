package programming_excercises_c10.ejercicios;

public class RaceHorse extends Horse{
	private Integer numVeces;
	public RaceHorse(String nombre, String color, Integer birthY, Integer numVeces) {
		// TODO Auto-generated constructor stub
		super(nombre, color, birthY);
		this.numVeces=numVeces;
	}
	public Integer getNumVeces() {
		return numVeces;
	}
	public void setNumVeces(Integer numVeces) {
		this.numVeces = numVeces;
	}
	

}
