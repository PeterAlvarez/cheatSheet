package ejercicios_coj;

import java.util.*;
public class Coj_1136 {
public static void main(String[] args){

int a , b , i , t , j , cont ;

Scanner S = new Scanner(System.in);

t = S.nextInt();
while( t>0 ){
	a = S.nextInt();
	b = S.nextInt();
	
	for( i=a ; i<=b ; i++ ){
		if(i>1){
			if(is_prime(i)==1){
				System.out.println(i);
			}
		}
	}
	System.out.println();
t--;
}


}
	public static int is_prime(int p) {
		
	for( int n=2; n<=(int) Math.sqrt(p); n++){
	    
		if ( p%n == 0 ){
	          return 0;
	    }
	}
	return 1;
	}

}

