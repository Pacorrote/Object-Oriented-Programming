package programming_excercises_c10.ejercicios;

public class Candle {
	private String color;
	protected Float height;
	protected Integer price;
	public static final Integer PRECIO = 2;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Float getHeight() {
		return height;
	}
	public void setHeight(Float height) {
		this.height = height;
		this.price = (int) (height*PRECIO);
	}

	public Integer getPrice() {
		return price;
	}
	
	public Candle() {
		// TODO Auto-generated constructor stub
	}

}
