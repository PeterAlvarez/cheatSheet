package ejercicios_coj;

import java.util.Scanner;

public class Coj_1627{
	public static void main(String[]args){
		
		Scanner S = new Scanner(System.in);	
		int caso=S.nextInt();
		while(caso-->0){
			
			int pri=S.nextInt();
			int num=5 , con=0;
				System.out.println(con(pri,num));
		}
	}
	
	public static int con(int a , int b){
		int  con=0;
		if(b>a){
			return 0;
		}else{
			return a/b + con( a , b*5);
			
		}	
	}
}
