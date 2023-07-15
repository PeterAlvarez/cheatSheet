package ejercicios_Uri;

import java.util.Scanner;
public class Uri_1144 {
public static void main(String[] args){
	Scanner S = new Scanner(System.in);
	
	int y=S.nextInt();

	for(int i=1 ; i<=y ; i++ ){
		for(int j=i ; j<=i ; j++ ){
			int aux=j*j;
			System.out.print(i+" ");
			System.out.print(aux+" ");
			System.out.println(aux*j);
			System.out.print(i+" ");
			System.out.print(aux+1+" ");
			System.out.println(aux*j+1);	
		}
	}
	S.close();
}
}
