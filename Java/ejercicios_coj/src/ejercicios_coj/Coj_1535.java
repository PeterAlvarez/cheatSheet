package ejercicios_coj;

import java.util.Scanner;
public class Coj_1535 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	
	int i ;
	int[] leñ=new int[10];
	
	int c = S.nextInt();
	System.out.println("Lumberjacks:");
	while(c>0){
	
		leñ[0] = S.nextInt();
		leñ[1] = S.nextInt();
		leñ[2] = S.nextInt();
		leñ[3] = S.nextInt();
		leñ[4] = S.nextInt();
		leñ[5] = S.nextInt();
		leñ[6] = S.nextInt();
		leñ[7] = S.nextInt();
		leñ[8] = S.nextInt();
		leñ[9] = S.nextInt();
		
		int cont=0;
		
		for( i=0 ; i<9 ; i++ )//ascendente
			if(leñ[i]>leñ[i+1]){
				cont++;
				break;
			}
		
		for( i=0 ; i<9 ; i++ )//descendente
			if(leñ[i]<leñ[i+1]){
				cont++;
				break;
			}
		
		if( cont == 1 )
			System.out.println("Ordered");
		else
			System.out.println("Unordered");
		
	c--;
	}
	S.close();
}
}
