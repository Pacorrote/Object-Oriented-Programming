/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;

public abstract class Story {
    public String title;
    public String author;
    public Integer pages;
    public String message;

    public Story(String title, String author, Integer pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPages() {
        return pages;
    }

    public abstract void setPages(Integer pages);

    public String getMessage() {
        return message;
    }

    
}
