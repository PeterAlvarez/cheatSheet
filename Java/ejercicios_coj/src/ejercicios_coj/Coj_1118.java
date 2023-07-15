package ejercicios_coj;

import java.util.*;
public class Coj_1118 {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	int i , j , c , p ;
	
	p = S.nextInt();
	
	while( p>0 ){
		c = S.nextInt();
		int[] cad = new int[c+1];
		
		for( i=1 ; i<=c ; i++ ){
			cad[i]=1;
		}
		
		for( j=1 ; j<=c ; j++ ){	
			for( i=j ; i<=c ; i+=j ){
				if(cad[i]==0){
					cad[i] = 1;
				}else{
					cad[i] = 0;
				}
			}
		}
		int abierto=0;
		
		for(i=1;i<=c;i++){
			if(cad[i]==0){
				abierto++;
			}
		}
		System.out.println(abierto);
	p--;
	}
	S.close();
}
}
