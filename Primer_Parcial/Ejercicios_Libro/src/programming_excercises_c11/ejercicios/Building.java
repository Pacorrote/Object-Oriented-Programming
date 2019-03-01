/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;


public abstract class Building {
    public Integer Pies;
    public String Historia;

    public Building(Integer Pies, String Historia) {
        this.Pies = Pies;
        this.Historia = Historia;
    }

    public Integer getPies() {
        return Pies;
    }

    public void setPies(Integer Pies) {
        this.Pies = Pies;
    }

    public String getHistoria() {
        return Historia;
    }

    public void setHistoria(String Historia) {
        this.Historia = Historia;
    }

    
    
        
}
