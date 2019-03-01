/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;


public class Bridge extends CardGame{

    public Bridge() {
        deal();
    }
    
    @Override
    public String displayDescription() {
        return String.format("Bridge\nEl tipo de carta %s de numero %d\tSe le han repartido %d cartas",
        		this.mazo, this.number, this.repartidas);
    }
    @Override
    public void deal() {
        this.repartidas=13;
    }
    
}
