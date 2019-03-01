package programming_excercises_c11.ejercicios;


public class PersonalLoan extends Loan{
    
    public PersonalLoan(Integer prestamo, String apellido, Integer monto, Integer plazo) {
        super(prestamo, apellido, monto, plazo);
        this.tasaInteres=(float) 0.02;
    }
    
}
