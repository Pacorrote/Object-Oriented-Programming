package programming_excercises_c11.ejercicios;

public class Poker extends CardGame{

    public Poker() {
        deal();
    }
    
    @Override
    public String displayDescription() {
        return String.format("Bridge\nEl tipo de carta %s de numero %d\tSe le han repartido %d cartas",
        		this.mazo, this.number, this.repartidas);
    }

    @Override
    public void deal() {
        this.repartidas=5;
    }
    
}
