package ejercicios_coj;

import java.util.*;

public class Coj_2091 {
public static void main(String[] args){
	
	Scanner S = new Scanner(System.in);
	
	int i , cont ;
	char[] pal ;

	int c = S.nextInt();
	 while( c>0 ){

		cont = 1;
		String s = S.next();
		pal = s.toCharArray();
		
		Arrays.sort(pal);
		
		for( i=0 ; i<pal.length - 1 ; i++ ){
			if( pal[i] != pal[i+1]){
				cont++;
			}
		}
		System.out.println(cont);

	c--;
	}
	
	S.close();
}
}