package programming_exercises_c4.estadospais;

public class City {
	private String nombre;
	private Integer poblacion;
	public City(String nombre, Integer poblacion) {
		this.nombre = nombre;
		this.poblacion = poblacion;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPoblacion(Integer poblacion) {
		this.poblacion = poblacion;
	}
	public String getNombre() {
		return nombre;
	}
	public Integer getPoblacion() {
		return poblacion;
	}
	
	
}
