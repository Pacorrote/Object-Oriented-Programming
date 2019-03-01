package programming_excercises_c10.ejercicios;

public class CollegeCourse {
	private String departamento;
	private Integer curso;
	private Byte creditos;
	protected Integer costo;
	public static final Integer CREDITOPHORA = 120;
	public CollegeCourse(String departamento, Integer curso, Byte creditos) {
		this.departamento = departamento;
		this.curso = curso;
		this.creditos = creditos;
		this.costo=creditos*CREDITOPHORA;
	}
	public String display() {
		return String.format("Departamento %s\n"
				+ "Curso %d\n"
				+ "Creditos %d\n"
				+ "Costo: %d", this.departamento, this.curso, this.creditos, this.costo);
	}

}
