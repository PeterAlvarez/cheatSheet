package ejercicios_coj;

import java.util.Scanner;
public class Coj_2060 {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	
	while(S.hasNext()){
		
		int c=S.nextInt();
		
		if( c==-1 ) break;
		
		int sum = 0 , cont=0 ;
		while( c>0 ){
			int b=S.nextInt();
			sum+=b;
			if( sum%100==0 ){
				sum=0;
				cont++;
			}
		c--;
		}
		System.out.println(cont);
	}

	S.close();
}
}
