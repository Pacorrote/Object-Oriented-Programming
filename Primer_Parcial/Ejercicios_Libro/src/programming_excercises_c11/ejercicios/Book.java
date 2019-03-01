package programming_excercises_c11.ejercicios;


public abstract class Book {
    public String titulo;
    public Double precio;

    public Book(String titulo, Double precio) {
        this.titulo = titulo;
        this.precio = precio;
    }

    public String getTitulo() {
		return titulo;
	}

	public Double getPrecio() {
		return precio;
	}


    public abstract void setPrecio();
    
}
