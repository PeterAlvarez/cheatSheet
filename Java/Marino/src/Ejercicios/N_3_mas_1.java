package Ejercicios;

import java.util.Scanner;
public class N_3_mas_1 {
	public static void main(String[] args) {

		Scanner S = new Scanner(System.in);
		
		int num = S.nextInt();
		int num2=S.nextInt();
		int h = 0;
		int aux=0;
		for( int i=num ; i<=num2 ; i++ ){
			h = i;
			int cont = 0;
			while( true ){
				cont++;
				if(h==1 || h<0)break;

				if(h%2==0){
					h = par(h);

				}else{
					h = impar(h);
				}
				
			}
			//System.out.println(cont+" "+i+" "+h);
			if(aux<cont){
				aux=cont;
			}
		}
		System.out.println(aux);
	}
		public static int par(int n){
			return n/2;
		}
		
		public static int impar(int n){
			return (n*3)+1;
		}
}
