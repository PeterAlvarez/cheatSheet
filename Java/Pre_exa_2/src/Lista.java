public class Lista {

	Nodo primero;
	int promedio = 0;

	public Lista() {
		this.primero = null;
	}

	// inserta en la lista
	public void insertarCabezaLista(Estudiante entrada) {
		Nodo nuevo = new Nodo(entrada);
		nuevo.enlace = this.primero;
		this.primero = nuevo;
	}

	// inserta al final de la lista
	public Lista insertarFinal(Estudiante dato) {
		Nodo nuevo = new Nodo(dato);
		Nodo aux = this.primero;
		while (aux.enlace != null) {
			aux = aux.enlace;
		}

		aux.setSiguiente(nuevo);

		return this;
	}

	// muestra datos de la lista
	public void visualizar() {

		Nodo n = this.primero;
		while (n != null) {
			System.out.print(n.dato + "\n");
			n = n.enlace;
		}
		System.out.println("\n");
	}

	public int cantidad() {
		Nodo n = this.primero;
		int con = 0;

		while (n != null) {
			if (n.dato.edad > 20)
				con++;
			n = n.enlace;
		}
		return con;
	}

	public float promedio() {
		Nodo n = this.primero;
		int sum = 0;
		int con = 0;
		while (n != null) {
			sum += n.dato.edad;
			n = n.enlace;
			con++;
		}
		return (float) sum / con;
	}

	public String estudianteMayor() {
		Nodo n = this.primero;
		Nodo aux2 = null;
		int aux = 0;

		while (n != null) {
			if (n.dato.edad > aux) {
				aux = n.dato.edad;
				aux2 = n;
			}
			n = n.enlace;
		}
		return aux2.dato.toString();
	}
}

// public int cantidad() {
// Nodo n = this.primero;
// int con = 0;
//
// while (n != null) {
// if (n.dato.edad > 20)
// con++;
// n = n.enlace;
// }
// return con;
// }

// public boolean insertarNoRepetido(String x) {
// Nodo nuevo = new Nodo(x);
// Nodo n = this.primero;
// boolean p = false;
// while (n != null) {
// if (n.dato.ci.equals(nuevo.dato.ci)) {
// p = true;
// }
// n = n.enlace;
// }
// return p;
// }
