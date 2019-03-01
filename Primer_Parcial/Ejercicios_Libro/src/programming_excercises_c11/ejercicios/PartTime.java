package programming_excercises_c11.ejercicios;


public class PartTime extends Student{

    public PartTime(String name, Boolean status) {
        super(name,status);
    }

    @Override
    public String id() {
        return String.format("Estado de medio tiempo: %s",this.status);
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
        return String.format("El estudiante %s paga una tarifa de $2000 %s",this.name,id());
    }
    
}
