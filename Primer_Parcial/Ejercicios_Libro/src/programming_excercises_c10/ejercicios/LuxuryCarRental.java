package programming_excercises_c10.ejercicios;

public class LuxuryCarRental extends CarRental {
	public static final Float RENTA = (float) 79.99;
	public static final Integer CHOFER = 200;
	private String chofer = null;
	private Float costo;
	public LuxuryCarRental(String nombre, Integer zip_Code, SizeCar tamanno, Integer diasRent
			, String chofer) {
		super(nombre, zip_Code, tamanno, diasRent);
		this.chofer=chofer;
		// TODO Auto-generated constructor stub
	}
	public LuxuryCarRental(String nombre, Integer zip_Code, SizeCar tamanno, Integer diasRent) {
		super(nombre, zip_Code, tamanno, diasRent);
		// TODO Auto-generated constructor stub
	}
	private void setCosto() {
		if(this.chofer!=null) {
			this.costo=(RENTA+CHOFER)*this.diasRent;
		}
		else {
			this.costo=RENTA*this.diasRent;
		}
	}
	@Override
	public String display() {
		// TODO Auto-generated method stub
		setCosto();
		return String.format("%s zip code: %d tamaño: %s dias rentados: %d\n"
				+ "renta diaria: %.2f nombre del chofer: %s y costo total: %.2f", this.nombre, this.zip_Code,
				this.tamanno, this.diasRent, this.chofer!=null? (RENTA+CHOFER): RENTA, this.chofer,this.costo);
	}
	

}
