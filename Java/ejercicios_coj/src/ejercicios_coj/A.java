package ejercicios_coj;

import java.util.Scanner;

public class A {
	public static void main(String[] args){

		int a , b , c ;
		String res = "";
		Scanner S = new Scanner(System.in);

		while( true ){
			a = S.nextInt();
			if(a==0) break;

			b = S.nextInt();
			c = S.nextInt();
			if( a*a == b*b + c*c ) res = "right";
			else if( b*b == a*a + c*c ) res = "right";
			else if( c*c == a*a + b*b ) res = "right";
			else res = "wrong";
            System.out.println( res );
		}
		S.close();
	}
}


