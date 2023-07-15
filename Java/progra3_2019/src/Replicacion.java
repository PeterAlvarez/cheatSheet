import java.util.Scanner;

public class Replicacion {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		String numero;
		while(S.hasNext()) {
			numero = S.next();
			if ( numero.charAt(0)=='-' ) break;
			System.out.println(numero+" "+numero+""+numero+" "+numero+""+numero+""+numero);
		}
	}
}