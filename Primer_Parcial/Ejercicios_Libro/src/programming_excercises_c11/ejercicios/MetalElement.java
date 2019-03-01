package programming_excercises_c11.ejercicios;


public class MetalElement extends Element{

    public MetalElement(String name, String symbol, Integer atomic, Float atomicWeigth) {
        super(name, symbol, atomic, atomicWeigth);
    }
    @Override
     public String toString(){
        return String.format("Los metales son buenos conductores de electricidad. %s",this.describeElement());
    }
    @Override
    public String describeElement() {
       return String.format("%s/%s/"+" No. atomico: %d/ Peso atomico: ",this.name,this.symbol,this.atomic,this.atomicWeigth);
    }  
    
}
