package Lista_doble_enlace;

public class ListaDoble {
    Nodo cabeza;

    // métodos de la clase (implementación en apartado 8.9)
    public ListaDoble() {
        System.out.println("hola mundo");
    }
    public ListaDoble insertarCabezaLista(int entrada){
        Nodo nuevo = new Nodo(entrada);
        nuevo.adelante = this.cabeza;
        if (this.cabeza != null)
            this.cabeza.atras = nuevo;
        this.cabeza = nuevo;
        return this;
    }

    public ListaDoble insertaDespues(Nodo anterior, int entrada) {
        nodo nuevo = new nodo(entrada);
        nuevo.adelante = anterior.adelante;
        if (anterior.adelante != null)
            anterior.adelante.atras = nuevo;
        anterior.adelante = nuevo;
        nuevo.atras = anterior;
        return this;
    }

    public void eliminar(int entrada) {
        boolean encontrado = false;
        Nodo actual = this.cabeza;
        // Bucle de búsqueda
        while ((actual != null) && (!encontrado)) {
            //			 la comparación se realiza con el método equals()..., depende del
            //			 tipo Elemento

            encontrado = (actual.dato == entrada);
            if (!encontrado)
                actual = actual.adelante;
        }
        // Enlace de nodo anterior con el siguiente
        if (actual != null) {
            // distingue entre nodo cabecera o resto de la lista
            if (actual == this.cabeza) {
                cabeza = actual.adelante;
                if (actual.adelante != null)
                    actual.adelante.atras = null;
            } else if (actual.adelante != null) // No es el último nodo
            {
                actual.atras.adelante = actual.adelante;
                actual.adelante.atras = actual.atras;
            } else // último nodo
                actual.atras.adelante = null;
            actual = null;
        }
    }

    public void visualizar() {
        Nodo n;
        n = this.cabeza;
        // System.out.println("\n");
        while (n != null) {
            System.out.print(n.dato + "  ");
            n = n.adelante;
        }
    }

    public void buscarLista(int destino) {
        ;
    }
}
