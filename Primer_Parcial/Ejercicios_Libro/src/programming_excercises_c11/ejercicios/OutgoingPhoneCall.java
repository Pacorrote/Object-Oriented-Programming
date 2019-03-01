/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;


public class OutgoingPhoneCall extends PhoneCall {

    private Integer Adicional;
    public OutgoingPhoneCall(String NumeroT,Integer adicional) {
        super(NumeroT);
        setPrecio();
        this.Adicional=adicional;
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
        return String.format("Numero:%s  ,  Tarifa:%.2f  ,   Total:%.2f",this.getNumeroT(),this.getPrecio(),this.getPrecio()*Adicional);
    }

    @Override
    public void setPrecio() {
        this.Precio=0.04f;
    }
    
}
