package ejercicios_Uri;

import java.util.*;
import java.math.*;

public class Uri_1065 {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	int i , cont=0 ;
	BigInteger[] num = new BigInteger[5];
	BigInteger dos = new BigInteger("2");
	
	for( i=0 ; i<5 ; i++ ){
		num[i] = S.nextBigInteger();
		if(num[i].mod(dos).equals(BigInteger.ZERO)){
			cont++;
		}
	}
	System.out.println(cont+" valores pares");
	S.close();
}
}