/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;


public abstract  class Insurance {
    public String Tipos;
    public double Precio;

    public Insurance(String Tipo) {
       this.Tipos=Tipo;
    }

    public abstract void Setcos();
    
    public abstract  void setTipos(String Tipos);
}
