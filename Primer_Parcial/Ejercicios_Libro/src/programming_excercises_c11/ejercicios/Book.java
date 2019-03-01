/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;


public abstract class Book {
    public String title;
    public Double price;

    public Book(String title, Double price) {
        this.title = title;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }
    public abstract void setPrice();
    
}
