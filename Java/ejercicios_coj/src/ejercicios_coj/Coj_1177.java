package ejercicios_coj;

import java.util.*;

public class Coj_1177 {
public static void main(String[] args){
	
	Scanner S = new Scanner(System.in);
	
	int a , i , j , e , h ;
	char[] cad;
	
	while(true){
		a = S.nextInt();
		
		if(a==0){
			break;
		}
		
		String s = S.next();
		cad = s.toCharArray();
		
		e = cad.length/a;
		
		h = e;
		j=0;
		while(true){
			for( i=h-1 ; i>=j ; i-- ){
					System.out.print(cad[i]);
			}
			if( j == cad.length || h == cad.length ){
				break;
			}
			j+=e;
			
			h+=e;
		
		}
		System.out.println();
	}
	S.close();
}
}




