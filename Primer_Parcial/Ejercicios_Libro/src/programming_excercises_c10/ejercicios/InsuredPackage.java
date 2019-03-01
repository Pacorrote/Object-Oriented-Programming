package programming_excercises_c10.ejercicios;

public class InsuredPackage extends Package{

	public InsuredPackage(Integer pesos, Character medio) {
		super(pesos, medio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Float calculaCosto() {
		// TODO Auto-generated method stub
		return (float) (super.calculaCosto()+
				(super.calculaCosto()<1.01? 2.45:
					super.calculaCosto()<3? 3.95: 5.55));
	}

	

}
