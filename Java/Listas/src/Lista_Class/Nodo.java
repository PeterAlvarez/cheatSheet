package Lista_Class;

//clase Nodo con las dos partes de un nodo y su constructor 
public class Nodo {
	int dato;
	Nodo enlace;
	
	public Nodo(int x) {
		this.dato = x;
		this.enlace = null;
	}

	public int getDato() {
		return this.dato;
	}

	public Nodo getEnlace() {
		return this.enlace;
	}

	public void setEnlace(Nodo enlace) {
		this.enlace = enlace;
	}
}

