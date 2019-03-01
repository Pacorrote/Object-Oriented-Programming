/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;


public abstract class  Auto {
    public  String Marca;
    public Integer Precio;

    public Auto(String Marca, Integer Precio) {
        this.Marca = Marca;
        this.Precio = Precio;
    }


    public String getMarca() {
        return Marca;
    }
    
    public Integer getPrecio() {
        return Precio;
    }

    public abstract Integer setPrecio(Integer Precio);
    
    
}
