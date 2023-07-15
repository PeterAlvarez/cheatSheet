public class Lista {

	Nodo primero;
	int promedio = 0;

	public Lista() {
		this.primero = null;
	}

	public void insertarCabezaLista(Libro Libro) {
		Nodo nuevo = new Nodo(Libro);
		nuevo.enlace = this.primero;
		this.primero = nuevo;
	}

	public Lista insertarFinal(Libro Libro) {
		Nodo nuevo = new Nodo(Libro);
		Nodo aux = this.primero;

		if (this.primero == null) {
			insertarCabezaLista(Libro);
		}else{
			while (aux.enlace != null) {
				aux = aux.enlace;
			}
			aux.setSiguiente(nuevo);
		}
		return this;
	}

	public void buscarLibro(Libro book) {
		Nodo nuevo = new Nodo(book);
		Nodo aux = this.primero;
		boolean p = true;
		while (aux != null) {
			if ((aux.dato.getTitulo())==(nuevo.dato.getTitulo())) {
				p = true;
				break;
			}
			aux = aux.enlace;
		}
		if(p){
			System.out.println("El libro existe en la lista");
			System.out.println(aux.dato.toString());
			
		}else
			System.out.println("El libro no existe en la list");	
	}

	public void visualizar() {

		Nodo n = this.primero;
		while (n != null) {
			System.out.print(n.dato + "\n");
			n = n.enlace;
		}
		System.out.println("\n");
	}

}

