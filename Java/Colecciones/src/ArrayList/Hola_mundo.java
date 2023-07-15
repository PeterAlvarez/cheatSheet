package ArrayList;

import java.util.ArrayList;

public class Hola_mundo {
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();

		lista.add("1");
		lista.add("2");
		lista.add("3");
		lista.add("4");
		lista.add("5");
		lista.add(0, "Inicio");
		// Añade el elemento al ArrayList
		lista.add("Elemento");

		// Añade el elemento al ArrayList en la posición 'n'
		lista.add(6, "Elemento 2");

		// Devuelve el elemento que esta en la posición '2' del ArrayList
		lista.get(2);

		// Comprueba se existe del elemento ('Elemento') que se le pasa como
		// parametro
		lista.contains("Elemento");

		// Devuelve la posición de la primera ocurrencia ('Elemento') en el
		// ArrayList
		lista.indexOf("Elemento");

		// Devuelve la posición de la última ocurrencia ('Elemento') en el
		// ArrayList
		lista.lastIndexOf("Elemento");

		// Borra el elemento de la posición '5' del ArrayList
		lista.remove(5);

		// Borra la primera ocurrencia del 'Elemento' que se le pasa como
		// parametro.
		lista.remove("Elemento");

		// Devuelve True si el ArrayList esta vacio. Sino Devuelve False
		lista.isEmpty();

		// Pasa el ArrayList a un Array
		Object[] array = lista.toArray();
		System.out.println(lista.toString());

		// Copiar un ArrayList
		ArrayList<String> listCopia = (ArrayList<String>) lista.clone();
		System.out.println("listacopia -->"+listCopia.toString());

		System.out.println("\nForeach\n");
		boolean ban = false;
		for (String i : lista){
			if(i.equals("3")){
				ban=true;
				break;
			}
		}

		System.out.println(ban+"\n");

		// Devuelve el numero de elementos del ArrayList
		System.out.println("tamanio es " + lista.size());

		// Borra todos los elementos de ArrayList
		lista.clear();
	}
}
