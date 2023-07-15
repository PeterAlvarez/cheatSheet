package Lista_Class;

import java.util.Arrays;

public class Lista {
	public Nodo primero;

	public Lista() {
		this.primero = null;
	}

	public Lista insertarCabezaLista(int entrada) {
		Nodo nuevo = new Nodo(entrada);
		nuevo.enlace = this.primero;
		this.primero = nuevo;

		return this;
	}
	
	public Lista insertarFinal(int dato) {
		Nodo nuevo = new Nodo(dato);
		Nodo aux = this.primero;

		while (aux.enlace != null) {
			aux = aux.enlace;
		}
		aux.setEnlace(nuevo);

		return this;
	}
	
	public void insetarPocicion(int dato, int pos) {
		Nodo nuevo = new Nodo(dato);
		Nodo aux = this.primero;
		int con = 0;
		if (pos == 0) {
			insertarCabezaLista(dato);
		} else {
			while (con < pos - 1) {
				aux = aux.enlace;
				con++;
			}
			nuevo.setEnlace(aux.enlace);
			aux.setEnlace(nuevo);
		}
	}

	public void buscarDato(int dato) {
		Nodo aux = this.primero;
		int co = 0;
		boolean ban = false;
		while (aux != null) {

			if (dato == aux.getDato()) {
				ban = true;
				break;
			}
			co++;
			aux = aux.enlace;
		}
		if (ban)
			System.out.println("El dato : " + dato + " existe en la poscicion : " + co);
		else
			System.out.println("El dato : " + dato + " no existe en la lista");
	}

	public int tamanio() {
		Nodo aux = this.primero;
		int co = 0;
		while (aux != null) {
			aux = aux.enlace;
			co++;
		}
		return co;
	}

	public void ordenarDatos(){
		int[] vec=new int[tamanio()];
		Nodo aux = this.primero;
		
		for( int i=0 ; i<vec.length ; i++ ){
			vec[i] = aux.dato;
			aux=aux.enlace;
		}
		Arrays.sort(vec);
		
		for(int i=0 ; i<vec.length ; i++){
			System.out.print(vec[i]+"  ");
		}
		System.out.println("\n");
	}

	public void visualizar() {
		Nodo n = this.primero;
		while (n != null) {
			System.out.print(n.dato + "  ");
			n = n.enlace;
		}
		System.out.println("\n");
	}

}