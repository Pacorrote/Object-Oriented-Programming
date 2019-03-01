package programming_excercises_c10.ejercicios;

public class ScentedCandle extends Candle{
	private String nombreAroma;
	public static final Integer PRECIOAROMA = 3;
	public ScentedCandle() {
		// TODO Auto-generated constructor stub
	}
	public ScentedCandle(String nombreAroma) {
		// TODO Auto-generated constructor stub
		this.nombreAroma=nombreAroma;
	}
	public String getNombreAroma() {
		return nombreAroma;
	}
	public void setNombreAroma(String nombreAroma) {
		this.nombreAroma = nombreAroma;
	}
	public void setHeight(Float height) {
		this.height=height;
		this.price=(int) (this.getHeight()*PRECIOAROMA);
	}
}
