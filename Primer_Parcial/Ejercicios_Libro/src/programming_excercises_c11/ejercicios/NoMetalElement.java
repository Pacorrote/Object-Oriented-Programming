package programming_excercises_c11.ejercicios;


public class NoMetalElement extends Element{
    public NoMetalElement(String name, String symbol, Integer atomic, Float atomicWeigth) {
        super(name, symbol, atomic, atomicWeigth);
    }
    @Override
    public String toString(){
        return String.format("Los no metales no son buenos conductores de electricidad. %s",this.describeElement());
    }
            
    @Override
    public String describeElement() {
       return String.format("%s/%s/"+" No. atomico: %d/ Peso atomico: ",this.name,this.symbol,this.atomic,this.atomicWeigth);
    }    
}
