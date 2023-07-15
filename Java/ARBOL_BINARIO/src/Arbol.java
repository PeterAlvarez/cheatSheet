import java.util.LinkedList;
import java.util.Queue;

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

    // mostrar el dato si existe sino retornar null de nodo padre
    private Nodo nodoPadre(int dato) {
        return null;
    }

    public boolean vacio() {
        return raiz == null && num == 0;
    }

    public void insertar(int dato) {
        if (this.vacio()) {
            raiz = new Nodo(dato);
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
                        } else {
                            aux = aux.izq;
                        }
                    } else {
                        if (aux.der == null) {
                            aux.der = new Nodo(dato);
                            insertado = true;
                        } else {
                            aux = aux.der;
                        }
                    }
                }
            }
        }
        this.num++;
    }


    public void amplitud() {
        if (!vacio())
            amplitud(raiz);
    }

    private void amplitud(Nodo aux) {
        Queue<Object> cola = new LinkedList();
        cola.add(aux);
        while (!cola.isEmpty()) {
            Nodo aux1 = (Nodo) cola.poll();
            System.out.println(aux1.dato);
            if (aux.izq != null)
                cola.add(aux1.dato);
            if (aux.der != null)
                cola.add(aux1.dato);
        }

    }

    /*
     * Escribir el metodo privado toString que devuelve una cadena con la estructura
     * de arbol de columnas de las siguientes dos formas 1.-usando tres argumrntos.
     * towstring (Nodo aux,String cad,int nivel) 2.-usaando dos argumentos.toString(
     * Nodo aux,int nivel)
     */
    /*
     * private String toString(Nodo aux,String cad) { cad=cad+"m" +"/n"; return cad;
     *
     * return num=raiz.dato;
     *
     * } public void preOrden() { if(!vacio()) preOrden(this.raiz);
     * System.out.println(); }
     */
    private void preOrden(Nodo aux) {
        if (aux != null) {
            System.out.print(aux.dato + " ");
            preOrden(aux.izq);
            preOrden(aux.der);
        }
    }

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



    /*
     * public void insertar(int dato) { if(raiz==null) //insertar else
     * insertar(dato, ref) }
     *
     * private void insertar(int dato, Nodo ref) { }
     */

}
