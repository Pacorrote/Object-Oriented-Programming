package objects;

public abstract class Pasajero extends Vehiculo{
	private Integer noPasajeros;
	
	public Pasajero() {
		// TODO Auto-generated constructor stub
	}

	public Pasajero(String placa, String noSerie, String marca, Integer modelo, Float valorFactura, Integer noPasajero) {
		super(placa, noSerie, marca, modelo, valorFactura);
		this.noPasajeros=noPasajero;
		// TODO Auto-generated constructor stub
	}

	public Integer getNoPasajeros() {
		return noPasajeros;
	}

	public void setNoPasajeros(Integer noPasajeros) {
		this.noPasajeros = noPasajeros;
	}

	@Override
	public Float calcularTenencia() {
		// TODO Auto-generated method stub
		return (float) (this.getValorFactura() * calcularBaseGravable());
	}

	@Override
	public String informacion() {
		// TODO Auto-generated method stub
		return super.informacion()+String.format("Numero de pasajeros: %d\n"
				, this.noPasajeros);
	}
	
	

}
