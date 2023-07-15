package ejercicios_coj;

import java.util.Scanner;
import java.math.BigInteger;

public class Coj_1288 {
public static void main(String[] args){
	
	int c;
	
	Scanner S = new Scanner(System.in);
	
	c = S.nextInt();
	BigInteger seis = new BigInteger("6");

	while(c>0){
		
		BigInteger num = new BigInteger(S.next());
		
		if(num.mod(seis).equals(BigInteger.ZERO)){
			System.out.println("YES");
		}
		else
			System.out.println("NO");
		c--;
	}
	S.close();
}
}
