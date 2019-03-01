/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;


public abstract class Alien {
    protected Integer ojos;
    protected String viscosidad;
    protected Integer dedos;

    public Alien(Integer ojos, String viscosidad, Integer dedos) {
        this.ojos = ojos;
        this.viscosidad = viscosidad;
        this.dedos = dedos;
    }
    @Override
    public String toString(){
        return String.format("El alien tiene %d ojos, es de %s viscosidad, y tiene %d dedos",this.ojos,this.viscosidad,this.dedos);
    }
}
