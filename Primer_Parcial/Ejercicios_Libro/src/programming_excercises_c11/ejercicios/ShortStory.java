package programming_excercises_c11.ejercicios;

public class ShortStory extends Story{

    public ShortStory(String title, String author, Integer pages) {
        super(title, author, pages);
        setPages(pages);
    }

    @Override
    public void setPages(Integer pages) {
        this.pages=pages;
        if(pages<50){
            this.message="Esta bien la paginacion";
        }else{
            int a=0;
            a=50-pages;
            this.message=String.format("deben quitarse %d paginas",Math.abs(a));
        }
    }
    @Override
    public String toString(){
        return String.format("%s del autor %s No.%d %s",this.getTitle(),
        		this.getAuthor(),
        		this.getPages(),
        		this.getMessage(),this.getMessage());
    }
}
