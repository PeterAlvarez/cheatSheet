package MI_lista_recursiva;

public class Lista {

	private Lista sig;
	private String dato;

	public Lista() {
		this.sig = null;
		this.dato = null;
	}

	public Lista(Lista li) {
		this.dato = li.dato;
		this.sig = li.sig;
	}

	public boolean vacia() {
		return this.sig == null && this.dato == null;
	}

	public void ingresarFinal(String x) {
		if (vacia()) {
			this.dato = x;
			this.sig = new Lista();
		} else {
			this.sig.ingresarFinal(x);
		}
	}

	public void mostrar() {
		if (!vacia()) {
			System.out.print(this.dato + " ");
			this.sig.mostrar();
		}
	}

	public void insertaInicio(String x) {
		this.sig = new Lista(this);
		this.dato = x;
	}

	public void insertar(String x, int pos) {
		if (pos == 0 || vacia()) {
			insertaInicio(x);
		} else {
			this.sig.insertar(x, pos - 1);
		}
	}

	public void eliminarDato(String x) {
		if (!vacia()) {
			if (this.dato.equals(x)) {
				this.dato = this.sig.dato;
				this.sig = this.sig.sig;
			} else {
				this.sig.eliminarDato(x);
			}
		}
	}

	public boolean buscar(String x) {
		if (!vacia()) {
			if (this.dato.equals(x)) {
				return true;
			} else {
				return sig.buscar(x);
			}
		} else {
			return false;
		}
	}

	public String obtenerDato(int pos) {
		if (vacia()) {
			if (pos == 0) {
				return this.dato;
			} else {
				return this.sig.obtenerDato(pos - 1);
			}
		} else {
			return null;
		}
	}

	public int tamanio() {
		if (vacia()) {
			return 0;
		} else {
			return this.sig.tamanio() + 1;
		}
	}

	public void modificarPos(String x, int pos) {
		if (!vacia()) {
			if (pos == 0) {
				this.dato = x;
			} else {
				this.sig.modificarPos(x, pos - 1);
			}
		}
	}
}
