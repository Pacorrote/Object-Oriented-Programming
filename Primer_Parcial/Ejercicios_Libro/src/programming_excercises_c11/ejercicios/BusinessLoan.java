/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;


public class BusinessLoan extends Loan{
    public BusinessLoan(Integer prestamo, String apellido, Integer monto, Integer plazo) {
        super(prestamo, apellido, monto, plazo);
        this.tasaInteres=0.001f;
    }
    
}
