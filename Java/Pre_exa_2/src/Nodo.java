
public class Nodo {

	Estudiante dato;
	Nodo enlace;

	public Nodo(Estudiante dato){
		this.dato = dato;
		this.enlace = null;
	}
	
	public void setSiguiente(Nodo nodo) {
		this.enlace = nodo;
	}
	
	
}
	
//	public Estudiante getDato() {
//		return dato;
//	}
//
//	public void setDato(Estudiante dato) {
//		this.dato = dato;
//	}
//
//	public Nodo getEnlace() {
//		return enlace;
//	}
//
//	public void setEnlace(Nodo enlace) {
//		this.enlace = enlace;
//	}


