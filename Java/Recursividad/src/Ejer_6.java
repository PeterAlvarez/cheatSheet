//Ejercicio 7. Programar un algoritmo recursivo
//que permita sumar los elementos de un vector.

import java.util.Scanner;

public class Ejer_6 {
public static void main(String[] args) {
	Scanner S =new Scanner(System.in);

	int[] cad = { 6 , 2 , 3 , 4 , 5 , 2 };
	
	
	
	System.out.println( sum( cad , 5 ) );
	
	S.close();
}
public static int sum( int[] n , int  t){
	
	if( t < 0 ){
		return 0;
	}else{
		return sum( n , t-1 ) + n[t];
	}
	
	
}
}
