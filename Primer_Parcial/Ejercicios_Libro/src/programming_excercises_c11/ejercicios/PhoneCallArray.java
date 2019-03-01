/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;

import java.util.ArrayList;

public class PhoneCallArray {
    private ArrayList<PhoneCall>cel;

    public PhoneCallArray() {
        cel=new ArrayList<>();
    }
    public void add(PhoneCall p){
        cel.add(p);
    }
    public void imprimir(){
        for(PhoneCall t: cel){
            System.out.println(t);
        }
    }
}
