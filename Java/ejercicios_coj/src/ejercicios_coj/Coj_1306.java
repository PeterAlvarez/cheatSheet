package ejercicios_coj;

import java.util.Scanner;
import java.math.BigInteger;

public class Coj_1306 {
public static void main(String[] args){
	
	int c ;
	
	Scanner S = new Scanner(System.in);
	BigInteger cuatro = new BigInteger("4");
	
	c = S.nextInt();
	
	while( c>0 ){
		BigInteger num = new BigInteger(S.next());
		if(num.mod(cuatro).equals(BigInteger.ZERO)){
			System.out.println("YES");
		}
		else
			System.out.println("NO");
	c--;
	}
}
}
