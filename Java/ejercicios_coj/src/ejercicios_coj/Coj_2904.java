package ejercicios_coj;

import java.util.*;
import java.math.BigInteger;
public class Coj_2904 {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	
	int c , i ;
	
	c = S.nextInt();
	BigInteger num , suma = BigInteger.ZERO;
	
	for( i=0 ; i<c ; i++ ){
		num = S.nextBigInteger();
		suma = suma.add(num);
	}
	System.out.println(suma);
	
	
	
	
	
	S.close();
}
}
