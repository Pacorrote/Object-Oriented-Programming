/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;

public class Novel extends Story{
    public Novel(String title, String author, Integer pages) {
        super(title, author, pages);
        setPages(pages);
    }
    @Override
    public void setPages(Integer pages) {
        this.pages=pages;
        if(pages>100){
            this.message="Esta bien la paginacion";
        }else{
            int a=0;
            a=100-pages;
            this.message=String.format("deben agregarse %d paginas",a);
        }
    }
    @Override
    public String toString(){
        return String.format(this.getTitle()+" del autor"+this.getAuthor()+" No."+this.getPages()+" "+ this.getMessage());
    }
}
