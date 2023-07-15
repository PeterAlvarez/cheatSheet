package ejercicios_coj;

import java.util.Scanner;
public class Coj_2399 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
		
	int a , b , res ;
	
	while(S.hasNext()){
		a=S.nextInt();
		b=S.nextInt();
		
		res = (a*(b-1))+1;
		System.out.println(res);
	
	}
	S.close();
}
}
