package programming_excercises_c11.ejercicios;

public class InternationalDivision extends Division{
    private String pais;
    private String idioma;
    public InternationalDivision(String name, Integer account,String pais, String idioma) {
        super(name, account);
        this.pais=pais;
        this.idioma=idioma;
    }

    @Override
    public void display() {
        System.out.println(" "+nombre+"/"+" No: "+cuenta+"/"+" "+pais+"/"+" "+idioma);
    }
}
