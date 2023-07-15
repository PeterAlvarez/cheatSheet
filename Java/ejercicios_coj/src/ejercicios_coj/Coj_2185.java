package ejercicios_coj;

import java.util.Scanner;


public class Coj_2185 {
public static void main(String[] args){
	
	int a , b ;
	Scanner S = new Scanner(System.in);
	
	a = S.nextInt(); 
	b = S.nextInt();
	
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);
	System.out.println(a%b);

	S.close();
}
}
