package Lista_doble_enlace;

public class Nodo {
	int dato;
	Nodo adelante;
	Nodo atras;

	// declaración de nodo de lista doble
	public Nodo(int entrada) {
		this.dato = entrada;
		this.adelante = this.atras = null;
	}

	public int getDato() {
		return this.dato;
	}
}