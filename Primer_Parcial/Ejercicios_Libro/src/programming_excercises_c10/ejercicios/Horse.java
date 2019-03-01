package programming_excercises_c10.ejercicios;

public class Horse {
	private String name;
	private String color;
	private Integer birthY;
	public Horse(String name, String color, Integer birthy) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.color=color;
		this.birthY=birthy;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getBirthY() {
		return birthY;
	}
	public void setBirthY(Integer birthY) {
		this.birthY = birthY;
	}
	

}
