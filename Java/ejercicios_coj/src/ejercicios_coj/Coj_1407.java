package ejercicios_coj;

import java.util.Scanner;
import java.math.BigInteger;

public class Coj_1407 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	
		
		BigInteger sum , dif , N , K ;
		BigInteger dos = new BigInteger("2");
		
		for(int i=0;i<10;i++){
		sum = S.nextBigInteger();
		dif = S.nextBigInteger();
		
		//Scanner p = new Scanner(System.in);
		//String cad = p.nextLine();
		
		N = (sum.subtract(dif)).divide(dos);
		K = N.add(dif);
		
		
		System.out.println(K);
		System.out.println(N);
		//System.out.println("[and 9 test cases more]");
		}
	S.close();
}
}
