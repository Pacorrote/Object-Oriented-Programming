/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;


public abstract class Element {
    public String name;
    public String symbol;
    public Integer atomic;
    public Float atomicWeigth;

    public Element(String name, String symbol, Integer atomic, Float atomicWeigth) {
        this.name = name;
        this.symbol = symbol;
        this.atomic = atomic;
        this.atomicWeigth = atomicWeigth;
    }
    public abstract String describeElement();
    
}
