public class Nodo {

	Libro dato;
	Nodo enlace;

	public Nodo(Libro dato){
		this.dato = dato;
		this.enlace = null;
	}
	
	public void setSiguiente(Nodo nodo) {
		this.enlace = nodo;
	}
}