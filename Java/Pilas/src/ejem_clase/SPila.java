package ejem_clase;

import java.util.Scanner;

/**
 * @author maker
 *
 */
public class SPila {
	int[] PILA;
	int CIMA;
	int MAX;
	Scanner tec = new Scanner(System.in);

	// -- CUANDO NO SE LE ASIGNA EL TAMAÑO MAXIMO
	public SPila() {
		this.CIMA = 0;
		this.MAX = 100;
		this.PILA = new int[this.MAX + 1];
	}

	// -- CUANDO SE LE ASIGNA EL TAMAÑO MAXIMO
	public SPila(int MAX) {
		this.CIMA = 0;
		this.MAX = MAX;
		this.PILA = new int[this.MAX + 1];
	}

	public int GetCIMA() {
		return CIMA;
	}

	public void VaciarPila() {
		this.CIMA = 0;
	}

	public boolean IsPilaLlena() {
		if (this.MAX == this.CIMA) {
			return true;
		} else {
			return false;
		}
	}

	public boolean IsPilaVacia() {
		if (this.CIMA == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void InsertarPila() {

		if (IsPilaLlena()) {
			System.out.println("LA PILA ESTA LLENA");
		} else {
			int ITEM;
			System.out.println("INGRESE EL ITEM A AGREGAR :: ");
			ITEM = tec.nextInt();
			this.CIMA++;
			this.PILA[this.CIMA] = ITEM;

			System.out.println("EL ITEM " + ITEM + " SE INSERTO A LA PILA");
		}
	}

	public void EliminarPila() {
		if (this.IsPilaVacia()) {
			System.out.println("LA PILA ESTA VACIA");
		} else {
			int ITEM = this.PILA[this.CIMA];
			this.CIMA--;

			System.out.println("EL ITEM " + ITEM + " SE ELIMINO DE LA PILA");
		}
	}

	public void MostrarPila() {
		if (this.IsPilaVacia()) {
			System.out.println("LA PILA ESTÁ VACIA\n NO HAY DATOS QUE MOSTRAR");
		} else {
			int i;
			String MOSTRAR = "";

			for (i = 1; i <= this.CIMA; i++) {
				MOSTRAR = MOSTRAR + this.PILA[i] + "\n";
			}
			System.out.println("TOTAL ES : " + this.CIMA + "\n" + "LOS DATOS DE LA PILA SON : \n" + MOSTRAR);
		}
	}
}