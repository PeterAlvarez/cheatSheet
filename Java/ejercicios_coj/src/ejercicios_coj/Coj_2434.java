package ejercicios_coj;

import java.util.Scanner;
import java.math.BigInteger;

public class Coj_2434 {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	BigInteger i , j ;
	
	while( true ){
		BigInteger num = S.nextBigInteger();
		BigInteger mul = BigInteger.ONE;
		if(num.equals(BigInteger.ZERO)) break;
		
		for( i=BigInteger.valueOf(1) ; i.compareTo(num)<=0
				; i = i.add(BigInteger.ONE)){
			int cont=0;
			for( j=BigInteger.valueOf(1);j.compareTo(i)<=0
				; j = j.add(BigInteger.ONE)){
				if((i.mod(j)).equals(BigInteger.ZERO)){
					cont++;
					if( cont>2 ) break;
				}
			}
			if(cont==2){
				mul=mul.multiply(i);
			}
		}
		System.out.println(mul);
	}
}
}
