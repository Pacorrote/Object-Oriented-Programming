package objects;

public abstract class Vehiculo {
	private String placa;
	private String noSerie;
	private String marca;
	private Integer modelo;
	private Float valorFactura;
	
	public Vehiculo() {
		// TODO Auto-generated constructor stub
	}
	public Vehiculo(String placa, String noSerie, String marca, Integer modelo, Float valorFactura) {
		this.placa = placa;
		this.noSerie = noSerie;
		this.marca = marca;
		this.modelo = modelo;
		this.setValorFactura(valorFactura);
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getNoSerie() {
		return noSerie;
	}
	public void setNoSerie(String noSerie) {
		this.noSerie = noSerie;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getModelo() {
		return modelo;
	}
	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}
	
	public abstract Float calcularTenencia();
	
	public Double calcularBaseGravable() {
		return this.modelo>=2009? 0.05 : 0.02;
	}
	public Float getValorFactura() {
		return valorFactura;
	}
	public void setValorFactura(Float valorFactura) {
		this.valorFactura = valorFactura;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Vehiculo) {
			Vehiculo v = (Vehiculo)obj;
			return this.getPlaca() == v.getPlaca() && this.getNoSerie() == v.getNoSerie();
		}
		return false;
	}
	public String informacion() {
		return String.format("Placa: %s\n no de serie: %s\n%s\n%d\nFactura: %.2f\n", this.placa,
				this.noSerie, this.marca, this.modelo, this.valorFactura);
	}
}
