/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;

public class NonFiction extends Book{

    public NonFiction(String title, Double price) {
        super(title, price);
        setPrice();
    }

    @Override
    public void setPrice() {
        this.price=37.99;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public Double getPrice() {
        return price;
    }
    
    @Override
    public String toString(){
        return String.format("El libro "+this.title+" su precio es "+this.price);
    }
}
