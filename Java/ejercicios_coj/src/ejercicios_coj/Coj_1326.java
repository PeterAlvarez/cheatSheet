package ejercicios_coj;

import java.util.*;

public class Coj_1326 {
public static void main(String[] args){
	
	Scanner S = new Scanner(System.in);
	
	long C , s , T , casos ;
	char[] op = new char[1];
	
	casos = S.nextInt();
	
	while(casos>0){
		s =  S.nextInt();
		T = S.nextInt();
	
		while(T>0){
			
			String p = S.next();
			op = p.toCharArray();
			
			if( op[0] == 'C' ){
				C = S.nextInt();
				s += C;
			}else if( op[0] == 'D' ){
				C = S.nextInt();
				s -= C;
			}
		T--;
		}
		System.out.println(s);
	casos--;
	}
	S.close();
}
}
