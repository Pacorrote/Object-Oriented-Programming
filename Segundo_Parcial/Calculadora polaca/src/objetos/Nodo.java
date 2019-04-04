package objetos;

public class  Nodo<T>{

	private T dato;
	private Nodo<T> siguiente;
	private Nodo<T> anterior;
	
	public Nodo(T dato) {
		// TODO Auto-generated constructor stub
		this.dato=dato;
		siguiente=null;
	}

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public Nodo<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}
	
	public Nodo<T> getAnterior() {
		return anterior;
	}

	public void setAnterior(Nodo<T> anterior) {
		this.anterior = anterior;
	}

}