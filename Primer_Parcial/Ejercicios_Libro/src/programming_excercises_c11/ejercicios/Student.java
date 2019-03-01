/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;

public abstract class Student {
    public String name;
    public Boolean status;

    public Student(String name,Boolean status) {
        this.name = name;
        this.status=status;
    }
    public abstract void setStatus(Boolean status);
    public abstract String id();
    
}
