package programming_excercises_c11.ejercicios;


public class DomesticDivision extends Division{
    private String state;
    public DomesticDivision(String name, Integer account, String state) {
        super(name, account);
        this.state=state;       
    }

    @Override
    public void display() {
        System.out.println(" "+nombre+"/"+" No: "+cuenta+"/"+" "+state);
    }
    
}
