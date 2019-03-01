/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;

public class School extends Building {
    private Integer NumAu;
    private String NumG;
    public School(Integer Pies, String Historia,Integer Au,String G) {
        super(Pies, Historia);
        this.NumAu=Au;
        this.NumG=G;
    }

    public String toString(){
        return String.format("M^2:%d\nHistoria:%s\nNumero de Aulas:%d\nGrado:%s",this.getPies(),this.getHistoria(),this.getNumAu(),this.getNumG());
    }
    public Integer getNumAu() {
        return NumAu;
    }

    public void setNumAu(Integer NumAu) {
        this.NumAu = NumAu;
    }

    public String getNumG() {
        return NumG;
    }

    public void setNumG(String NumG) {
        this.NumG = NumG;
    }

    public Integer getPies() {
        return Pies;
    }

    public void setPies(Integer Pies) {
        this.Pies = Pies;
    }

    public String getHistoria() {
        return Historia;
    }

    public void setHistoria(String Historia) {
        this.Historia = Historia;
    }
    
    
}
