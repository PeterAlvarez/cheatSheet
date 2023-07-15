package ejercicios_coj;

import java.util.*;
public class Coj_2775 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	
	char[] cad = new char[1000];
	int i , c ;
	
	c=S.nextInt();
	
	while( c>0 ){
	String s = S.next();
	cad = s.toCharArray();
	if( (cad[0]=='a') || (cad[0]=='e') || (cad[0]=='i') || (cad[0]=='o') || (cad[0]=='u') ){
		System.out.print(cad);
		System.out.println("cow");
	}else{
	
		for(i=1;i<cad.length;i++){
				System.out.print(cad[i]);
			}
		System.out.print(cad[0]);
		System.out.println("ow");
		}	
	c--;
	}
	
	
	S.close();
}
}
