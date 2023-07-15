
import java.util.*;

public class Ejer_2 {

	public static void main(String[] args) {
		boolean correcto = false;
		while (!correcto) {
			try {
				Scanner tec = new Scanner(System.in);
				System.out.print("N° de notas: ");
				int[] vec = new int[4];
				int n = tec.nextInt();
				try {
					for (int i = 0; i < n; i++)
						vec[i] = leer();
					correcto = true;
				} catch (NotaFueraDeRangoException e) {
					System.out.println(e.getMessage());
				}
			} catch (Exception e) {
				System.out.println("No cometa errores!");
				System.out.println("Ingrese todos los datos nuevamente");
			}
		}
		System.out.println("Por fin ...");
	}

	public static int leer() throws NotaFueraDeRangoException {
		Scanner tec = new Scanner(System.in);
		int n = tec.nextInt();
		if (n < 0 || n > 100) {
			throw new NotaFueraDeRangoException("La nota debe estar entre 0 y 100");
		}
		return n;
	}

}
