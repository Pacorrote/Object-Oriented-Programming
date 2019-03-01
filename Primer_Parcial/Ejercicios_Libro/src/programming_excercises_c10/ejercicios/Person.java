package programming_excercises_c10.ejercicios;

public class Person {
	private String firstName;
	private String lastName;
	private String address;
	private Integer zip_Code;
	private Integer pNumber;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setZip_Code(Integer zip_Code) {
		this.zip_Code = zip_Code;
	}
	public void setpNumber(Integer pNumber) {
		this.pNumber = pNumber;
	}
	public String informacion() {
		return String.format("%s %s\n%s\n%d\n%d\n", this.firstName,
				this.lastName, this.address, this.zip_Code, this.pNumber);
	}
}
