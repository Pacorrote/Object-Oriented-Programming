package programming_excercises_c11.ejercicios;


public abstract class Division {
    protected String nombre;
    protected Integer cuenta;

    public Division(String nombre, Integer cuenta) {
        this.nombre = nombre;
        this.cuenta = cuenta;
    }    
    public abstract void display();
    
}
