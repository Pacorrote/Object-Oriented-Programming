package programming_exercises_c4.formletterwriter;

public class FormLetterWriter {

	public FormLetterWriter() {
		// TODO Auto-generated constructor stub
	}
	public String displaySalutation(String apellidos) {
		return String.format("Querid@ sra/sr %s", apellidos);
	}
	public String displaySalutation(String nombre, String apellidos) {
		return String.format("Querid@ %s %s\nGracias por su reciente orden", nombre, apellidos);
	}
}
