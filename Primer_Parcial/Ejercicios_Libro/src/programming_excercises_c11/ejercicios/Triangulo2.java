package programming_excercises_c11.ejercicios;

public class Triangulo2 extends GeometricFigure2 implements SidedObject{

    public Triangulo2(Integer ancho, Integer alto, String tipo) {
        super(ancho, alto, tipo);
    }

    @Override
    public Double area() {
        return (double)((ancho*alto)/2);
    }
    @Override
    public String datos(){
        return String.format("%s de altura %d de ancho %d tiene un area de: %f contiene una cantidad de lados de %d",this.tipo,this.alto,this.ancho,displaySides());
    }

    @Override
    public Integer displaySides() {
        return 3;
    }
    
}
