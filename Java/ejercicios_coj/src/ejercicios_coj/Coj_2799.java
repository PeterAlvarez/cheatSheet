package ejercicios_coj;

import java.util.*;
public class Coj_2799 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	
	double a , b , c ;

	a =S.nextDouble();
	b =S.nextDouble();
	c =S.nextDouble();
	
	if( a+b+c==180 ){
		
		if( ( a==b ) && ( a==c ) ){
			System.out.println("Equilateral");
		}else if( a!=b && b!=c && a!=c)  {
			System.out.println("Scalene");
		}else if ( ( a==b && a!=c ) || ( a==c && a!=b ) || ( b==c && b!=a ) ){
			System.out.println("Isosceles");
		}
		
	}else{
		System.out.println("Error");
	}
	S.close();
}
}
