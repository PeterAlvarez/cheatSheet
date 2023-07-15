package ejercicios_coj;

import java.util.Scanner;
import java.math.BigInteger;
public class Coj_1888 {
	public static void main(String[] args){
		Scanner S = new Scanner( System.in );
		BigInteger uno = new BigInteger( "-1" );
		while(S.hasNext()){
			BigInteger num = S.nextBigInteger();
				if( num.compareTo( BigInteger.ZERO ) < 0 ){
					num = num.multiply( uno );
					evil( num );
				}else
					evil( num );
		}
		S.close();
	}
	
	public static void evil( BigInteger num ){
		int co=0 ;
		BigInteger sum = BigInteger.ZERO;
		BigInteger six = new BigInteger( "6" );
		if( num.mod( six ).equals( BigInteger.ZERO ) ){
			while( num.compareTo( BigInteger.ZERO ) > 0 ){
				if( num.mod( BigInteger.TEN ).equals( six ) ){
					co++;
				}
				sum = sum.add( num.mod( BigInteger.TEN ) );
				num = num.divide( BigInteger.TEN );
			}
			
			if( ( co>0 && sum.mod( six ).equals( BigInteger.ZERO ) ) ){
				System.out.println( "EVIL" );
			}else{
				System.out.println( "GOOD" );
			}
		}else{
			System.out.println( "GOOD" );
		}
	}
}