/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;

public class Ford extends Auto {

    public Ford(String Marca, Integer Precio) {
        super(Marca, Precio);
        setPrecio(Precio);
    }


    @Override
    public Integer setPrecio(Integer Precio) {
        return this.Precio=Precio;
    }

    public String toString(){
        return String.format("Marca:%s\nPracio:%d",this.Marca,this.Precio);
    }
    
}
