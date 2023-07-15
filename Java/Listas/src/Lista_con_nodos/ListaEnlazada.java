package Lista_con_nodos;

public class ListaEnlazada {

	private Nodo primero, ultimo;

	public ListaEnlazada() {
		this.primero = null;
		this.ultimo = null;
	}

	public boolean vacia() {
		return this.primero == null;
	}

	public void insertarUltimo(String dato) {
		Nodo aux = new Nodo(dato);
		if (vacia()) {
			this.primero = this.ultimo = aux;
		} else {
			this.ultimo.enlace(aux);
			this.ultimo = aux;
		}
	}

	public void insertarInicio(String dato) {
		Nodo aux = new Nodo(dato);
		if (vacia()) {
			this.primero = this.ultimo = aux;
		} else {
			aux.setSig(this.primero);
		}
		this.primero = aux;
	}

	public void eliminaPrimero() {
		if (!vacia())
			this.primero = this.primero.getSig();
	}

	public void eliminaUltimo() {
		Nodo aux = this.primero;
		if (this.primero.getSig() == null) { 
			this.primero = null;
		}
		if (vacia()) {
			insertarInicio(null);
		} else {
			while (aux.getSig().getSig() != null) {
				aux = aux.getSig();
			}
			this.ultimo = aux;
			aux.setSig(null);
		}
	}

	public String devolverPrimero() {
		if (vacia())
			return null;
		return primero.getDato();
	}

	public String devolverUltimo() {
		if (vacia())
			return null;
		return ultimo.getDato();
	}

	public int contarElementos() {
		int c = 0;
		Nodo aux = primero;
		if (vacia()) {
			return c;
		} else {
			while (aux != null) {
				c++;
				aux = aux.getSig();
			}
			return c;
		}
	}

	public String devolverPocicion(int pos) {
		int con = 0;
		Nodo aux = primero;
		if (vacia())
			return null;
		else {
			while (aux != null) {
				con++;
				if (con - 1 == pos)
					return aux.getDato();
				aux = aux.getSig();
			}
			return "no existe";
		}
	}

	// public String borrar() {
	// Nodo aux = this.primero;
	// return aux.getSig().getDato();
	// }

	public void intruduceDato(String dat, int pos) {
		Nodo nuevo = new Nodo(dat);
		Nodo aux = this.primero;
		int cont = 0;
		if (pos == 0) {
			nuevo.enlace(aux);
			this.primero = nuevo;
		} else {
			while (cont + 1 < pos) {
				aux = aux.getSig();
				cont++;
			}
			nuevo.enlace(aux.getSig());
			aux.enlace(nuevo);
		}
	}

	public void modificarDato(String dat, int pos) {
		Nodo nuevo = new Nodo(dat);
		Nodo aux = this.primero;
		int cont = 0;
		if (pos == 0) {
			nuevo.enlace(aux.getSig());
			this.primero = nuevo;
		} else {
			while (cont + 1 < pos) {
				aux = aux.getSig();
				cont++;
			}
			nuevo.enlace(aux.getSig().getSig());
			aux.enlace(nuevo);
		}
	}

	public void eliminaPos(int pos) {
		Nodo aux = this.primero;
		int cont = 0;
		if (pos == 0) {
			this.primero = this.primero.getSig();
		} else {
			while (cont + 1 < pos) {
				aux = aux.getSig();
				cont++;
			}
			System.out.println(aux.getDato());
			aux.enlace(aux.getSig().getSig());
		}
	}

	public	int buscar(String dat) {
		Nodo aux = this.primero;
		int con=0;
		while(aux.getDato()!=null){
			if(aux.getDato()==dat){
				return con;
			}
			aux=aux.getSig();
			con++;
		}
		return -1;
	}

	public void Visualizar() {
		Nodo aux = this.primero;
		String Salida = "\n**************** Datos ***************\n[ ";
		while (aux != null) {
			Salida = Salida + aux.getDato() + " ";
			aux = aux.getSig();
		}
		System.out.print(Salida + "]\n");
	}

}