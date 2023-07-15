/*
 Implementa una funci´on recursiva que devuelva la suma de los d´ıgitos
de un n´umero natural, que se le pasa por par´ametro.
*/
import java.util.Scanner;
public class Ejer_1 {
public static void main( String[] args ) {
	
	Scanner S = new Scanner( System.in) ;
	while( S.hasNext() ){
		int num = S.nextInt();
		System.out.println( sum( num ) );
	}
	S.close();//finaliza con final de archivo
}
public static int sum( int  n ){ ///funcion recursiva	

	if( n == 0 ){
		return 0;
	}else{
		return sum( n/10 ) + ( n%10 );
	}
}
}