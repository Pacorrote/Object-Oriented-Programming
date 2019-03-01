package programming_excercises_c11.ejercicios;


public abstract class Element {
    protected String name;
    protected String symbol;
    protected Integer atomic;
    protected Float atomicWeigth;

    public Element(String name, String symbol, Integer atomic, Float atomicWeigth) {
        this.name = name;
        this.symbol = symbol;
        this.atomic = atomic;
        this.atomicWeigth = atomicWeigth;
    }
    public abstract String describeElement();
    
}
