package programming_excercises_c11.ejercicios;


public class FullTime extends Student{

    public FullTime(String name,Boolean status) {
        super(name,status);
        setStatus(status);
    }

    @Override
    public String id() {
        return String.format("Estado de tiempo completo: %s",this.status);
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
