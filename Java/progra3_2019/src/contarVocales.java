import java.util.Scanner;

public class contarVocales {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		String cad ,cad2 ;
		int c = 0;
		
		while( S.hasNext() ) { /// lee asta final de archivo
			cad = S.nextLine();
			cad2 = cad.toLowerCase();
			for( char car  : cad2.toCharArray() ) {
				if( car == 'a' || car == 'e' || car == 'i' || car == 'o' || car == 'u' ) {
					c++;
				}
			}
			System.out.println(c);
			c = 0;
		}
	}
}
