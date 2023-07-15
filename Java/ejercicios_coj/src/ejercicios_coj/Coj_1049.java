package ejercicios_coj;

import java.util.Scanner;

public class Coj_1049 {
	
	public static void main(String[] args){
		int num , suma=0 ;
		
		Scanner S = new Scanner(System.in);
		num = S.nextInt();
		
		if(num>0)
			System.out.print((num*(num+1))/2);
		else{
			System.out.print( ( ( (-1)*num*(num-1) ) /2)  +1);
		}
		
	}
	
}
