package programming_excercises_c10.ejercicios;

public class TennisGame {
	private String nombre1;
	private String nombre2;
	private Integer score1;
	private Integer score2;
	private String cadenaScore1;
	private String cadenaScore2;
	public TennisGame() {
		// TODO Auto-generated constructor stub
	}
	public String getNombre1() {
		return nombre1;
	}
	public String getNombre2() {
		return nombre2;
	}
	public Integer getScore1() {
		return score1;
	}
	public Integer getScore2() {
		return score2;
	}
	public String getCadenaScore1() {
		return cadenaScore1;
	}
	public String getCadenaScore2() {
		return cadenaScore2;
	}
	public void setNombres(String nombre1, String nombre2) {
		this.nombre1 = nombre1;
		this.nombre2 = nombre2;
	}
	public void setScores(Integer score1, Integer score2) {
		if(score1<5 && score1>=0 && score2<5 && score2>=0) {
			if(score1!=4 || score2!=4) {
				this.score1=score1;
				this.score2=score2;
				this.cadenaScore1=setCadenaScore(score1);
				this.cadenaScore2=setCadenaScore(score2);
			}
			else {
				this.score1=0;
				this.score2=0;
				this.cadenaScore1="error";
				this.cadenaScore2="error";
			}
		}
		else {
			this.score1=0;
			this.score2=0;
			this.cadenaScore1="error";
			this.cadenaScore2="error";
		}
	}
	private String setCadenaScore(Integer score) {
		switch (score) {
		case 0:
			return "love";
		case 1:
			return "15";
		case 2:
			return "30";
		case 3:
			return "40";
		case 4:
			return "Game";
		}
		return null;
	}
	
}
