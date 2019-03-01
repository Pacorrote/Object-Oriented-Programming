package programming_excercises_c11.ejercicios;


public abstract class Employee {
    protected Integer id;
    protected String apellido;
    protected String nombre;
    protected Float pago;
    protected String titulo;

    public Integer getId() {
        return id;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public Float getPago() {
        return pago;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void setPago(Float pago);

    public abstract void setTitulo(String titulo);
    
}
