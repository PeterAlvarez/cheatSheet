//considere una funcion que resive un numero entero n
// e imprima los numeros del n al 1 con recursividad
import java.util.Scanner;
public class Ejer_3 {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	
	int num = S.nextInt();
	
	for( int i=num  ;  i>=1 ; i-- ){
		System.out.print(num(i)+" ");
	}
	
	S.close();
}

public static int num(int n){
	
	if(n==1){
		return 1;
	}else{
		return 1 + num(n-1);
	}
	
	
	
}
}
