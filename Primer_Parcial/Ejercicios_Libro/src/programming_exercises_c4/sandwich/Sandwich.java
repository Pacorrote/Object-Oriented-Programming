package programming_exercises_c4.sandwich;

public class Sandwich {
	private Bread bread;
	private SandwichFilling relleno;
	public Sandwich(String breadType, Integer cPP, String type, Integer Calorias) {
		// TODO Auto-generated constructor stub
		this.bread= new Bread(breadType, cPP);
		this.relleno= new SandwichFilling(type, Calorias);
	}
	public Bread getBread() {
		return bread;
	}
	public void setBread(Bread bread) {
		this.bread = bread;
	}
	public SandwichFilling getRelleno() {
		return relleno;
	}
	public void setRelleno(SandwichFilling relleno) {
		this.relleno = relleno;
	}
	
}
