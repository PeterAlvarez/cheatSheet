package arbolParaExamen;

import java.util.*;

public class Arbol {

    public class Nodo {
        private int dato;
        private Nodo izq;
        private Nodo der;
        private int rep;

        public int getDato() {
            return dato;
        }

        public void setDato(int dato) {
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

        public Nodo() {
        }

        public Nodo(int dato) {
            this.dato = dato;
            izq = null;
            der = null;
            rep = 1;
        }
    }

    Nodo raiz;
    int num = 0;

    public Arbol() {
        raiz = null;
        num = 0;
    }

    public boolean vacio() {
        return raiz == null && num == 0;
    }

    // return true si existe el dato pasado por parametro
    public boolean existe(int dato) {
        if (this.vacio())
            return false;
        else
            return existe(raiz, dato);
    }


    private boolean existe(Nodo aux, int dato) {
        if (aux == null)
            return false;
        else if (dato == aux.dato)
            return true;
        else if (dato < aux.dato)
            return existe(aux.izq, dato);
        else
            return existe(aux.der, dato);
    }

    /*
     * //metodo solo de prueba, borrar cuando se compile la clase Arbol public void
     * pruebaPadre(int dato) { if(nodoPadre(dato)==null)
     * System.out.println("No hay referencia"); else
     * System.out.println(nodoPadre(dato).dato); }
     *
     * //metodo solo de prueba, borrar cuando se compile la clase Arbol public void
     * prueba(int dato) { if(nodo(dato)==null)
     * System.out.println("No hay referencia"); else
     * System.out.println(nodo(dato).dato); }
     */

    private Nodo nodo(int dato) {
        if (!existe(dato))
            return null;
        else {
            if (dato == raiz.dato)
                return raiz;
            else {
                Nodo aux = nodoPadre(dato);
                if (dato < aux.dato)
                    return aux.izq;
                else
                    return aux.der;
            }
        }
    }

    private Nodo nodoPadre(int dato) {
        if (dato == raiz.dato || !existe(dato))
            return null;
        else {
            Nodo aux = raiz;
            while (true) {
                if (dato < aux.dato) {
                    if (dato == aux.izq.dato)
                        return aux;
                    else
                        aux = aux.izq;
                } else {
                    if (dato == aux.der.dato)
                        return aux;
                    else
                        aux = aux.der;
                }
            }
        }
    }

    public boolean esHoja(int dato) {
        if (!existe(dato))
            return false;
        else {
            Nodo aux = nodo(dato);
            return aux.izq == null && aux.der == null;
        }
    }

    private Nodo nodoIzq(int dato) {
        if (!existe(dato) || this.vacio())
            return null;
        else {
            Nodo aux = nodo(dato);
            if (aux.der == null)
                return null;
            else {
                aux = aux.der;
                while (aux.izq != null)
                    aux = aux.izq;
                return aux;
            }
        }
    }

    public boolean eliminarNodo(int dato) {
        if (!existe(dato))
            return false;
        else {
            if (dato == raiz.dato && (raiz.izq == null || raiz.der == null)) {
                if (esHoja(dato))
                    raiz = null;
                else if (raiz.izq == null)
                    raiz = raiz.der;
                else
                    raiz = raiz.izq;
            } else {
                Nodo aux = nodo(dato);
                if (esHoja(dato)) {
                    Nodo auxp = nodoPadre(dato);
                    if (aux == auxp.izq)
                        auxp.izq = null;
                    else
                        auxp.der = null;
                } else {
                    if (aux.izq == null) {
                        Nodo auxp = nodoPadre(dato);
                        if (aux == auxp.izq)
                            auxp.izq = aux.der;
                        else
                            auxp.der = aux.der;
                    } else if (aux.der == null) {
                        Nodo auxp = nodoPadre(dato);
                        if (aux == auxp.izq)
                            auxp.izq = aux.izq;
                        else
                            auxp.der = aux.izq;
                    } else {
                        Nodo auxi = nodoIzq(dato);
                        Nodo auxp = nodoPadre(auxi.dato);
                        aux.dato = auxi.dato;
                        auxp.izq = auxi.der;
                    }
                }
            }
            num--;
            return true;
        }
    }


    //	El recorrido en anchura o amplitud,
    //	consiste en ir visitando el árbol por niveles.

    public void amplitud() {
        if (!vacio())
            amplitud(raiz);
    }
    //	El método poll () se usa para recuperar y
    //	eliminar el encabezado de esta cola,
    // devuelve nulo si esta cola está vacía.
    private void amplitud(Nodo aux) {
        Queue cola = new LinkedList();
        cola.add(aux);
        while (!cola.isEmpty()) { // isEmpty= verifica si es vacio
            Nodo aux1 = (Nodo) cola.poll();
            System.out.println(aux1.dato);
            if (aux1.izq != null)
                cola.add(aux1.izq);
            if (aux1.der != null)
                cola.add(aux1.der);

        }

    }



    //	muestra el arbol
    public String toString() {
        return toString(raiz, 0);
    }

    public String toString(Nodo aux, int nivel) {
        if(aux == null) {
            return "";
        }else {
            String nive="";
            for(int i=0; i<nivel; i++) nive=". "+nive;
            if(aux.izq==null  && aux.der!=null){
                return nive + "| "+aux.dato+"\n"+  toString(aux.izq, ++nivel) + toString(aux.der, nivel);
            }else {
                String ni="";
                for(int i=0; i<nivel; i++) ni=". "+ni;
                if(aux.der==null  && aux.der!=null){
                    return nive +"  |\n"+ aux.dato+"\n"+nive+  toString(aux.izq, ++nivel) + toString(aux.der, nivel);
                }else {

                    String niv="";
                    for(int i=0; i<nivel; i++) niv=". "+niv;

                    return niv + "| "+aux.dato+"\n"+  toString(aux.izq, ++nivel) + toString(aux.der, nivel);

                }
            }
        }

    }

    private String nivel(Nodo a) {
        String c = "";
        Queue cola = new LinkedList();
        cola.add(raiz);

        while (cola.size() != 0) { // verifica si es vacio
            c = c + "  ";
            Nodo aux1 = (Nodo) cola.poll();
            if (aux1 == a) {
                return "";
            } else if (aux1.izq == a) {
                return c;
            } else if (aux1.der == a) {
                return c;
            } else {
                cola.add(aux1.izq);
                cola.add(aux1.der);

            }

        }
        return null;
    }

    //	raiz--izq--der
    public void preOrden() {
        if (!vacio())
            preOrden(this.raiz);
        System.out.println();
    }

    private void preOrden(Nodo aux) {
        if (aux != null) {
            System.out.print(aux.dato + " ");
            preOrden(aux.izq);
            preOrden(aux.der);
        }
    }

    //	izq--der--raiz
    public void postOrden() {
        if (!vacio())
            postOrden(this.raiz);
        System.out.println();
    }

    private void postOrden(Nodo aux) {
        if (aux != null) {
            postOrden(aux.izq);
            postOrden(aux.der);
            System.out.print(aux.dato + " ");
        }
    }

    //	izq--raiz--der
    public void enOrden() {
        if (!vacio())
            enOrden(this.raiz);
        System.out.println();
    }

    private void enOrden(Nodo aux) {
        if (aux != null) {
            enOrden(aux.izq);
            System.out.print(aux.dato + " ");
            enOrden(aux.der);
        }
    }



    public void insertar(int dato) {
        if (this.vacio()) {
            raiz = new Nodo(dato);
            this.num++;
        } else {
            Nodo aux = raiz;
            boolean insertado = false;
            while (!insertado) {
                if (dato == aux.dato) {
                    aux.rep++;
                    insertado = true;
                } else {
                    if (dato < aux.dato) {
                        if (aux.izq == null) {
                            aux.izq = new Nodo(dato);
                            insertado = true;
                            this.num++;
                        } else {
                            aux = aux.izq;
                        }
                    } else {
                        if (aux.der == null) {
                            aux.der = new Nodo(dato);
                            insertado = true;
                            this.num++;
                        } else {
                            aux = aux.der;
                        }
                    }
                }
            }
        }
    }

    /*
     * public void insertar(int dato) { if(raiz==null) //insertar else
     * insertar(dato, ref) }
     *
     * private void insertar(int dato, Nodo ref) { }
     */

}
