/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;


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
        this.Precio=196;
    }

    @Override
    public void setTipos(String Tipos) {
        this.Tipos="Health";
    }
    
}
