package programming_excercises_c11.ejercicios;


public class BusinessLoan extends Loan{
    public BusinessLoan(Integer prestamo, String apellido, Integer monto, Integer plazo) {
        super(prestamo, apellido, monto, plazo);
        this.tasaInteres=(float) 0.001;
    }
    
}
