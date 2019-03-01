/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;


public class DomesticDivision extends Division{
    private String state;
    public DomesticDivision(String name, Integer account, String state) {
        super(name, account);
        this.state=state;       
    }

    @Override
    public void display() {
        System.out.println(" "+name+"/"+" No: "+account+"/"+" "+state);
    }
    
}
