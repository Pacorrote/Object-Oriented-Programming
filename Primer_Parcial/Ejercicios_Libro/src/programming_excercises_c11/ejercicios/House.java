/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;


public class House extends Building {
    private Integer NumA;
    private Integer NumB;
    public House(Integer Pies, String Historia,Integer A,Integer B) {
        super(Pies, Historia);
        this.NumA=A;
        this.NumB=B;
    }

    public String toString(){
        return String.format("M^2:%d\nHistoria:%s\nNumero de habitaciones:%d\nBaños:%s",this.getPies(),this.getHistoria(),this.getNumA(),this.getNumB());
    }
    public Integer getNumA() {
        return NumA;
    }

    public void setNumA(Integer NumA) {
        this.NumA = NumA;
    }

    public Integer getNumB() {
        return NumB;
    }

    public void setNumB(Integer NumB) {
        this.NumB = NumB;
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
