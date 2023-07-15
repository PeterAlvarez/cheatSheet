package ejercicios_coj;

import java.util.*;
public class Coj_3056 {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	
	int[] cad1 = new int[5];
	int[] cad2 = new int[5];
	int i , suma=0 ;
	
	cad1[0] = S.nextInt();
	cad1[1] = S.nextInt();
	cad1[2] = S.nextInt();
	cad1[3] = S.nextInt();
	cad1[4] = S.nextInt();
	
	cad2[0] = S.nextInt();
	cad2[1] = S.nextInt();
	cad2[2] = S.nextInt();
	cad2[3] = S.nextInt();
	cad2[4] = S.nextInt();
	
	for( i=0 ; i<5 ; i++ ){
		if( cad1[i] != cad2[i] ){
			suma++;
		}
	}
	if(suma==5){
		System.out.println("Y");
	}else{
		System.out.println("N");
	}
	S.close();
}
}
