package ejercicios_coj;

import java.util.Scanner;

public class Coj_3080 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	int b , c , a ;
	int casos=S.nextInt();
	while( casos>0 ){
		
		a = S.nextInt();
		String d=S.next();
		
		if(d.contains( "+" )){
			b=S.nextInt();
			d=S.next();
			c=S.nextInt();
			if( a+b == c )
				System.out.println( "Yes" );
			else
				System.out.println( "No" );
		}else if(d.contains( "-" )){
			b=S.nextInt();
			d=S.next();
			c=S.nextInt();
			if( a-b == c )
				System.out.println( "Yes" );
			else
				System.out.println( "No" );
		}else if(d.contains( "*" )){
			b=S.nextInt();
			d=S.next();
			c=S.nextInt();
			if( a*b == c )
				System.out.println( "Yes" );
			else
				System.out.println( "No" );
		}else if(d.contains( "/" )){
			b = S.nextInt();
			d = S.next();
			c = S.nextInt();
			if(b==0)
				System.out.println( "No" );
			else if(a/b==c)
				System.out.println( "Yes" );
			else
				System.out.println( "No" );
		}
	casos--;
	}

	
	S.close();
}
}