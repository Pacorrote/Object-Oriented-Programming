package programming_exercises_c4.billing;

public class Billing {

	public Billing() {
		// TODO Auto-generated constructor stub
	}
	public Float computeBill(Float parametro) {
		return (float) (parametro*1.08);
	}
	public Float computeBill(Float parametro1, Float parametro2) {
		return (float) ((parametro1*parametro2)*1.08);
	}
	public Float computeBill(Float parametro1, Float parametro2, Float cupon) {
		return   (float) (((parametro1*parametro2)-cupon)*1.08);
	}
}
