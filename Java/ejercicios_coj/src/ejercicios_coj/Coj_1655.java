package ejercicios_coj;

import java.util.*;
public class Coj_1655 {
private static final boolean EOF = true ;
//private static final boolean OEF = false;


public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
		
	char[] cad = new char[10000];
	char[] cad2 = new char[10000];
	int i , j , c1 ;
	
	while( EOF ){
		

		String a=S.next();
		cad =a.toCharArray();
		
		String b = S.next();
		
		cad2 = b.toCharArray();
		c1=cad2.length;
		j=0;
			for( i=0 ; i<cad2.length ; i++ ){
				
				if(j==cad.length){
					break;
				}
				
				if(cad[j]==cad2[i]){
					j++;
				}else{
					c1--;
				}
				
			}
		
			if(j==cad.length){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
	}
}
}
