package programming_exercises_c4.figuras;

public class Circle {
	private Integer radio;
	private Integer diametro;
	private Float area;
	public Circle() {
		// TODO Auto-generated constructor stub
		this.radio=1;
		this.diametro=2*this.radio;
		this.area=(float) (Math.PI*Math.pow(this.radio, 2));
	}
	public Integer getRadio() {
		return radio;
	}
	public Integer getDiametro() {
		return diametro;
	}
	public Float getArea() {
		return area;
	}
	public void setRadio(Integer radio) {
		this.radio= radio;
		this.diametro= this.radio*2;
		this.area= (float) (Math.PI*Math.pow(this.radio, 2));
	}
	

}
