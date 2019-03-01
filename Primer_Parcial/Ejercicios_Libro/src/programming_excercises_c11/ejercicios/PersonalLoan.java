/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;


public class PersonalLoan extends Loan{
    
    public PersonalLoan(Integer prestamo, String apellido, Integer monto, Integer plazo) {
        super(prestamo, apellido, monto, plazo);
        this.tasaInteres=0.02f;
    }
    
}
