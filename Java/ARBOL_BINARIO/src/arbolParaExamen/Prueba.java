package arbolParaExamen;

public class Prueba {
	public static void main(String[] args) {
		Arbol arbol=new Arbol();
		arbol.insertar(15);
		arbol.insertar(30);
		arbol.insertar(25);
		arbol.insertar(7);
		arbol.insertar(4);
		arbol.insertar(13);
		arbol.insertar(18);
		//arbolito.insertar(27);
		arbol.insertar(30);
		arbol.insertar(1);
		arbol.insertar(60);
		arbol.insertar(70);
		arbol.insertar(10);
		arbol.insertar(26);

		System.out.println(arbol.toString());

		arbol.preOrden();
		arbol.enOrden();
		arbol.postOrden();

		arbol.amplitud();

	}
}
