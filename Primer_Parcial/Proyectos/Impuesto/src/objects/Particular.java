package objects;

public class Particular extends Pasajero{

	public Particular(String placa, String noSerie, String marca, Integer modelo, Float valorFactura,
			Integer noPasajero) {
		super(placa, noSerie, marca, modelo, valorFactura, noPasajero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String informacion() {
		// TODO Auto-generated method stub
		return super.informacion()+String.format("Tenencia: %.2f\n", this.calcularTenencia());
	}

	

}
