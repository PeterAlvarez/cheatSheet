package ejercicios_coj;

import java.util.*;
import java.math.BigInteger;

public class Coj_2152 {
public static void main(String[] args){

	int c;
	Scanner S = new Scanner(System.in);
	
	BigInteger num , suma , uno ;
	c = S.nextInt();
	uno = new BigInteger("-1");
	
	while(c>0){
		num = new BigInteger(S.next());
		suma=BigInteger.ZERO;
	
		if(num.compareTo(BigInteger.ZERO)< 0){
			
			num = (num.multiply(uno));
			
			while(num.compareTo(BigInteger.ZERO) > 0){
				
				suma = suma.add(num.mod(BigInteger.TEN));
				num = num.divide(BigInteger.TEN);
				
			}
		}else{
		
			while(num.compareTo(BigInteger.ZERO) > 0){
				
				suma = suma.add(num.mod(BigInteger.TEN));
				num = num.divide(BigInteger.TEN);
				
			}
		}
		System.out.println(suma);
	c--;
	}
	S.close(); // te quiero edith..   :)
}
}