package ejercicios_coj;

import java.util.Scanner;
import java.math.BigInteger;
public class Coj_1573 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int c = S.nextInt();
		
		while(c>0){			
			String cad = S.next();
	        BigInteger num = new BigInteger( cad , 16 );
	        suma( num );
	    c--;
		}
		
		S.close();
	}
	public static void suma(BigInteger num){
		
		BigInteger sum = BigInteger.ZERO;
		BigInteger dos =new BigInteger("2");
		
		sum =( num.multiply( num.add( BigInteger.ONE ) ).divide( dos ) );
		
		if( sum.mod( num ).equals( BigInteger.ZERO ) ){
			System.out.println( "YES" );
		}else{
			System.out.println( "NO" );
		}
	}
}
