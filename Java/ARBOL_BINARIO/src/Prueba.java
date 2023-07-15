
public class Prueba {
    public static void main(String[] args) {
        Arbol arbolito=new Arbol();
        arbolito.insertar(10);
        arbolito.insertar(5);
        arbolito.insertar(7);
        arbolito.insertar(1);
        arbolito.insertar(12);
        arbolito.insertar(11);
        arbolito.enOrden();
        arbolito.postOrden();
        arbolito.amplitud();
        System.out.println( arbolito.vacio() );
    }
}






















