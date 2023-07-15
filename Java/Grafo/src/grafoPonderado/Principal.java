package grafoPonderado;

public class Principal {
	public static void main(String[] args) {
		GrafoPonderado g = new GrafoPonderado(10);
		
		g.insertarNodo("A");
		g.insertarNodo("B");
		g.insertarNodo("C");
		g.insertarNodo("D");
		g.insertarNodo("E");
		g.insertarNodo("F");
		g.insertarNodo("G");
		
		g.insertarArco("A", "B", 10);
		g.insertarArco("A", "D", 25);
		g.insertarArco("A", "C", 20);
		g.insertarArco("B", "F", 35);
		g.insertarArco("B", "D", 10);
		g.insertarArco("D", "F", 20);
		g.insertarArco("D", "E", 15);
		g.insertarArco("D", "C", 7);
		g.insertarArco("C", "E", 30);
		g.insertarArco("F", "E", 10);
		g.insertarArco("F", "G", 25);
		g.insertarArco("E", "G", 20);
			
		
		g.matrizDeRecorridoOP();
		g.matrizDistanciaOP();
		
		g.mostrarMatrizDistancia();
		g.mostrarMatrizRecorrido();
		
		System.out.println(g.encuentraCamino("G", "A"));
		g.encuentraDistancia("G", "A");
		System.out.println(g.encuentraCamino("A", "E"));
		g.encuentraDistancia("A", "E");
		System.out.println(g.encuentraCamino("F", "C"));
		g.encuentraDistancia("C", "F");
		System.out.println(g.encuentraCamino("B", "C"));
		g.encuentraDistancia("B", "C");
		
		
		
		
		
		
				
	}
}



















