package ejercicios_Uri;

import java.util.Scanner;
public class Uri_1153 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	int p=S.nextInt(); 
	int aux=1;
	
	
	for(int i=1 ; i<=p ; i++ ){
		aux*=i;
	}
	System.out.println(aux);
	S.close();
}
}
