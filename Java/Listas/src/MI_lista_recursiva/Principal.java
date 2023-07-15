package MI_lista_recursiva;

public class Principal {
	public static void main(String[] args) {
		Lista lista = new Lista();

		lista.ingresarFinal("1");
		lista.ingresarFinal("2");
		lista.ingresarFinal("3");
		lista.ingresarFinal("4");
		lista.insertaInicio("0");
		lista.insertaInicio("-1");
		lista.insertar("pres", 3);
		lista.mostrar();
		System.out.println();
		lista.eliminarDato("3");
		lista.mostrar();
		System.out.println();
		System.out.println(lista.buscar("pre"));
		System.out.println(lista.obtenerDato(9));
		System.out.println(lista.tamanio());
		lista.modificarPos("x", 12);
		lista.mostrar();

	}
}
