package programming_exercises_c2.eggs;

public class Eggs {
	private Integer eggs;
	public static final Integer DOCENA =  12;
	public static final float PRECIODOCENA = (float) 3.25; 
	public static final float PRECIOHUEVO = (float) 0.45;
	public Eggs(Integer huevos) {
		// TODO Auto-generated constructor stub
		eggs=huevos;
	}
	private static Integer docena(Eggs aux) {
		return aux.getEggs()/Eggs.DOCENA;
	}
	private static Integer huevosR(Eggs aux) {
		return aux.getEggs()-(Eggs.docena(aux)*Eggs.DOCENA);
	}
	private static float precioDocena(Eggs aux) {
		return (float) Eggs.docena(aux)*Eggs.PRECIODOCENA;
	}
	private static float pUnitario(Eggs aux) {
		return (float) Eggs.huevosR(aux)*Eggs.PRECIOHUEVO;
	}
	public String precioTotal(Eggs huevo) {
		return String.format("Son %d docena/s y %d huevos restantes\n"
				+ " en total seria %.2f", 
				Eggs.docena(huevo), Eggs.huevosR(huevo), Eggs.precioDocena(huevo)+Eggs.pUnitario(huevo));
	}
	public Integer getEggs() {
		return eggs;
	}
	public void setEggs(Integer eggs) {
		this.eggs = eggs;
	}
}
