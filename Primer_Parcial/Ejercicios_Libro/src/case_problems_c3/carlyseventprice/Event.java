package case_problems_c3.carlyseventprice;

public class Event {
	public final static Integer PPPERSONA=35;
	public final static Integer LEVENTO=50;
	private String nDeEvento;
	private Integer numIn;
	private Integer precio;
	public Event() {
		// TODO Auto-generated constructor stub
	}
	public void setnDeEvento(String nDeEvento) {
		this.nDeEvento = nDeEvento;
	}
	public void setNumIn(Integer numIn) {
		this.numIn = numIn;
	}
	
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	public String getnDeEvento() {
		return nDeEvento;
	}
	public Integer getNumIn() {
		return numIn;
	}
	public Integer getPrecio() {
		return precio;
	}
	
}
