package ejercicios_coj;

import java.util.Scanner;
import java.math.BigInteger;

public class Coj_1293 {
public static void main(String[] args){
	
	int num;
	Scanner S = new Scanner(System.in);
	num = S.nextInt();
	
	BigInteger dos = new BigInteger("2");
	
	BigInteger res = dos.pow(num);
	
	System.out.println(res);
	
	
}
}
