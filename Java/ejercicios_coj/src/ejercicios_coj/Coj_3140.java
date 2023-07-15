package ejercicios_coj;

import java.util.*;
public class Coj_3140 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	
	int c , i ;
	
	c = S.nextInt();
	int[] cad = new int[c];
	
	for( i=0 ; i<c ; i++ ){
		cad[i] = S.nextInt();
	}
	Arrays.sort(cad);
	for( i=0 ; i<c ; i++ ){
		System.out.println(cad[i]);
	}
	S.close();
}
}
