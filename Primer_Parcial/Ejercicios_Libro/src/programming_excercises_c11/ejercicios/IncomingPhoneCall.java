package programming_excercises_c11.ejercicios;


public class IncomingPhoneCall extends PhoneCall {

    public IncomingPhoneCall(String NumeroT) {
        super(NumeroT);
        setPrecio();
    }

    @Override
    public String getNumeroT() {
        return NumeroT;
    }

    @Override
    public double getPrecio() {
        return Precio;
    }

    @Override
    public String toString() {
        return String.format("Numero:%s, Precio:%.2f,  Tarifa:%.2f",this.getNumeroT(),this.getPrecio(),this.getPrecio());
    }

    @Override
    public void setPrecio() {
        this.Precio=0.02;
    }

    
}
