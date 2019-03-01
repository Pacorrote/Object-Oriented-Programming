package game_zone_c3.jcartas;

public class Card {
	//private Character suit;
	private Integer valor;
	public Card() {
		// TODO Auto-generated constructor stub
	}
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	public Boolean isAce() {
		return valor==1;
	}
	
}
