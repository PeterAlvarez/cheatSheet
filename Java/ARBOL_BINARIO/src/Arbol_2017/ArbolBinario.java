package Arbol_2017;

public class ArbolBinario {
	NodoArbol raiz;

	public ArbolBinario() {
		this.raiz = null;
	}

	public void insertarNodo( int elem ) {
		if( this.raiz == null ) {
			this.raiz = new NodoArbol( elem );
		}else {
			this.raiz.insertarBinario( elem );
		}
	}

	public void preOrden( NodoArbol nodo ) {
		if( nodo != null ) {
			System.out.print( nodo.dato + " " );
			preOrden( nodo.Hizq );
			preOrden( nodo.Hder );
		}
	}

	public void posOrden ( NodoArbol nodo ) {
		if( nodo!=null ) {
			posOrden ( nodo.Hizq );
			posOrden ( nodo.Hder );
			System.out.print( nodo.dato + " " );
		}
	}

	public void inOrden ( NodoArbol nodo ) {
		if( nodo != null ) {
			inOrden( nodo.Hizq );
			System.out.print( nodo.dato + " " );
			inOrden( nodo.Hder );
		}
	}

	public int numNodos( NodoArbol nodo ) {
		if( nodo != null ) {
			return 1 + numNodos( nodo.Hder ) + numNodos( nodo.Hizq );
		}
		return 0;
	}

	public int numDosHijos( NodoArbol nodo) {
		if( nodo != null ) {
			if( nodo.Hizq != null  &&  nodo.Hder != null ) {
				return 1 + numDosHijos(nodo.Hizq) + numDosHijos(nodo.Hder);
			}else {
				return numDosHijos(nodo.Hizq) + numDosHijos(nodo.Hder);
			}
		}
		return 0;
	}

	NodoArbol busquedaNodo( int Elem , NodoArbol nodo) {
		if (nodo == null) {
			return null;
		} else if(nodo.dato == Elem){
			return nodo;
		} else if (Elem > nodo.dato) {
			busquedaNodo(Elem, nodo.Hder);
		}else {
			busquedaNodo(Elem, nodo.Hizq);
		}
		return null;
	}

	public void BusquedaDato(int elem,NodoArbol nodo) {
		if(busquedaNodo(elem,nodo)!=null) {
			System.out.println("El dato "+ elem + " existe");
		}else {
			System.out.println("El dato " + elem +  "No existe");
		}
	}

	public int profundidadArbol(NodoArbol nodo) {
		if(nodo!=null) {
			return  1 + Math.max(profundidadArbol(nodo.Hder) , profundidadArbol(nodo.Hizq) );
		}
		return 0;
	}


	void eliminarHoja(int elem , NodoArbol nodo) {
		NodoArbol P;
		if (Determinar_Hoja(elem, nodo) == true) {
			P = referenciaPadre(elem);
			if (elem < P.dato)
				P.Hizq = null;
			else
				P.Hder = null;
		}
	}


	public boolean Determinar_Hoja(int elem , NodoArbol nodo) {
		if (nodo == null) {
			System.out.println("no existe");
		} else {
			if (nodo.dato == elem && nodo.Hder == null && nodo.Hizq == null) {
				return true;

			} else {
				if (elem > nodo.dato) {
					return Determinar_Hoja(elem, nodo.Hder);
				} else {
					return Determinar_Hoja(elem, nodo.Hizq);
				}
			}
		}
		return false;
	}

	public NodoArbol referenciaPadre(int dato) {
		if (!this.existe(this.raiz, dato) || esHoja(this.raiz) || dato == this.raiz.dato)
			return null;
		else {
			NodoArbol aux = this.raiz;
			while (!((aux.Hizq != null && dato == aux.Hizq.dato) || (aux.Hder != null && dato == aux.Hder.dato))) {
				if (dato < aux.dato)
					aux = aux.Hizq;
				else
					aux = aux.Hder;
			}
			return aux;
		}
	}

	public boolean existe(NodoArbol ref, int xdato) {
		if (ref == null)
			return false;
		else {
			if (xdato == ref.dato)
				return true;
			else if (xdato < ref.dato)
				return existe(ref.Hizq, xdato);
			else
				return existe(ref.Hder, xdato);
		}
	}

	public boolean esHoja(NodoArbol aux) {
		return aux.Hder == null && aux.Hizq == null;
	}




	public void mostrar() {
		System.out.println(raiz.dato);
	}
}
