package ejercicios_coj;

import java.util.Scanner;
public class Coj_1050 {
public static void main(String[] args){

	int num , i , cont=0 , j ;
	
	Scanner S = new Scanner(System.in);
	
	num = S.nextInt();
	for( i=1 ; i<num ; i++ ){
		
		if(mcd(num,i)==1){
			cont++;
		}
	}
	System.out.println(cont);
	
	S.close();
}
public static int mcd(int a, int b){
	   return (b==0)? a : mcd(b,a%b);
}
}








