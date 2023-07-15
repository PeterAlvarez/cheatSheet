// Programar un algoritmo recursivo que
//permita multiplicar los elementos de un vector.

import java.util.Scanner;

public class Ejer_7 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		int [] cad = { 123 ,  2 , 3 , 6};
		
		System.out.println( mul( cad , cad.length-1 ) );
		
		S.close();
	}
	public static int mul( int[] n , int m ){
		
		if( m < 0 ){
			return 1;
		}else{
			return mul( n , m-1 ) * n[m];
		}		
	}
}
