package paquetepro;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {

		//SIRVE PARA ENTEROS , STRINES , CHAR , OBETOS  :D ....
		final int DOS_NUMER = 3; // definir constante ____constante
		System.out.println(DOS_NUMER);

		List<String> numeros = new ArrayList<String>();

		numeros.add("gg");
		numeros.add("hola");
		numeros.add("mundo");
		numeros.add("como");
		numeros.add("estas");
		numeros.add("?");

		System.out.println("tamaño "+numeros.size()); //Tamaño de la list
		System.out.println(numeros.get(2)+"\n"); //mostrar el contenido de una posiion en la lista
		numeros.remove(0);  // elimina una posiion de una lista
		System.out.println("nuevo tamaño "+numeros.size());

		for( String a : numeros  ){
			System.out.println(a);
		}

		System.out.println("\n");

		for( String a : numeros  ){
			System.out.println(a.contains("mundo"));// busca concidencias en un arreglo
		}

	}

}
