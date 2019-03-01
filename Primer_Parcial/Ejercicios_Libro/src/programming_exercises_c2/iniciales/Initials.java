package programming_exercises_c2.iniciales;

public class Initials {
	private Character c1;
	private Character c2;
	private Character c3;
	public Initials(Character c1, Character c2, Character c3) {
		// TODO Auto-generated constructor stub
		this.c1=c1;
		this.c2=c2;
		this.c3=c3;
	}
	public String imprimir() {
		return String.format("%c\n%c\n%c\n", this.c1, this.c2, this.c3);
	}
}
