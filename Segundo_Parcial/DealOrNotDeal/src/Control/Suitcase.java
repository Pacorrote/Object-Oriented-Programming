package Control;

import javax.swing.*;


public class Suitcase extends JButton {

    private String valor;
    private Integer index;


    public Suitcase(Integer index,String valor){
        super();
        this.index=index;
        this.valor=valor;
    }




    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
}
