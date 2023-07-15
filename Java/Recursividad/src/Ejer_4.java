// Programar un algoritmo recursivo que permita
//hacer la división por restas sucesivas.

import java.util.Scanner;
public class Ejer_4 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	
	int a = S.nextInt();
	int b=S.nextInt();
	System.out.println(num(a,b));
	S.close();
}
public static int num(int n, int m){
	
	if(n<m){
		return 0;
	}else{
		return 1 + num( n-m , m );
	}
	
	
	
}
}
