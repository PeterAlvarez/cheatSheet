package ejercicios_coj;

import java.util.*;

public class Coj_1004 {
public static void main(String[] args){
	
	Scanner S = new Scanner(System.in);
	
	int c , m , n ;
	
	c = S.nextInt();
	
	char[] dato={ 'R' , 'D' , 'L' , 'U' };
	
	while( c-->0 ){
	
		n  = S.nextInt();
		m = S.nextInt();
		if( n > m+1 ){
			n=m+1;
		}else if(m>n){
			m=n;
		}
		System.out.println(dato[(n+m-2)%4]);
	}
	
	
}
}
