package ejercicios_coj;

import java.util.Scanner;

public class Coj_1933 {
public static void main(String[] args){
	int d , i ;
	
	Scanner S = new Scanner(System.in);
	
	while( true ){
		d = S.nextInt();
		i = S.nextInt();
		
		if( d==0 && i==0 )
			break;
		System.out.println(d+i);
	}
	
	
}
}
