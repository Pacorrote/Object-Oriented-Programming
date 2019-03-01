/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;


public class Fiction extends Book {

    public Fiction(String titulo, Double precio) {
        super(titulo, precio);
        setPrecio();
    }
    @Override
    public void setPrecio() {
        this.precio=24.99;
    }
    @Override
    public String toString(){
        return String.format("El libro %s su precio es %.2f", this.titulo, this.precio);
    }
}
