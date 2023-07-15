package ejercicios_coj;

import java.util.*;
public class Coj_2148 {
public static void main(String[] args){
	
	int a , b , c , t ;
	
	Scanner S = new Scanner(System.in);
	
	
	t = S.nextInt();
	
	while( t>0 ){
		a = S.nextInt();
		b = S.nextInt();
		c = S.nextInt();
		
		if( b*b >= 4*(a)*(c) ){
			System.out.println("SI");
		}else{
			System.out.println("NO");
		}
		t--;
	}
	S.close();
	
}
}
