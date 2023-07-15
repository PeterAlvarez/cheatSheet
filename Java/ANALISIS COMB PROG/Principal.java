import java.util.ArrayList;
import java.util.Scanner;

public class Principal {


	public Principal() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		Combinatoria combinatoria = new Combinatoria();
		long m,n;

		do{
			System.out.print("Ingrese el valor de m:");
			m = entrada.nextLong();
			System.out.print("Ingrese el valor de n:");
			n = entrada.nextLong();
			if(n > m)
				System.out.println("El valor de 'n' no puede ser mayor que 'm'");
		}while(n > m);

		System.out.println("INGRESE LOS ELEMENTOS");

		String elementos[] = new String[(int)m];
		String cad_elementos = "";

		for (int i = 0; i < elementos.length; i++) {
			System.out.print("Elemento "+(i+1)+":");
			elementos[i] = entrada.next();
			cad_elementos = cad_elementos+elementos[i]+" ";
		}

		System.out.println("CASOS DE COMBINATORIA");
		System.out.println("1.- Variacion");
		System.out.println("2.- Variacion con repeticion");
		System.out.println("3.- Permutacion");
		System.out.println("4.- Permutacion con repeticion");
		System.out.println("5.- Permutacion circular");
		System.out.println("6.- Combinacion");
		System.out.println("7.- Combinacion con repeticion");
		System.out.println("SELECCIONE UNA OPCION");

		int opcion = entrada.nextInt();

		switch (opcion) {
			case 1: {
				System.out.println("La Variacion de "+m+" en "+n+" es: "+combinatoria.variacion(m, n));
				combinatoria.generarVariacion(elementos, m, n, "");
				break;
			}
			case 2: {
				System.out.println("La Variacion con repeticion de "+m+" en "+n+" es: "+combinatoria.variacionConRepeticion(m, n));
				combinatoria.generarVariacionConRepeticion(elementos, m, n, "");
				break;
			}
			case 3: {
				System.out.println("La Permutacion de "+n+" es: "+combinatoria.permutacion(n));
				combinatoria.generarPermutacion(elementos, n, n, "");
				break;
			}
			case 4: {
				combinatoria.permutacionConRepeticion(n);
				combinatoria.generarPermutacionConRepeticion(elementos, n, n, "", cad_elementos);
				break;
			}
			case 5: {
				System.out.println("La Permutacion circular de "+n+" es: "+combinatoria.permutacionCircular(n));
				combinatoria.generarPermutacionCircular(elementos, n, n-1, "");
				break;
			}
			case 6: {
				System.out.println("La Combinacion de "+m+" en "+n+" es: "+combinatoria.combinacion(m, n));
				combinatoria.generarCombinacion(elementos, m, n, "");
				break;
			}
			case 7: {
				System.out.println("La Combinacion con repeticion de "+m+" en "+n+" es: "+combinatoria.combinacionConRepeticion(m, n));
				combinatoria.generarCombinacionConRepeticion(elementos, m, n, "");
				break;
			}
			default: break;
		}

	}

}
