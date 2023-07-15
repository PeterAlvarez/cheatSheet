package Lista_doble_enlace;

public class IteradorLista {
	private Nodo actual;

	public IteradorLista(ListaDoble ld) {
		this.actual = ld.cabeza;
	}

	public Nodo siguiente(){
		Nodo a = this.actual;
		if (this.actual != null) {
			this.actual = this.actual.adelante;
		}
		return a;
	}
}
