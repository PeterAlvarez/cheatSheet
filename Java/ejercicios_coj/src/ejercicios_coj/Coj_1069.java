package ejercicios_coj;

import java.util.*;
public class Coj_1069 {
public static void main(String[] args){
	
	int op , E , F , C , cont ;
	
	Scanner S = new Scanner(System.in);
	op = S.nextInt();
	
	while( op>0 ){
		
		E = S.nextInt();
		F = S.nextInt();
		C = S.nextInt();
		
		E += F;
		if( C==1 ){
			System.out.println(0);
		}else{
			cont=0;
			while( E>=C ){
				E = E - C+1 ;
				cont++;
			}
			System.out.println(cont);
			}
		op--;
		}
	S.close();
}
}
