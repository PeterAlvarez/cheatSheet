package ejercicios_coj;

import java.util.Scanner;

public class Coj_1078 {
public static void main(String[] args){
	
	long casos , niños , i , suma , car ;
	
	Scanner S = new Scanner(System.in);
	
	casos = S.nextInt();
	
	while( casos>0 ){
		
		niños = S.nextInt();
		suma = 0;
		
		for( i=0 ; i<niños ; i++ ){
			car = S.nextInt();
			suma +=car;
		}
		if( suma%niños == 0 ){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	casos--;	
	}
	S.close();
	
}
}
