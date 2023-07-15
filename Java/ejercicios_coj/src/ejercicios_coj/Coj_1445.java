package ejercicios_coj;

import java.util.*;
public class Coj_1445 {
public static void main(String[] args){
	int a , b , c ;
	
	Scanner S = new Scanner(System.in);
	
	while( true ){
		a = S.nextInt();
		b = S.nextInt();
		c = S.nextInt();
		
		if(a==0 && b==0 && c==0){
			break;
		}else if( b-a == c - b){
			System.out.println("AP "+(c+(b-a)));
			}else{
				System.out.println("GP "+((b/a)*c));
			}
	}
	S.close();
}
}
