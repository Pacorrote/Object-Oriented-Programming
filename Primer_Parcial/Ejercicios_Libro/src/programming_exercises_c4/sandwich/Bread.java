package programming_exercises_c4.sandwich;

public class Bread {
	private String breadType;
	private Integer cPS;
	public Bread(String breadType, Integer cPP) {
		// TODO Auto-generated constructor stu
		this.breadType=breadType;
		this.cPS=cPP;
	}
	public String getBreadType() {
		return breadType;
	}
	public Integer getcPS() {
		return cPS;
	}
	public final static String MOTTO() {
		return "The staff of life";
	}
	
}
