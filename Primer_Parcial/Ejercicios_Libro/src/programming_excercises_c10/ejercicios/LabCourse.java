package programming_excercises_c10.ejercicios;

public class LabCourse extends CollegeCourse{

	public LabCourse(String departamento, Integer curso, Byte creditos) {
		super(departamento, curso, creditos);
		this.costo+=50;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return "El curso es un curso de laboratorio.\n\n"+super.display();
	}
	
	
}
