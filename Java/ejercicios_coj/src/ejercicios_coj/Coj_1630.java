package ejercicios_coj;

import java.util.Arrays;
import java.util.Scanner;
public class Coj_1630 {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	int i ;
	while(S.hasNext()){
		int a = S.nextInt();
		int d = S.nextInt();
		
		if( a==0 && d==0 ) break;
		
		int[] at = new int[a];
		int[] de = new int[d];
		
		for( i=0 ; i<a ; i++ )
			at[i] = S.nextInt();
		
		for( i=0 ; i<d ; i++ )
			de[i] = S.nextInt();
		
		Arrays.sort(at);
		Arrays.sort(de);
	
		if(at[0]<de[1]){
			System.out.println("Y");
		}else{
			System.out.println("N");
		}
	}
 	S.close();
}
}
