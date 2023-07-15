
//Programar un algoritmo recursivo que permita invertir 
//un número. Ejemplo: Entrada: 123 Salida: 321
import java.util.Scanner;

public class Ejer_5 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);

		int num = S.nextInt();

		System.out.println(invertir(num, 0));

		S.close();
	}

	public static int invertir(int n, int acum) {
		if (n < 10) {
			return acum * 10 + n;
		} else {
			acum = acum * 10 + (n % 10);
			return invertir(n / 10, acum);
		}

	}
}
