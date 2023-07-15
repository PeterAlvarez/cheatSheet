package Arbol_2017;

public class NodoArbol {
    public int dato;
    NodoArbol Hizq , Hder ;

    public NodoArbol( int dato ) {
        this.dato = dato;
        NodoArbol Hizq , Hder = null;
    }

    public void insertarBinario( int elem ) {
        if( elem < this.dato ) {
            if( Hizq == null ) {
                Hizq = new NodoArbol(elem);
            } else {
                Hizq.insertarBinario(elem);
            }
        }else if ( elem > this.dato ) {
            if( Hder == null ) {
                Hder = new NodoArbol(elem);
            }else {
                Hder.insertarBinario( elem );
            }
        }
    }
}
