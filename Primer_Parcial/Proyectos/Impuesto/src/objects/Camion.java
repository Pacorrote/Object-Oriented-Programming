package objects;

public class Camion extends Carga{
	private Integer ejes;


	public Camion(String placa, String noSerie, String marca, Integer modelo, Float valorFactura, Integer toneladas,
			Boolean publico, Integer ejes) {
		super(placa, noSerie, marca, modelo, valorFactura, toneladas, publico);
		this.ejes=ejes;
		// TODO Auto-generated constructor stub
	}


	@Override
	public Double calcularBaseGravable() {
		// TODO Auto-generated method stub
		return super.calcularBaseGravable()*(1+(ejes*0.01));
	}


	@Override
	public String informacion() {
		// TODO Auto-generated method stub
		return super.informacion()+String.format("Numero de ejes: %d\nTenencia: %.2f\n", this.ejes, this.calcularTenencia());
	}
	
	
	
}
