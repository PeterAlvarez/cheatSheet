package ejercicios_coj;

import java.math.BigInteger;
import java.util.Scanner;

public class Coj_1102 {
public static void main(String[] args){

	
	Scanner S = new Scanner(System.in);
	BigInteger once = new BigInteger("11");
	
	while( true ){
		BigInteger num = new BigInteger(S.next());
		if(num.equals(BigInteger.ZERO))
			break;
		if(num.mod(once).equals(BigInteger.ZERO))
			System.out.println(num+ " is a multiple of 11.");
		else
			System.out.println(num+ " is not a multiple of 11.");
		
	}
}
}

/*
String num = S.next();
BigInteger n = new BigInteger(num);
*/