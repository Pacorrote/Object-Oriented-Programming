package objetos;

import java.util.Iterator;

public class Lista_Doble <T> implements Iterable <T>{
	private Nodo<T> inicio;
	private Nodo<T> fin;
	
	public Lista_Doble() {
		// TODO Auto-generated constructor stub
		inicio=null;
		fin=null;
	}
	public void insertarInicio(T dato) {
		Nodo <T> nuevo = new Nodo<>(dato);
		if(this.isVacia()) {
			inicio=nuevo;
			fin=nuevo;
		}
		else {
			inicio.setAnterior(nuevo);
			nuevo.setSiguiente(inicio);
			inicio=nuevo;
		}
	}
	public void insertarFinal(T dato) {
		Nodo <T> nuevo = new Nodo<>(dato);
		Nodo <T> aux;
		if(this.isVacia()) {
			inicio=nuevo;
			fin=nuevo;
		}
		else {
			aux = inicio;
			while(aux.getSiguiente()!=null) {
				aux=aux.getSiguiente();
			}
			aux.setSiguiente(nuevo);
			nuevo.setAnterior(aux);
			fin=nuevo;
		}
	}
	public Boolean isVacia() {
		return inicio==null && fin==null;
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<T>() {
			
			private Nodo <T> aux = inicio;
			@Override
			public boolean hasNext() {//hay mas elementos de la lista
				// TODO Auto-generated method stub
				return aux != null;
			}

			@Override
			public T next() { //Agarra el elemento y despues avanza al siguiente elemento
				// TODO Auto-generated method stub
				T elemento = aux.getDato();
				aux = aux.getSiguiente();
				return elemento;
			}
			
		};
	}

	public Nodo<T> getInicio() {
		return inicio;
	}
	public void setInicio(Nodo<T> inicio) {
		this.inicio = inicio;
	}
	public Nodo<T> getFin() {
		return fin;
	}
	public void setFin(Nodo<T> fin) {
		this.fin = fin;
	}
}
