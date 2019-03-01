package objects;

public class Taxi extends Pasajero {
	
	private Integer annosDeConcesion;

	public Taxi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Taxi(String placa, String noSerie, String marca, Integer modelo, Float valorFactura, Integer noPasajero, Integer annosDeConcesion) {
		super(placa, noSerie, marca, modelo, valorFactura, noPasajero);
		this.annosDeConcesion=annosDeConcesion;
		// TODO Auto-generated constructor stub
	}

	public Integer getAnnosDeConcesion() {
		return annosDeConcesion;
	}

	public void setAnnosDeConcesion(Integer annosDeConcesion) {
		this.annosDeConcesion = annosDeConcesion;
	}

	@Override
	public Float calcularTenencia() {
		// TODO Auto-generated method stub
		return super.calcularTenencia()+(1+(getNoPasajeros()/10));
	}

	@Override
	public String informacion() {
		// TODO Auto-generated method stub
		return super.informacion()+String.format("Años de concesion: %d\nTenencia: %.2f\n", this.annosDeConcesion,
				this.calcularTenencia());
	}
	
	
	

}
