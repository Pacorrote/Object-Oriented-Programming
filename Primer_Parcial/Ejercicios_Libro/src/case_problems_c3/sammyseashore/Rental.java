package case_problems_c3.sammyseashore;

public class Rental {
	public static final Integer HORA  = 60;
	public static final Integer PRECIOPHORA = 40;
	private String contrato;
	private Integer horas;
	private Integer restante;
	private Integer precio;
	
	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	public void setHoras(Integer minutos) {
		this.horas = minutos/HORA;
		this.restante=minutos%HORA;
	}
	
	public String getContrato() {
		return contrato;
	}

	public Integer getHoras() {
		return horas;
	}

	public Integer getRestante() {
		return restante;
	}

	public Integer getPrecio() {
		return precio=this.horas*PRECIOPHORA+this.restante;
	}

	public Rental() {
		// TODO Auto-generated constructor stub
	}
	
}
