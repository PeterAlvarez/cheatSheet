//Ejercicio 2. Programar un algoritmo recursivo que calcule
//un número de la serie fibonacci. //1031//resolver


import java.util.Scanner;

public class Ejer_2 {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	
	int num =S.nextInt();
	
	for(int i=1;i<=num;i++){
		System.out.print(fibo(i)+" ");
	}
	
	S.close();
}
public static int fibo(int n){
	
        if(n==1 || n==2) {
        	return 1;
    	}
        else{ 
        	return fibo(n-1)+fibo(n-2);
        }
	
}
}
// 1 ,1,2,3,5,8,13,21