package programming_exercises_c4.bird;

public class BirdSighting {
	private String bird_Specie;
	private Integer diaDelAnno;
	public BirdSighting() {
		// TODO Auto-generated constructor stub
		this.bird_Specie="robin";
		this.diaDelAnno=1;
	}
	public BirdSighting(String specie, Integer day) {
		bird_Specie=specie;
		diaDelAnno=day;
	}
	public String getBird_Specie() {
		return bird_Specie;
	}
	public Integer getDiaDelAnno() {
		return diaDelAnno;
	}
	
}
