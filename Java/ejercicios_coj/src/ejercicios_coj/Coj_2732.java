package ejercicios_coj;

import java.util.*;
public class Coj_2732 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	
	char[] cad = new char[100];
	int i , c ;
	
	c= S.nextInt();

	while(c>0){
		String s = S.next();
		cad = s.toCharArray();
	
		for( i=0 ; i<cad.length ; i++ ){
			if( cad[i] < 123 && cad[i] > 96){
				cad[i]  -= 32 ;
				System.out.print(cad[i]);
			}else{
				cad[i] +=32;
				System.out.print(cad[i]);
			}
			
		}
		System.out.println();
	c--;
	}
	S.close();
}
}
