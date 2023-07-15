//Programar un algoritmo recursivo que determine si un número es positivo.

import java.util.Scanner;

public class Ejer_9 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	
	
	int num=S.nextInt();
	if(numero(num)){
		System.out.println("Es un un numero positivo");
	}else{
		System.out.println("Es un numero negativo");
	}
	
	S.close();
}
public static boolean numero(int n){
	
	if(n>=0){
		return true;
	}
	return false;
}
}
