package programming_excercises_c11.ejercicios;


public class Life extends Insurance {

    public Life(String Tipo) {
        super(Tipo);
        Setcos();
        setTipos(Tipos);
    }
    
    
    public String toString(){
        return String.format("%.2f\n%s",this.Precio,Tipos);
    }
    @Override
    public void Setcos() {
        this.Precio=(double) 36;
    }

    @Override
    public void setTipos(String Tipos) {
        this.Tipos="Life";
    }
    
}
