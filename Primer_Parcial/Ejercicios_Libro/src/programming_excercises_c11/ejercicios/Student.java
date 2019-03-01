package programming_excercises_c11.ejercicios;

public abstract class Student {
    protected String name;
    protected Boolean status;

    public Student(String name,Boolean status) {
        this.name = name;
        this.status=status;
    }
    public abstract void setStatus(Boolean status);
    public abstract String id();
    
}
