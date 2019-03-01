/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;

public abstract class CardGame {
    public Integer repartidas;
    public String mazo;
    public Integer number;

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
