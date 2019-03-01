package programming_excercises_c10.ejercicios;

public class CarRental {
	protected String nombre;
	protected Integer zip_Code;
	protected SizeCar tamanno;
	private Float rDiaria;
	protected Integer diasRent;
	
	public CarRental(String nombre, Integer zip_Code, SizeCar tamanno, Integer diasRent) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
		this.zip_Code=zip_Code;
		this.tamanno=tamanno;
		setRDiaria();
		this.diasRent=diasRent;
	}
	
	private void setRDiaria() {
		if(this.tamanno==SizeCar.chico || this.tamanno==SizeCar.Chico || this.tamanno==SizeCar.CHICO) {
			this.rDiaria=(float) 29.99;
		}
		else if(this.tamanno==SizeCar.mediano || this.tamanno==SizeCar.Mediano || this.tamanno==SizeCar.MEDIANO) {
			this.rDiaria=(float) 38.99;
		}
		else if(this.tamanno==SizeCar.grande || this.tamanno==SizeCar.Grande || this.tamanno==SizeCar.GRANDE) {
			this.rDiaria=(float) 43.5;
		}
	}
	
	public String display() {
		setRDiaria();
		return String.format("%s zip code: %d tamaño: %s dias rentados: %d\n"
				+ "renta diaria: %.2f y costo total: %.2f", this.nombre, this.zip_Code,
				this.tamanno, this.diasRent, this.rDiaria, this.rDiaria*this.diasRent);
	}
	
	

}
