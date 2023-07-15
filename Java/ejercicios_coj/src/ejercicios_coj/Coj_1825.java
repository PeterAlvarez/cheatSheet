package ejercicios_coj;

import java.util.*;
public class Coj_1825 {
public static void main(String[] args) {
	
	Scanner S =new Scanner(System.in);
	char[] id = new char[6];
	int i , c ;
	c = S.nextInt();
	while( c>0 ){
	
		String s = S.next();
		id = s.toCharArray();
		String nom , nom2;
		
		nom = S.next();
		nom2 =S.nextLine();
		
		for( i=0 ; i<3 ; i++ ){
			System.out.print(id[i]);
		}
		System.out.print(nom.replace(" ","*"));
		System.out.print(nom2.replace(" ","*"));
		for( i=3 ; i<6 ; i++ ){
			System.out.print(id[i]);
		}
		System.out.println();
	c--;
	}

	S.close();
}
}
