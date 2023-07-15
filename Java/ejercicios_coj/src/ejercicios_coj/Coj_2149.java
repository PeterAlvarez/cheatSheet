package ejercicios_coj;

import java.util.*;

public class Coj_2149 {
public static void main(String[] args){
	
	char[] b = new char[101];
	int i , minus , mayus , caso ;
	
	Scanner S = new Scanner(System.in);
	
	caso = S.nextInt();
	
	while(caso>0){
		String s = S.next();
		b = s.toCharArray();
		
		minus = 0;
		mayus = 0;
		
		for( i=0 ; i<b.length ; i++ ){
			int p = b[i];
			if( p>96 && p<123 ){
				minus++;
			}else if( p>64 && p<91 ){
				mayus++;
			}
		}
		if(minus==mayus){
			System.out.println("SI");
		}else{
			System.out.println("NO");
		}
	caso--;
	}	
	S.close();
}
}
