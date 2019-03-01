/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;

import java.util.ArrayList;


public class CreateLoans {
    private ArrayList<Loan>prestamos;

    public CreateLoans() {
        prestamos=new ArrayList<>();
    }
    public void add(Loan e){
        prestamos.add(e);
    }
    public void imprimir(){
        for(Loan t: prestamos){
            System.out.println(t);
        }
    }
    
}
