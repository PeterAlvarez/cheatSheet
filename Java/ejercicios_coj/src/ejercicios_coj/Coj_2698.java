package ejercicios_coj;

import java.util.*;

public class Coj_2698 {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	
	char[] cad;
	int i , suma=0;
	
	String s = S.next(); 
	cad = s.toCharArray();
	
	for( i=0 ; i<cad.length ; i++ ){
		suma += (cad[i]-65)+1;
	}
	System.out.println(suma);
	
	S.close();
}
}
