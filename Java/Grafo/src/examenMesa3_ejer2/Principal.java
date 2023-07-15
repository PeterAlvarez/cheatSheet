package examenMesa3_ejer2;

public class Principal {
    public static void main(String[] args) {

        
    	GrafoNPND grafo = new GrafoNPND(7);

        grafo.insertarNodo("A");
        grafo.insertarNodo("B");
        grafo.insertarNodo("C");
        grafo.insertarNodo("D");
        grafo.insertarNodo("E");
        grafo.insertarNodo("F");
    
        
        grafo.insertarArco("A", "E");
        grafo.insertarArco("A", "D");
        grafo.insertarArco("F", "D");
        grafo.insertarArco("B", "F");

        System.out.println(grafo.nodosAdyascentes("A"));

        

        
        
        
        
//        grafo.insertarArco( "A" , "B" );
//        grafo.insertarArco( "B" , "C" );
//        grafo.insertarArco( "B" , "D" );
//        grafo.insertarArco( "B" , "E" );
//        grafo.insertarArco( "A" , "B" );
//        grafo.insertarArco( "C" , "F" );
//        grafo.insertarArco( "D" , "E" );
        
        
        
//        V={A, B, C, D, E, F}
//        Aristas={(A, B), (B, C), (B, D), (B, E), (C, F), (D, E)}
        
//        System.out.println(grafo.nodosDeGradoN(2));
        
//        System.out.println(grafo.toString());
//        grafo.eliminarNodosTerminales();
//        System.out.println(grafo.toString());
        
        
        
//        System.out.println(grafo.amplitud("A"));

        
        
        
        
        
        
////      EJERCICIOS 2 return un String
//        System.out.println(grafo.nodosDeGradoN(2));
//        
////      EJERCICIOS 1 usamos ToString para mostrar vertices
//        grafo.eliminarNodosTerminales();
//        System.out.println(grafo.toString());
        
    }
}