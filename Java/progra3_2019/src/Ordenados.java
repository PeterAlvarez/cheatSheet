import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class Ordenados {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		while(true) {
			String[] entrada = S.nextLine().split(" ");
			if(entrada[0].equals("FIN")) break;
			
			int[] numeros = new int[entrada.length] , asc = new int[entrada.length],
					  des = new int[entrada.length];
			
			int cDes=0 ,cAsc=0;
			boolean iguales=true;
			
			
			for( int i=0 ; i<entrada.length ; i++) {
				numeros[i] = asc[i] = Integer.parseInt(entrada[i]);			
			}
			
			Arrays.sort(asc);//ascendentemente
			
			for(int i=asc.length-1, j=0 ; i>=0 ; i--, j++) { // descendente
				des[j]=asc[i];
			}
			
			for(int i=0 ; i<numeros.length ; i++) {
				if( asc[i]==numeros[i] ) cAsc++;
				if( des[i]==numeros[i] ) cDes++;
			}
			
			for(int i=0 ; i<numeros.length-1 ; i++) {
				if(numeros[i]!=numeros[i+1])  iguales = false;
			}
			
			if(iguales) 
				System.out.println("Iguales");			
			else if( cAsc == numeros.length )
				System.out.println("Ascendente");
			else if( cDes == numeros.length ) 
				System.out.println("Descendente");
			else
				System.out.println("Desordenados");
		}

	}
}
