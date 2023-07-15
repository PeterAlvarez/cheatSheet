package ejercicios_Uri;

import java.util.Scanner;
public class Uri_1151 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	int c = S.nextInt();
	int[] cad = new int[c];
	int aux=0;
	for(int i=0 ; i<c ; i++ ){
		
		if(i==0){
			cad[i]=i;
			System.out.print(i+" ");
		}else if(i==1){
			cad[i]=i;
			System.out.print(i);
		}
		else{
			cad[i]=cad[i-1]+cad[i-2];
			System.out.print(" "+cad[i]);
		}		
	}
	System.out.println();
	S.close();
}
}
