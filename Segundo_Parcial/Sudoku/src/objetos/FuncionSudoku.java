/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import files.Modo;
import files.exception.ModoAperturaIncorrectoException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor
 */
public class FuncionSudoku {
    public int[][] matriz;
    private ArrayList<Character>lista;
    private ArrayList<Integer>lista2;
    public FuncionSudoku() throws IOException, FileNotFoundException, ModoAperturaIncorrectoException{
        matriz = new int[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                matriz[i][j]=0;
            }
        }
        cargar_juego();
    }
    public void cargar_juego() throws IOException, FileNotFoundException, ModoAperturaIncorrectoException {
        lista = new ArrayList<>();
        lista2 = new ArrayList<>();
        TextFile text05 = new TextFile("nuevo.txt", Modo.READ);
        Character ch = text05.readChar();
        while(ch != null){
            //System.out.println(ch);
            lista.add(ch);
            lista2.add(Integer.parseInt(ch.toString()));
            ch = text05.readChar();
            
        }
        text05.close();
        this.matriz[0][0] = lista2.get(0);
        this.matriz[0][2] = lista2.get(1);
        this.matriz[0][5] = lista2.get(2);
        this.matriz[0][6] = lista2.get(3);
        this.matriz[0][7] = lista2.get(4);
        this.matriz[1][8] = lista2.get(5);
        this.matriz[2][1] = lista2.get(6);
        this.matriz[2][2] = lista2.get(7);
        this.matriz[2][4] = lista2.get(8);
        this.matriz[2][6] = lista2.get(9);
        this.matriz[3][3] = lista2.get(10);
        this.matriz[3][5] = lista2.get(11);
        this.matriz[3][6] = lista2.get(12);
        this.matriz[3][7] = lista2.get(13);
        this.matriz[4][1] = lista2.get(14);
        this.matriz[4][2] = lista2.get(15);
        this.matriz[4][6] = lista2.get(16);
        this.matriz[4][7] = lista2.get(17);
        this.matriz[5][1] = lista2.get(18);
        this.matriz[5][2] = lista2.get(19);
        this.matriz[5][3] = lista2.get(20);
        this.matriz[5][5] = lista2.get(21);
        this.matriz[6][2] = lista2.get(22);
        this.matriz[6][4] = lista2.get(23);
        this.matriz[6][6] = lista2.get(24);
        this.matriz[6][7] = lista2.get(25);
        this.matriz[7][0] = lista2.get(26);
        this.matriz[7][4] = lista2.get(27);
        this.matriz[8][1] = lista2.get(28);
        this.matriz[8][2] = lista2.get(29);
        this.matriz[8][3] = lista2.get(30);
        this.matriz[8][7] = lista2.get(31);
    
        //return matriz;
    }
    // METODO PARA COMPROBAR LOS VALORES.
    public boolean comprobar_valor(String valor1) {
        
        if (String.valueOf(valor1).equalsIgnoreCase("")) {
            return false;
        } else {
            int valor = Integer.valueOf(valor1);
            if (valor >0 && valor < 10) {
                return true;
            } else {
                return false;
            }
        }
    }
    //METODO PARA COMPROBAR FILAS.
    public boolean existe_fila(int numero, int fila) {
        boolean resultado = false;
       // int a = matriz[0][2];
        for (int i = 0; i < matriz.length; i++) {
            if (numero == 0) {
                
            } else {
                if (matriz[fila][i] == numero) {
                    resultado = true;
                    break;
                }
            }
        }
        return resultado;
    }
    //METODO PARA COMPROBAR COLUMNAS.
    public boolean existe_columna(int numero, int columna) {
        boolean resultado = false;
        //int a = matriz[7][0];
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][columna] == numero) {
                resultado = true;
                break;
            }
        }
        return resultado;
    }
    public boolean existe_caja(int valor, int fila, int columna) {
        //VARIABLES.
        int minimo_fila;
        int maximo_fila;
        int minimo_columna;
        int maximo_columna;
        boolean resultado = false;
        //DETERMINAMOS LAS FILAS DE LA CAJA.
        if (fila >= 0 && fila < 3) {
            minimo_fila = 0;
            maximo_fila = 2;
        } else if (fila >= 3 && fila < 6) {
            minimo_fila = 3;
            maximo_fila = 5;
        } else {
            minimo_fila = 6;
            maximo_fila = 8;
        }
        //DETERMINAMOS LAS COLUMNAS DE LA CAJA.
        if (columna >= 0 && columna < 3) {
            minimo_columna = 0;
            maximo_columna = 2;
        } else if (columna >= 3 && columna < 6) {
            minimo_columna = 3;
            maximo_columna = 5;
        } else {
            minimo_columna = 6;
            maximo_columna = 8;
        }
        //RECORREMOS EL RANGO DE LA CAJA, Y BUSCAMOS EL VALOR.
        for (int f = minimo_fila; f <= maximo_fila; f++) {
            for (int c = minimo_columna; c <= maximo_columna; c++) {
                if (valor == 0) {
                }else{
                    if(matriz[f][c] == valor) {
                        resultado = true;
                        break;
                    }
                }
            }
        }
        //REGRESAMOS EL VALOR BOOLEANO.
        return resultado;
    }
    //METODO QUE DETECTA SI EL JUEGO FUE TERMINADO.
	public  void terminado(){
            int cont=0;
		//boolean resultado = true;

		for ( int f = 0; f < this.matriz.length; f ++){
			for ( int c = 0; c < this.matriz[0].length; c ++){
				if ( this.matriz[f][c] == 0 ){
                                    cont++;
					//resultado = false;
                                }
                        }
                }
                if(cont==0){
                    JOptionPane.showMessageDialog(null, "terminado");
                }
                //return resultado;
	}
}