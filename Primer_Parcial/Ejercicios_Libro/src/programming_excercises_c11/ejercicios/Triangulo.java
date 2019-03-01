package programming_excercises_c11.ejercicios;

public class Triangulo extends GeometricFigure{

    public Triangulo(Integer ancho, Integer alto, String tipo) {
        super(ancho, alto, tipo);
    }

    @Override
    public Double area() {
        return (double)((ancho*alto)/2);
    }
    @Override
    public String datos(){
        return String.format("%s de altura %d de ancho %d tiene un area de: %f",this.tipo, this.alto, this.ancho);
    }
}
