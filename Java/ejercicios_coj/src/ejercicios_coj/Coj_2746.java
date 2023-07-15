package ejercicios_coj;

import java.util.*;
public class Coj_2746 {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);

	int i , mika=0 , boga=0 ;
	
	char[] cad = new char[1001];
	
	String a = S.next();
	
	String A = "A";
	String E = "E";
	String I = "I";
	String O = "O";
	String U = "U";
	
	
	cad = a.toCharArray();
	
	for( i=0 ; i<cad.length ; i++ ){
		if( (cad[i] == A.charAt(0)) || (cad[i] == E.charAt(0)) || (cad[i] == I.charAt(0)) || (cad[i] == O.charAt(0)) || (cad[i] == U.charAt(0)) ){
			mika++;
		}else{
			boga++;
		}
		
	}
	System.out.println(mika+" "+boga);
	S.close();
}
}
