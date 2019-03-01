/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;

import java.util.ArrayList;

public class ElementsArray {
    private ArrayList<Element>elemento;

    public ElementsArray() {
        elemento=new ArrayList<>();
    }
    public void add(Element a){
        elemento.add(a);
    }
    public void imprimir(){
        for(Element b:elemento){
            System.out.print(b.toString());
            System.out.println(b.describeElement());
        }
    }
    
}
