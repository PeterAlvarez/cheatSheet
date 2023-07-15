package Progra_1;

import java.util.Scanner;
public class Clase {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	
	int n=S.nextInt();
	int pos=0 , neg=0;
	
	for(int i=0 ; i<n ; i++ ){
		int num=S.nextInt();
		
		if( num>=0 ){
			pos++;
		}else{
			neg++;
		}
	}
	System.out.println("Son "+pos+" positivos");
	System.out.println("Son "+neg+" negativos");

	S.close();
}
}
