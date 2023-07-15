package ejercicios_Uri;

import java.util.Scanner;
public class N3_mas_1 {
public static void main(String[] args) {

	Scanner S = new Scanner(System.in);
	
	int num = S.nextInt();
	while( true ){
		
		if(num==1) break;
		
		if(num%2==0){
			System.out.print(par(num)+" ");
			num = par(num);
		}else{
			System.out.print(impar(num)+" ");
			num = impar(num);
		}
	}
	
}
	public static int par(int n){
		return n/2;
	}
	
	public static int impar(int n){
		return (n*3)+1;
	}

}
