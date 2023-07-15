package Mi_primera_lista;

public class Lista {

	private Lista sig;
	private String dato;

	public Lista() {
		this.dato = null;
		this.sig = null;
	}

	public Lista(Lista p) {
		this.dato = p.dato;
		this.sig = p.sig;
	}

	public boolean vacia() {
		return this.sig == null && this.dato == null;
	}

	public void insertarInicio(String x) {
		this.sig = new Lista(this);
		this.dato = x;
	}

	public void insertarFinal(String x) {
		if (vacia()) {
			this.dato = x;
			this.sig = new Lista();
		} else {
			this.sig.insertarFinal(x);
		}
	}

	public void insertar(String x, int k) {
		if (vacia() || k == 0)
			insertarInicio(x);
		else
			sig.insertar(x, k - 1);
	}

	public String eliminaDato(String x) {
		String res = null;
		if (!vacia()) {
			if (this.dato.equals(x)) {
				res = this.dato;
				this.dato = this.sig.dato;
				this.sig = this.sig.sig;
			} else {
				res = this.sig.eliminaDato(x);
			}
		}
		return res;
	}

	public boolean buscar(String x) {
		if (vacia())
			return false;
		if (dato.equals(x))
			return true;
		return sig.buscar(x);
	}

	public String obtener(int pos) {
		if (vacia())
			return null;
		if (pos == 0)
			return dato;
		return sig.obtener(pos - 1);
	}

	public String toString() {
		String cad = "";
		cad = listar();
		return cad;
	}

	public String listar() {
		String cad = "";
		if (!vacia()) {
			cad = dato.toString();
			if (!this.sig.vacia()) {
				cad = cad + " " + this.sig.listar();
			}
		}
		return cad;
	}

	public int tamaño() {
		if (vacia())
			return 0;
		return 1 + this.sig.tamaño();
	}

	public void modificar(int pos, String x) {
		if (vacia() || pos < 0)
			return;
		if (pos == 0) {
			dato = x;
		} else {
			sig.modificar(pos - 1, x);
		}
	}
}