package Progra_1;

import java.util.Scanner;
import java.text.DecimalFormat;;

public class Ejercicio_1 {
	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int  aux=0 ;
		double con=0;
		
		while( S.hasNext() ){
			
			int nota = S.nextByte();
			
			if( nota < 0 ) break;
			
			if( nota < 101 ){
				aux = sum( aux , nota );
				con++;
			}
		}
		System.out.println( "El promedio es : "+df.format( aux/con ) );
		S.close();
	}
	
	public static int sum( int a , int b ){ //recursiva
		
		if( a == 0 ){
			return b;
		}else if( b == 0 ){
			return a;
		}else{
			return 1 + sum( a , b-1 );
		}
	}
	
}
