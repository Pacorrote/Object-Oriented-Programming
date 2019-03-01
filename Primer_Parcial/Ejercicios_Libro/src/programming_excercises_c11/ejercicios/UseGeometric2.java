/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;

import java.util.ArrayList;

public class UseGeometric2 {
    private ArrayList<GeometricFigure2>geo;

    public UseGeometric2() {
        geo=new ArrayList<>();
    }
    public void add(GeometricFigure2 g){
        geo.add(g);
    }
    public void imprimir(){
        for(GeometricFigure2 t: geo){
            System.out.println(t.datos());
        }
    }
    
    
}
