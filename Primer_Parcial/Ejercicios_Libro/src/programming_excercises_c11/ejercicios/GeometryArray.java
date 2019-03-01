/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.ejercicios;

import java.util.ArrayList;


public class GeometryArray {
    private ArrayList<GeometricFigure>geo;

    public GeometryArray() {
        geo=new ArrayList<>();
    }
    public void add(GeometricFigure g){
        geo.add(g);
    }
    public void imprimir(){
        for(GeometricFigure t: geo){
            System.out.println(t.datos());
        }
    }
    
    
}
