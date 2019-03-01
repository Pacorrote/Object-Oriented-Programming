package programming_exercises_c4.blooddata;

public class Paciente {
	private Integer id;
	private Byte age;
	private BloodData bd;
	
	public Paciente() {
		// TODO Auto-generated constructor stub
		this.id=0;
		this.age=0;
		this.bd=new BloodData();
	}
	public Paciente(Integer id, Byte age, BloodType type, Factor factor) {
		this.id=id;
		this.age=age;
		this.bd=new BloodData(type, factor);
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Byte getAge() {
		return age;
	}
	public void setAge(Byte age) {
		this.age = age;
	}
	public BloodData getBd() {
		return bd;
	}
	public void setBd(BloodData bd) {
		this.bd = bd;
	}
	

}
