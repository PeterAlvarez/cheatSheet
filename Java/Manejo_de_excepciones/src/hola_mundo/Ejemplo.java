package hola_mundo;

import java.util.*;

public class Ejemplo {
	public static void main(String[] args) {

		ingresarNotas();
		System.out.println("Finalizacion de notas correctamente");
	}

	public static void ingresarNotas() {
		boolean correcto = true;
		while (correcto) {
			try {
				Scanner in = new Scanner(System.in);
				int[] vec = new int[3];
				System.out.println("N° de notas : ");
				int n = in.nextInt();
				correcto = false;
				for (int i = 0; i < n; i++)
					vec[i] = in.nextInt();

			} catch (InputMismatchException e) {//error de entrada de tipos de dats
				System.out.println("solo debe ingresar numeros");
				correcto = true;
			} catch (ArrayIndexOutOfBoundsException e) {//error de entrada de desbordamiento de pila
				System.out.println("no debe excederse de tres notas");
				correcto = true;
			}
		}
		
	}
}
