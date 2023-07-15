package ejercicios_coj;

import java.util.Scanner;
import java.math.BigInteger;

public class Coj_1595 {
	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		BigInteger nueve = new BigInteger("9");
		while(true){
			BigInteger num = S.nextBigInteger();
			BigInteger aux=num;
			if( aux.equals(BigInteger.ZERO))break;
			int i=0;
			if (num.mod(nueve).equals(BigInteger.ZERO)) {
				i++;
				while(true){
					if(sumOfDigit(num).compareTo(BigInteger.TEN)<0) break;
					
					if(sumOfDigit(num).mod(nueve).equals(BigInteger.ZERO)){
						num=sumOfDigit(num);
						i++;
					}else{
						break;
					}
				}
				
				System.out.println(aux+" is a multiple of 9 and has 9-degree "+i+".");
			} else {
				System.out.println(num+" is not a multiple of 9." );
			}
		}
		S.close();

	}
	
	public static BigInteger sumOfDigit(BigInteger num){
		BigInteger sum = BigInteger.ZERO;
		while( num.compareTo(BigInteger.ZERO)>0 ){
			sum=sum.add(num.mod(BigInteger.TEN));
			num=num.divide(BigInteger.TEN);
		}
		return sum;
		
	}
}


