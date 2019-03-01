package objects;

public abstract class Carga extends Vehiculo {

	private Integer toneladas;
	private Boolean publico;

	public Carga(String placa, String noSerie, String marca, Integer modelo, Float valorFactura, Integer toneladas, Boolean publico) {
		super(placa, noSerie, marca, modelo, valorFactura);
		this.toneladas=toneladas;
		this.publico=publico;
		// TODO Auto-generated constructor stub
	}

	public Integer getToneladas() {
		return toneladas;
	}

	public void setToneladas(Integer toneladas) {
		this.toneladas = toneladas;
	}

	public Boolean getPublico() {
		return publico;
	}

	public void setPublico(Boolean publico) {
		this.publico = publico;
	}

	@Override
	public Double calcularBaseGravable() {
		// TODO Auto-generated method stub
		if (!this.publico) {
			return super.calcularBaseGravable();
		}
		else {
			return this.getModelo()>=2009? 0.03: 0.01;
		}
	}

	@Override
	public Float calcularTenencia() {
		// TODO Auto-generated method stub
		return (float) (this.getValorFactura()*(1+this.toneladas/10)+calcularBaseGravable());
	}

	@Override
	public String informacion() {
		// TODO Auto-generated method stub
		return super.informacion()+String.format("Toneladas: %d\nPublico: %s\n", this.toneladas, this.publico);
	}
	
	
	
}
