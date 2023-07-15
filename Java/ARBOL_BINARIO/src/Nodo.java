public class Nodo {
    private int datos;
    private Nodo Isquierdo;
    private Nodo Derecho;
    private int rep;

    public Nodo() {//constructor por defecto que proporcioina java
        this.datos = 0; // piti
    }

    public Nodo(int dato) {
        this.datos=dato;
        Isquierdo=null;
        Derecho=null;
        rep=1;
    }

    public int getDatos() {
        return datos;
    }

    public void setDatos(int datos) {
        this.datos = datos;
    }

    public Nodo getIsquierdo() {
        return Isquierdo;
    }

    public void setIsquierdo(Nodo isquierdo) {
        Isquierdo = isquierdo;
    }

    public Nodo getDerecho() {
        return Derecho;
    }

    public void setDerecho(Nodo derecho) {
        Derecho = derecho;
    }

}

