package controller;

import java.util.ArrayList;

import objetos.Lista_Doble;
import objetos.Lista_Simple;
import objetos.Nodo;

public class Controller {
	private ArrayList<Character> letra;
	private ArrayList<Character> cola;
	private Lista_Simple<Character> pila;
	public Controller() {
		// TODO Auto-generated constructor stub
		this.letra = new ArrayList<>();
		this.cola = new ArrayList<>();
	}
	public Controller(Character a) {
		this.letra = new ArrayList<>();
		this.letra.add(a);
		this.cola = new ArrayList<>();
	}
	public void nuevaPila() {
		this.pila = new Lista_Simple<>();
	}
	public Character getCharacter(int index) {
		return this.letra.get(index);
	}
	public ArrayList<Character> getLetra() {
		return letra;
	}
	public void setLetra(ArrayList<Character> letra) {
		this.letra = letra;
	}
	public String getStringRepresentation(){    
	    StringBuilder builder = new StringBuilder(letra.size());
	    for(Character ch: letra)
	    {
	        builder.append(ch);
	    }
	    return builder.toString();
	}
	public void eliminarEcuacion() {
		this.letra.clear();
	}
	public void eliminarCaracter() {
		this.letra.remove(this.letra.size()-1);
	}
	public void filtracion() {
		for (Character character : letra) {
			if(character=='^' || character=='/' || character=='*' || character=='-' || character=='+'
					|| character=='(' || character == ')') {
				insertarPila(character);
			}
			else {
				insertarCola(character);
			}
		}
	}
	public void insertarCola(Character c) {
		cola.add(c);
	}
	public void insertarPila(Character c) {
		if(this.pila.isVacia()) {
			this.pila.insertarInicio(c);
		}
		else {
			switch (c) {
			case '^':
				if(this.pila.getInicio().getDato()=='*' || this.pila.getInicio().getDato()=='/' || this.pila.getInicio().getDato()=='+'
						|| this.pila.getInicio().getDato()=='-' || this.pila.getInicio().getDato()=='(') {
					this.pila.insertarInicio(c);
				}
				else {
					char character = removeDatoInicio();
					insertarPila(c);
					this.pila.insertarInicio(character);
				}
				break;
			case '*':
				if(this.pila.getInicio().getDato()=='/' || this.pila.getInicio().getDato()=='+'
						|| this.pila.getInicio().getDato()=='-' || this.pila.getInicio().getDato()=='(') {
					this.pila.insertarInicio(c);
				}
				else {
					char character = removeDatoInicio();
					insertarPila(c);
					this.pila.insertarInicio(character);
				}
				break;
			case '/':
				if(this.pila.getInicio().getDato()=='+' || this.pila.getInicio().getDato()=='-' || this.pila.getInicio().getDato()=='(') {
					this.pila.insertarInicio(c);
				}
				else {
					char character = removeDatoInicio();
					insertarPila(c);
					this.pila.insertarInicio(character);
				}
				break;
			case '+':
				if(this.pila.getInicio().getDato()=='-' || this.pila.getInicio().getDato()=='(') {
					this.pila.insertarInicio(c);
				}
				else {
					char character = removeDatoInicio();
					insertarPila(c);
					this.pila.insertarInicio(character);
				}
				break;
			case '-':
				if(this.pila.getInicio().getDato()=='(') {
					this.pila.insertarInicio(c);
				}
				else {
					char character = removeDatoInicio();
					insertarPila(c);
					this.pila.insertarInicio(character);
				}
				break;
			case '(':
				System.out.println("entre al default");
				System.out.println("Parentesis iz");
				this.pila.insertarInicio(c);
				break;
			case ')':
				vaciarPilaA();
				break;
			}
		}
	}
	public ArrayList<Character> getCola() {
		return cola;
	}
	public void setCola(ArrayList<Character> cola) {
		this.cola = cola;
	}
	public Lista_Simple<Character> getPila() {
		return pila;
	}
	public void setPila(Lista_Simple<Character> pila) {
		this.pila = pila;
	}
	public void vaciarPilaA() {
		Nodo<Character> aux = this.pila.getInicio();
		boolean salir = true;
		while(aux.getSiguiente()!=null && salir) {
			if(aux.getDato()=='(') {
				System.out.println("Parentesis iz");
				salir = false;
				removeDatoInicio();
			}
			this.cola.add(removeDatoInicio());
			aux = aux.getSiguiente();
		}
	}
	public void vaciarPila() {
		if(!this.pila.isVacia()) {
			for (Character character : pila) {
				if(character !='(') {
					this.cola.add(character);
				}
			}
			this.pila = null;
			Runtime garbage = Runtime.getRuntime();
			garbage.gc();
		}
	}
	public void copyColaToArrayList() {
		ArrayList<Character> copia = new ArrayList<>();
		for (Character character : cola) {
			copia.add(character);
		}
		cola.clear();
		this.letra=copia;
	}
	public Character removeDatoInicio() {
		Nodo<Character> aux = this.pila.getInicio().getSiguiente();
		char c = this.pila.getInicio().getDato();
		this.pila.setInicio(null);
		this.pila.setInicio(aux);
		Runtime garbage = Runtime.getRuntime();
		garbage.gc();
		return c;
	}
	public void algShunting() {
		nuevaPila();
		filtracion();
		vaciarPila();
		copyColaToArrayList();
	}
}
