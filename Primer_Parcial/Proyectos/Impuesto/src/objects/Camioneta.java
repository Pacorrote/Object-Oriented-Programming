package objects;

public class Camioneta extends Carga{

	

	public Camioneta(String placa, String noSerie, String marca, Integer modelo, Float valorFactura, Integer toneladas,
			Boolean publico) {
		super(placa, noSerie, marca, modelo, valorFactura, toneladas, publico);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String informacion() {
		// TODO Auto-generated method stub
		return super.informacion()+String.format("Tenencia: %.2f\n", this.calcularTenencia());
	}
	
}
