package objetos;

import java.util.Iterator;

public class Lista_Simple <T> implements Iterable <T>{
	private Nodo <T>inicio;
	public Lista_Simple() {
		// TODO Auto-generated constructor stub
		inicio = null;
	}
	public void insertarInicio(T dato) {
		Nodo <T> nuevo = new Nodo<>(dato);
		if(this.isVacia()) {
			inicio=nuevo;
		}
		else {
			nuevo.setSiguiente(inicio);
			inicio=nuevo;
		}
	}
	
	public Boolean isVacia() {
		return inicio==null;
	}
	public void imprimir() {
		Nodo <T> aux = inicio;
		while(aux!=null) {
			System.out.print(aux.getDato()+" ");
			aux=aux.getSiguiente();
		}
		System.out.print("");
	}
	public Nodo<T> getInicio() {
		return inicio;
	}
	public void setInicio(Nodo<T> inicio) {
		this.inicio = inicio;
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
}