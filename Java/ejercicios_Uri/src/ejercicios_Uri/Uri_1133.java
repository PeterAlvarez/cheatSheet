package ejercicios_Uri;
import java.util.Scanner;
public class Uri_1133 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	
	int x = S.nextInt();
	int y = S.nextInt();
	int aux = 0;
	if( x > y ){
		aux = y;
		y = x;
		x = aux;
	}
	
	for( int i=x+1 ; i<y ; i++ ){
		
		if( palomas( i ) == i ){
			System.out.println( i );
		}
	}
	
	S.close();
}
public static int palomas( int i ){
	
	if( i%5 == 3 || i%5 == 2 ){
		return i;
	}else{
		return 0;
	}
	
}
}
