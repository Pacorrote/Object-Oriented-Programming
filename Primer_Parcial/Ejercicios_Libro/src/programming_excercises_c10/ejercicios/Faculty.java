package programming_excercises_c10.ejercicios;

public class Faculty extends CollegeEmployee{
	private Boolean titular;
	
	public Faculty() {
		// TODO Auto-generated constructor stub
	}

	public Boolean getTitular() {
		return titular;
	}

	public void setTitular(Boolean titular) {
		this.titular = titular;
	}

	@Override
	public String informacion() {
		// TODO Auto-generated method stub
		return super.informacion()+String.format("%s\n", this.titular);
	}
	
	
	
}
