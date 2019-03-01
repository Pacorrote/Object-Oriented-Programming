public class Health extends Insurance {

    public Health(String Tipo) {
        super(Tipo);
        Setcos();
        setTipos(Tipos);
    }


    public String toString(){
        return String.format("%.2f\n%s",this.Precio,this.Tipos);
    }
    
    @Override
    public void Setcos() {
        this.Precio=(double) 196;
    }

    @Override
    public void setTipos(String Tipos) {
        this.Tipos="Health";
    }
    
}
