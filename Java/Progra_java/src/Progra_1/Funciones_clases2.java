package Progra_1;
import java.util.Scanner;
public class Funciones_clases2 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	
	int num=S.nextInt();
	
	for( int i=1 ; i<=num ; i++ ){
		System.out.print(fibo(i)+" ");
	}
	
	S.close();
}

public static int fibo(int a){
	
	if(a==1||a==2){
		return 1;
	}else{
		return fibo(a-1)+fibo(a-2);
	}
		
}
}
