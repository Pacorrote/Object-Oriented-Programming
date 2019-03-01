/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;


public class Life extends Insurance {

    public Life(String Tipo) {
        super(Tipo);
        Setcos();
        setTipos(Tipos);
    }
    
    
    public String toString(){
        return String.format("%.2f\n%s",this.Precio,Tipos);
    }
    @Override
    public void Setcos() {
        this.Precio=36;
    }

    @Override
    public void setTipos(String Tipos) {
        this.Tipos="Life";
    }
    
}
