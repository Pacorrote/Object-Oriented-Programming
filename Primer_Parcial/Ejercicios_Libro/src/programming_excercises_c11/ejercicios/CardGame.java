package programming_excercises_c11.ejercicios;

public abstract class CardGame {
    protected Integer repartidas;
    protected String mazo;
    protected Integer number;

    public CardGame() {
        this.mazo="Corazones";
        shuffle();
    }
    public Integer shuffle(){
        return this.number=(int)(Math.random()*13)+1;
    } 
    public abstract String displayDescription();
    public abstract void deal();
}
