/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;


public class NoMetalElement extends Element{
    public NoMetalElement(String name, String symbol, Integer atomic, Float atomicWeigth) {
        super(name, symbol, atomic, atomicWeigth);
    }
    @Override
    public String toString(){
        return String.format("Los no metales no son buenos conductores de electricidad. %s",this.describeElement());
    }
            
    @Override
    public String describeElement() {
       return String.format(this.name+"/"+this.symbol+"/"+" No. atomico: "+this.atomic+"/"+" Peso atomico: "+this.atomicWeigth);
    }   
}
