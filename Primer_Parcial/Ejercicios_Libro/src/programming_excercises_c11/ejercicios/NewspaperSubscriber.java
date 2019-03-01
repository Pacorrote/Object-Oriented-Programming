/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;

public abstract class NewspaperSubscriber {
    private String Calle;
    public double Tasa;

    public NewspaperSubscriber(String Calle) {
        this.Calle = Calle;
        this.Tasa = 0;
    }

    public boolean equals(NewspaperSubscriber a){
       return this.getCalle()==a.getCalle();
    }
    
    public abstract void setTasa();
    
    public String getCalle() {
        return Calle;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    public double getTasa() {
        return Tasa;
    }
    
}
