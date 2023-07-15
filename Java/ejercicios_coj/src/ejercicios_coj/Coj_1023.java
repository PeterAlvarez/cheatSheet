package ejercicios_coj;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Coj_1023 {
	public static void main(String[] args){
		
		float num , suma=0 ;
		
		Scanner S = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00"); 
		
		for( int i=0 ; i<12 ; i++ ){
			
			 num = S.nextFloat();
			 suma += num;
		}
		System.out.print("$"+(df.format(suma/12)));
	}
}
