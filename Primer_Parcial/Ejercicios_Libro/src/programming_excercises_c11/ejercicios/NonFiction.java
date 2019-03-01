package programming_excercises_c11.ejercicios;

public class NonFiction extends Book{

    public NonFiction(String titulo, Double precio) {
        super(titulo, precio);
        setPrecio();
    }

    @Override
    public void setPrecio() {
        this.precio=37.99;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public Double getPrecio() {
        return precio;
    }
    
    @Override
    public String toString(){
        return String.format("El libro "+this.titulo+" su precio es "+this.precio);
    }
}
