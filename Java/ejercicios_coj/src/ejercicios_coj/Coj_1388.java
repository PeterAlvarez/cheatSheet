package ejercicios_coj;

import java.math.BigInteger;
import java.util.*;

public class Coj_1388 {	
public static void main(String[] args){
 	int [] x = new int[4];
	int b , e , c ;
	
	Scanner S = new Scanner(System.in);
	
		c = S.nextInt();	
	
	while( c>0 ){
		b = S.nextInt();	
		e = S.nextInt();	
		
			if( e == 0 ){
				System.out.println("1");
			}else{
				
				x[1] = b;
				x[2] = b*b;
				x[3] = b*b*b;
				x[0] = b*b*b*b;
				
				System.out.println(x[e%4]%10);
			}
		
	c--;
	}
}
}
/*
public static void main(String[] args){
	
	int c;
	BigInteger b , res , a ;
	
	Scanner S = new Scanner(System.in);
	
	c = S.nextInt();
	
	while(c>0){
		
		b = new BigInteger(S.next());
		a = new BigInteger(S.next());
		
		res = b.modPow( a , BigInteger.TEN);
		
		System.out.println(res);
	}
	
	S.close();
}
 	
 */
