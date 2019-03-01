package programming_excercises_c10.ejercicios;

public class CabinRental {
	private Integer cabins;
	private Double alquilerSemanal;
	public CabinRental(Integer cabins) {
		// TODO Auto-generated constructor stub
		this.cabins=cabins;
		this.alquilerSemanal= (double) (cabins>=1 && cabins<=3? 950: 1100);
	}
	public Integer getCabins() {
		return cabins;
	}
	public Double getAlquilerSemanal() {
		return alquilerSemanal;
	}
	

}
