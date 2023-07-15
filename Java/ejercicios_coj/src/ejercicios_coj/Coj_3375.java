package ejercicios_coj;

import java.util.*;
public class Coj_3375 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	
	char[] cad1 = new char[101];
	char[] cad2 = new char[101];
	int i , cont , c ;
	
	c=S.nextInt();
	
	while( c>0 ){
		String s = S.next();
		String p = S.next();
		
		cad1 = s.toCharArray();
		cad2 = p.toCharArray();
		cont=0;
		for( i=0 ; i<cad1.length ; i++ ){
			if( cad1[i] != cad2[i] ){
				cont++;
			}
		}
		System.out.println(cont);
	c--;
	}
	S.close();
	
}
}
