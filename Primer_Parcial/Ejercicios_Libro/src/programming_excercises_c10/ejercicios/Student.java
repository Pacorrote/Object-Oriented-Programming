package programming_excercises_c10.ejercicios;

public class Student extends Person{
	private Float promedio;
	private String carrera;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Float getPromedio() {
		return promedio;
	}
	public void setPromedio(Float promedio) {
		this.promedio = promedio;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	@Override
	public String informacion() {
		// TODO Auto-generated method stub
		return super.informacion()+String.format("%.2f\n%s\n", this.promedio, this.carrera);
	}
	
}
