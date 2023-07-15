package ejercicios_coj;

import java.util.*;

public class Coj_2789 {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	
	char[] cad1 = new char[1000];
	
	int i ;
	
	String s = S.next();
	cad1 = s.toCharArray();
	
	Arrays.sort(cad1);
	
	System.out.print(cad1[cad1.length/2]);
	
	for( i=cad1.length/2 +1 ; i<cad1.length ; i++ ){
		System.out.print("+"+cad1[i]);
	}
	S.close();
}
}