import java.util.*;

public class frasePalindroma {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		String	cad, aux;
		
		while( S.hasNext()) {
			cad = S.nextLine().toUpperCase();
			aux ="";
	
			for(int i=0 ; i<cad.length() ; i++) {
				if( (int)cad.charAt(i) >= 65 && (int)cad.charAt(i) <= 90 ) {
					aux += cad.charAt(i);
				}
			}
			cad = aux;
			aux = new StringBuilder(aux).reverse().toString().toUpperCase();

			if( cad.equals(aux) ) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
			
		}
	}
}
