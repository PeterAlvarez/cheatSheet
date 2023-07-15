package Lista_con_nodos;

public class Principal {
	public static void main(String[] args) {

		ListaEnlazada lista = new ListaEnlazada();

		lista.insertarUltimo("1");
		lista.insertarUltimo("2");
		lista.insertarUltimo("3");
		lista.insertarUltimo("4");
		lista.insertarUltimo("5");
		lista.insertarUltimo("6");
		lista.insertarUltimo("7");
		lista.insertarInicio("0");
		lista.Visualizar();

		lista.eliminaUltimo();
		lista.eliminaPrimero();
		lista.Visualizar();

		System.out.println(lista.devolverPrimero());
		System.out.println(lista.devolverUltimo());
		lista.Visualizar();

		System.out.println(lista.contarElementos());
		System.out.println(lista.devolverPocicion(5));

		lista.intruduceDato("hola", 0);
		lista.Visualizar();


		lista.eliminaPos(0);
		lista.Visualizar();

		lista.modificarDato("Tux", 3);
		lista.Visualizar();
		
		System.out.println(lista.buscar("Tux"));
		

	}
}
