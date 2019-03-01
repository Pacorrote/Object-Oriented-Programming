package programming_excercises_c11.ejercicios;


public abstract class GeometricFigure {
    protected Integer ancho;
    protected Integer alto;
    protected String tipo;

    public GeometricFigure(Integer ancho, Integer alto, String tipo) {
        this.ancho = ancho;
        this.alto = alto;
        this.tipo = tipo;
    }
    public abstract Double area();
    public abstract String datos();
}

