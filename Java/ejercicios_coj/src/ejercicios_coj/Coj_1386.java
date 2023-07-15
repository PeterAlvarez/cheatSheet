package ejercicios_coj;

import java.util.*;
public class Coj_1386 {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	
	int a , b , i , j ;
	
	a = S.nextInt();
	b = S.nextInt();
	
	for( i=1  ;i<=a ; i++ ){
		if(a%i==0){
			for( j=1 ; j<=b ; j++ ){
				if(b%j==0){
				System.out.println( i+" "+j );
				}
			}
		}
	}
	
	S.close();
}
}