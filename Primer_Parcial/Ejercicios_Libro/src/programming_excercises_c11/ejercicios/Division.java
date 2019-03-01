/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;


public abstract class Division {
    public String name;
    public Integer account;

    public Division(String name, Integer account) {
        this.name = name;
        this.account = account;
    }    
    public abstract void display();
    
}
