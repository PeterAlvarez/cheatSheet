
public class Principal {
    public static void main(String[] args) {

        
    	GrafoNPND grafo = new GrafoNPND(7);

        grafo.insertarNodo("A");
        grafo.insertarNodo("B");
        grafo.insertarNodo("C");
        grafo.insertarNodo("D");
        grafo.insertarNodo("E");
        grafo.insertarNodo("R");


        grafo.insertarArco( "A" , "B" );
        grafo.insertarArco( "C" , "D" );
        grafo.insertarArco( "B" , "C" );
        grafo.insertarArco( "E" , "C" );
//      grafo.insertarArco( "D" , "E" );

//      System.out.println(grafo.nodosAdyascentes("A"));
        System.out.println(grafo.toString());

////        System.err.println(grafo.nodosAdyascentes("B"));
//      System.out.println(grafo.amplitud("C"));

//      System.out.println(grafo.nodosAdyascentes("C"));
//      grafo.conexo();
//      System.out.println(grafo.amplitud("C"));
        System.out.println(grafo.conexo());
//      System.out.println(grafo.getNodosTotal());
    }
}