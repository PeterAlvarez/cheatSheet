

import java.util.*;

public class Arbol <T>{

public class Nodo <T>{
	private T dato;
	private Nodo izq;
	private Nodo der;
	private int rep;

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public Nodo getIzq() {
		return izq;
	}

	public void setIzq(Nodo izq) {
		this.izq = izq;
	}

	public Nodo getDer() {
		return der;
	}

	public void setDer(Nodo der) {
		this.der = der;
	}

	
	public Nodo(T dato) {
		this.dato=dato;
		izq=null;
		der=null;
		rep=1;
	}
}

	Nodo raiz;
	int num=0;

	public Arbol() {
		raiz=null;
		num=0;
	}

	public boolean existe(T dato) {
		if(this.vacio()) return false;
		else return existe(raiz, dato);
	}

//	 public Arbol equilibrar() {
//		 Arbol a=new Arbol();
// 
//	 }

	private boolean existe(Nodo aux, T dato) {
		if(aux==null) return false;
		else if(((Comparable)dato).compareTo( aux.dato)==0) return true;
		else if(((Comparable)dato).compareTo(aux.dato)<0) return existe(aux.izq, dato);
		else return existe(aux.der, dato);
	}
/*
	//metodo solo de prueba, borrar cuando se compile la clase Arbol
	public void pruebaPadre(int dato) {
		if(nodoPadre(dato)==null) System.out.println("No hay referencia");
		else System.out.println(nodoPadre(dato).dato);
	}

	//metodo solo de prueba, borrar cuando se compile la clase Arbol
		public void prueba(int dato) {
			if(nodo(dato)==null) System.out.println("No hay referencia");
			else System.out.println(nodo(dato).dato);
		}
*/
	private Nodo nodo(T dato) {
		if(!existe(dato)) return null;
		else {
			if(((Comparable)dato).compareTo( raiz.dato)==0) return raiz;
			else {
				Nodo aux=nodoPadre(dato);
				if(((Comparable)dato).compareTo( aux.dato)<0) return aux.izq;
				else return aux.der;
			}
		}
	}

	private Nodo nodoPadre(T dato) {
		if(((Comparable)dato).compareTo( raiz.dato)==0 || !existe(dato)) return null;
		else {
			Nodo aux=raiz;
			while(true) {
				if(((Comparable)dato).compareTo( aux.dato)<0) {
					if(dato==aux.izq.dato) return aux;
					else aux=aux.izq;
				}else {
					if(dato==aux.der.dato) return aux;
					else aux=aux.der;
				}
			}
		}
	}

	public boolean esHoja(T dato) {
		if(!existe(dato)) return false;
		else{
			Nodo aux=nodo(dato);
			return aux.izq==null && aux.der==null;
		}
	}

	private Nodo nodoIzq(T dato) {
		if(!existe(dato) || this.vacio()) return null;
		else {
			Nodo aux=nodo(dato);
			if(aux.der==null) return null;
			else {
				aux=aux.der;
				while(aux.izq!=null) aux=aux.izq;
				return aux;
			}
		}
	}

	public boolean eliminarNodo(T dato) {
		if(!existe(dato)) return false;
		else {
			if(dato==raiz.dato && (raiz.izq==null || raiz.der==null)) {
				if(esHoja(dato)) raiz=null;
				else if(raiz.izq==null) raiz=raiz.der;
				else raiz=raiz.izq;
			}else {
				Nodo aux=nodo(dato);
				if(esHoja(dato)) {
					Nodo auxp=nodoPadre(dato);
					if(aux==auxp.izq) auxp.izq=null;
					else auxp.der=null;
				}else {
					if(aux.izq==null) {
						Nodo auxp=nodoPadre(dato);
						if(aux==auxp.izq) auxp.izq=aux.der;
						else auxp.der=aux.der;
					}else if(aux.der==null) {
						Nodo auxp=nodoPadre(dato);
						if(aux==auxp.izq) auxp.izq=aux.izq;
						else auxp.der=aux.izq;
					}else {
						System.out.println("aux "+dato);
						Nodo<T> auxi=nodoIzq(dato);
						System.out.println("auxi "+auxi.dato);
						Nodo auxp=nodoPadre(auxi.dato);
						System.out.println("auxp "+auxp.dato);
						aux.dato=auxi.dato;
						if(aux==auxp) auxp.der=auxi.der;
						else auxp.izq=auxi.der;
					}
				}
			}
			num--;
			return true;
		}
	}

	public void amplitud() {
		if(!vacio())
			amplitud(raiz);
	}
	private void amplitud(Nodo aux) {
		Queue cola= new LinkedList();
		cola.add(aux);
		while(!cola.isEmpty()) {  //verifica si es vacio
			Nodo aux1=(Nodo) cola.poll();
			System.out.println(aux1.dato);
			if(aux1.izq!=null) cola.add(aux1.izq);
			if(aux1.der!=null) cola.add(aux1.der);

		}

	}

	public String toString() {
		return toString(raiz, 0);
	}

	public String toString(Nodo aux, int nivel) {
		if(aux==null) return "";
		else {
			String niv="";
			for(int i=0; i<nivel; i++) niv="  "+niv;
			if(aux.izq==null && aux.der==null) return niv+"| "+aux.dato+"\n";
			if(aux.izq==null) return niv+"|"+aux.dato+"\n" + niv+ "  |.\n" + toString(aux.der, ++nivel);
			else if(aux.der==null) return niv+"|"+aux.dato+"\n" + toString(aux.izq, ++nivel)+ niv+ "  |.\n";
			else return niv + "|"+aux.dato+"\n"+toString(aux.izq, ++nivel) + toString(aux.der, nivel);
		}

	}

	private String nivel(Nodo a) {
		String c="";
		Queue cola= new LinkedList();
		cola.add(raiz);

		while(cola.size()!=0) {  //verifica si es vacio
			c=c+"  ";
			Nodo aux1=(Nodo) cola.poll();
			if(aux1==a) {
				return "" ;
			}else if(aux1.izq==a) {
				return c;
			}else if(aux1.der==a){
				return c;
			}else {
				cola.add(aux1.izq);
				cola.add(aux1.der);

			}

		}
		return null;

	}



	public void preOrden() {
		if(!vacio()) preOrden(this.raiz);
		System.out.println();
	}


	private void preOrden(Nodo aux) {
		if(aux!=null){
			System.out.print(aux.dato+" ");
			preOrden(aux.izq);
			preOrden(aux.der);
		}
	}

	public void postOrden() {
		if(!vacio()) postOrden(this.raiz);
		System.out.println();
	}

	private void postOrden(Nodo aux) {
		if(aux!=null){
			postOrden(aux.izq);
			postOrden(aux.der);
			System.out.print(aux.dato+" ");
		}
	}

	public void enOrden() {
		if(!vacio()) enOrden(this.raiz);
		System.out.println();
	}

	private void enOrden(Nodo aux) {
		if(aux!=null){
			enOrden(aux.izq);
			System.out.print(aux.dato+" ");
			enOrden(aux.der);
		}
	}


	public boolean vacio(){
		return raiz==null && num==0;
	}

	public void insertar(T dato) {
		if(this.vacio()) {
			raiz=new Nodo(dato);
			this.num++;
		}else {
			Nodo aux=raiz;
			boolean insertado=false;
			while(!insertado) {
				if(((Comparable)dato).compareTo( aux.dato)==0) {
					aux.rep++;
					insertado=true;
				}else {
					if(((Comparable)dato).compareTo( aux.dato)<0) {
						if(aux.izq==null) {
							aux.izq=new Nodo(dato);
							insertado=true;
							this.num++;
						}else {
							aux=aux.izq;
						}
					}else {
						if(aux.der==null) {
							aux.der=new Nodo(dato);
							insertado=true;
							this.num++;
						}else {
							aux=aux.der;
						}
					}
				}
			}
		}
	}

/*	public void insertar(int dato) {
		if(raiz==null)
			//insertar
		else insertar(dato, ref)
	}

	private void insertar(int dato, Nodo ref) {
}
*/

}
