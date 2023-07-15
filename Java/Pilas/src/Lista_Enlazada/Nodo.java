package Lista_Enlazada;

/**
 *
 * * @param <T> Tipo genérico
 */
public class Nodo<T> {

	private T dato;
	private Nodo<T> siguiente;

	/**
	 * Constructor por defecto
	 */
	public Nodo() {
		this.siguiente = null;
	}

	/**
	 * Le pasamos un dato al nodo
	 * 
	 * @param p
	 */
	public Nodo(T p) {
		this.siguiente = null;
		this.dato = p;
	}

	/**
	 * Le pasamos un dato y su siguiente nodo al nodo
	 * 
	 * @param t
	 *            Dato a insertar
	 * @param siguiente
	 *            Su siguiente nodo
	 */
	public Nodo(T t, Nodo<T> siguiente) {
		this.siguiente = siguiente;
		this.dato = t;
	}

	public T getDato() {
		return this.dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public Nodo<T> getSiguiente() {
		return this.siguiente;
	}

	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}

}
