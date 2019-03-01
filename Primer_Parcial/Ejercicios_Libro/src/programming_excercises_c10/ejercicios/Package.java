package programming_excercises_c10.ejercicios;

public class Package {
	private Integer pesoOnzas;
	private Character medio;
	private Float precio;
	public Package(Integer pesos, Character medio) {
		// TODO Auto-generated constructor stub
		this.pesoOnzas=pesos;
		this.medio=medio;
		this.precio = calculaCosto();
	}
	public Float calculaCosto() {
		switch(medio) {
		case 'A':
			return (float) (this.pesoOnzas<9 && this.pesoOnzas>0? 2:
				this.pesoOnzas<17? 3: 4.5);
		case 'T':
			return (float) (this.pesoOnzas<9 && this.pesoOnzas>0? 1.5:
				this.pesoOnzas<17? 2.35: 3.25);
		case 'M':
			return (float) (this.pesoOnzas<9 && this.pesoOnzas>0? .5:
				this.pesoOnzas<17? 1.5: 2.15);
		}
		return (float) 0;
	}
	public String display() {
		return String.format("peso: %d onzas, medio %c y costo: %.2f", 
				this.pesoOnzas, this.medio, this.precio);
	}
}
