/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;


public class Novella extends Story{

    public Novella(String title, String author, Integer pages) {
        super(title, author, pages);
        setPages(pages);
    }

    @Override
    public void setPages(Integer pages) {
        this.pages=pages;
        if((pages>50)||(pages<100)){
            this.message="Esta bien la paginacion";
        }else{
            if(pages<50){
                int a=0;
            a=50+pages;
            this.message=String.format("podrian agregarse %d paginas",a);
            }else{
               int a=0;
               a=100-pages;
               this.message=String.format("deben quitarse %d paginas",Math.abs(a)); 
            }
            
        }
    }
    @Override
    public String toString(){
        return String.format(this.getTitle()+" del autor"+this.getAuthor()+" No."+this.getPages()+" "+ this.getMessage());
    }
    
}
