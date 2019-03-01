package game_zone_c3.computer_games;

public class MyCharacter {
	private String color;
	private Integer nO;
	private Integer nV;
	public MyCharacter(String color, Integer ojos, Integer vidas) {
		// TODO Auto-generated constructor stub
		this.color=color;
		this.nO=ojos;
		this.nV=vidas;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getnO() {
		return nO;
	}
	public void setnO(Integer nO) {
		this.nO = nO;
	}
	public Integer getnV() {
		return nV;
	}
	public void setnV(Integer nV) {
		this.nV = nV;
	}
	public String descripcion() {
		return String.format("Este personaje es de color %s\n"
				+ "con %d ojo/s y tiene %d vidas", getColor(),getnO(),getnV());
	}
}
