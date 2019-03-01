/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;


public class PartTime extends Student{

    public PartTime(String name, Boolean status) {
        super(name,status);
    }

    @Override
    public String id() {
        return String.format("Estado de medio tiempo: "+this.status);
    }

    @Override
    public void setStatus(Boolean status) {
        if(status==true){
        this.status=true;
        }else{
            this.status=false;
        }
    }
    @Override
    public String toString(){
        return String.format("El estudiante "+this.name+" paga una tarifa de $200 "+id());
    }
    
}
