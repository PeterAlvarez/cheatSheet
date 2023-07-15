package ejercicios_coj;

import java.util.Scanner;
public class Coj_1328 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	
	int i ;
	int c = S.nextInt();
	while(c>0){
		int a = S.nextInt();
		double[] mat = new double[a];
		double[] fis = new double[a];
		int cont=0;
		double sum=0;
		for( i=0;i<a;i++){
			mat[i]=S.nextDouble();
			sum+=mat[i];
		}
		
		for( i=0 ; i<a ; i++){
			fis[i]=S.nextDouble();
			sum+=fis[i];
			mat[i]+=fis[i];
			
		}
		
		for(i=0;i<a;i++){
			if(mat[i]<sum/a){
				cont++;
			}
		}
		System.out.println(cont);
	c--;
	}
	S.close();
}
}
