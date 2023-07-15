package ejercicios_coj;

import java.util.*;
public class Coj_1808 {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	
	char[] cad1;
	char[] cad2;
	int i , cont ;

	while( true ){
		
		String c1 = S.next();
		cad1 = c1.toCharArray();
		String X = "X";
		if( cad1[0] == X.charAt(0)){
			break;
		}
		
		
		String c2 = S.next();
		cad2 = c2.toCharArray();
		cont = 0;
		for(i=0;i<cad1.length;i++){
			if( cad1[i] != cad2[i] ){
				cont++;
			}
		}
		System.out.println("Hamming distance is "+cont+".");
	}

	S.close();
}
}