package Lista_Class;

import java.util.Scanner;

public class ListaAleatoria {
	public static void main(String[] a) {
		Scanner S = new Scanner(System.in);
		Lista lista = new Lista();
		System.out.println("Lista\n");

		int opc;
		while (true) {
			System.out.println(
					"1. Insertar un elemento nuevo al principio \n" + "2. Insertar un elemento nuevo al final\n"
							+ "3. Insertar dato en una poscicion \n" + "4. Buscar datos \n"
							+ "5. Mostrar tamanio de la lista \n" + "6. Mostrar lista ordenara de Datos \n"
							+ "7. Mostrar los elementos de la lista\n" + "8. Salir\n" + "Ingrese su opcion : ");
			opc = S.nextInt();
			switch (opc) {
			case 1:
				System.out.println("Ingrese dato:");
				lista.insertarCabezaLista(S.nextInt());
				break;

			case 2:
				System.out.println("Ingrese dato:");
				lista.insertarFinal(S.nextInt());
				break;

			case 3:
				System.out.println("Ingrese... dato y poscicion");
				lista.insetarPocicion(S.nextInt(), S.nextInt());
				break;
			case 4:
				System.out.println("Ingrese dato a buscar : \n");
				lista.buscarDato(S.nextInt());
				break;
			case 5:
				System.out.println("El tamanio de la lista es : " + lista.tamanio() + "\n");
				break;
			case 6:
				System.out.println("Lista ordenada de datos");
				lista.ordenarDatos();
				break;
			case 7:
				System.out.println("***Datos de la Lista***");
				lista.visualizar();
				break;
			case 8:
				System.out.println("*** PROGRAMA FINALIZADO ***");
				System.exit(0);
			default:
				System.out.println("Elija una opcion valida\n");
			}
		}
	}
}