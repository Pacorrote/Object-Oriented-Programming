package programming_excercises_c10.ejercicios;

public class CollegeEmployee extends Person{
	private Integer ss;
	private Number annualSalary;
	private String departamento;
	public CollegeEmployee() {
		
	}
	public void setSs(Integer ss) {
		this.ss = ss;
	}
	public void setAnnualSalary(Number annualSalary) {
		this.annualSalary = annualSalary;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	@Override
	public String informacion() {
		// TODO Auto-generated method stub
		return super.informacion()+String.format("%d\n%.2f\n%s\n", this.ss, this.annualSalary,
				this.departamento);
	}
	
}
