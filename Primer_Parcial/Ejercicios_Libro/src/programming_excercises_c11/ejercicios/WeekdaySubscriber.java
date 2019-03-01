/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;

public class WeekdaySubscriber extends NewspaperSubscriber {

    public WeekdaySubscriber(String Calle) {
        super(Calle);
        setTasa();
    }
    public String toString(){
        return String.format("Calle:%s, Tarifa:%.2f, TipoWeekday",this.getCalle(),this.getTasa());
    }

    @Override
    public void setTasa() {
        this.Tasa=3.5;
    }
    
}
