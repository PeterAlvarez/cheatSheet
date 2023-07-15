package ejercicios_coj;

import java.util.*;

public class Coj_1252 {
public static void main(String[] args){
	
	Scanner S = new Scanner(System.in);
	
	char[] cad;
	int i ;
	
	while(true){
		String s = S.nextLine();
		cad = s.toCharArray();
		if(cad[0]=='#'){
			break;
		}
		
		for(i=0;i<cad.length;i++){
			if( cad[i] == ' ' ){
				System.out.print("%20");
			}else if( cad[i] ==  '!' ){
				System.out.print("%21");
			}else if( cad[i] == '$' ){
				System.out.print("%24");
			}else if( cad[i] == '%' ){
				System.out.print("%25");
			}else if( cad[i] == '(' ){
				System.out.print("%28");
			}else if( cad[i] == ')' ){
				System.out.print("%29");
			}else if( cad[i] == '*' ){
				System.out.print("%2a");
			}else{
				System.out.print(cad[i]);
			}
		}
		System.out.println();
	}
	S.close();
}
}
