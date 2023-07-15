package ARBOL;

public class Principal {
    public static void main(String[] args) {
        String hol="";
        Arbol A = new Arbol();
        A.insertaNodo(12);
        A.insertaNodo(8);
        A.insertaNodo(17);
        //A.insertaNodo(5);
        A.insertaNodo(9);
        A.insertaNodo(15);
        //A.insertaNodo(3);
        System.out.println("Recorrido PreOrden");
        A.PreOrden(A.Raiz);
        System.out.println();
        System.out.println("Recorrido inorden");
        A.inOrden(A.Raiz);
        System.out.println();
        System.out.print("Altura: ");
        System.out.println(A.Altura(A.Raiz));
        A.Buscar(A.Raiz, 3);
        System.out.println( parseInt( hol ) );
    }
}
