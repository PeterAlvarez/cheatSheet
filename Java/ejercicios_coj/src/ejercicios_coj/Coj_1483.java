package ejercicios_coj;

import java.util.Scanner;

public class Coj_1483 {
public static void main(String[] args){
	
	int a , b ;
	
	Scanner S = new Scanner(System.in);
	String palabra = S.next();
	
	if(palabra.equals("rectangle")){
		a = S.nextInt();
		b = S.nextInt();
		System.out.println(a*b);
	}
	else{
		a = S.nextInt();
		System.out.println(a*a);
	}
	S.close();
}
}
