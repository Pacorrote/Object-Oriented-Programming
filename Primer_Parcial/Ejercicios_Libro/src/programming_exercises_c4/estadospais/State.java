package programming_exercises_c4.estadospais;

public class State {
	private String nombre;
	private Integer poblacion;
	private City uno;
	private City dos;
	public State() {
		// TODO Auto-generated constructor stub
		
	}
	public State(String nombre, Integer poblacion , String nombre1, Integer poblacion1,
			String nombre2, Integer poblacion2) {
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.uno = new City(nombre1, poblacion1);
		this.dos = new City(nombre2, poblacion2);
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPoblacion(Integer poblacion) {
		this.poblacion = poblacion;
	}
	public void setUno(City uno) {
		this.uno = uno;
	}
	public void setDos(City dos) {
		this.dos = dos;
	}
	public String informacion() {
		return String.format("%s\nPoblación: %d\n"
				+ "Capital: %s con población: %dºn"
				+ "Ciudad mas poblada: %s con poblacion de: %d", 
				this.nombre, this.poblacion, this.uno.getNombre(),
				this.uno.getPoblacion(), this.dos.getNombre(), this.dos.getPoblacion());
	}

}
