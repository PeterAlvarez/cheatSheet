package ejercicios_coj;

import java.util.*;

public class Coj_2784 {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	
	int c , i ;
	
	c = S.nextInt();
	int[] g = new int[c];
	for( i=0 ; i<c ; i++ ){
		//String s = S.next();
		g[i] = S.nextInt();
	}
	Arrays.sort(g);
	
	System.out.print(g[c-1]);
	
	for( i=0 ; i<c-1 ; i++ ){
		System.out.print(" "+g[i]);
	}
	
	
S.close();	
}
}
