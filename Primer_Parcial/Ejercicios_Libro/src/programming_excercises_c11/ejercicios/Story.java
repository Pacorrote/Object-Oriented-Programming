package programming_excercises_c11.ejercicios;

public abstract class Story {
    protected String title;
    protected String author;
    protected Integer pages;
    protected String message;

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
