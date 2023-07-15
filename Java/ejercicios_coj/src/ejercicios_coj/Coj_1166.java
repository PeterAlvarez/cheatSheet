package ejercicios_coj;

import java.util.Scanner;

public class Coj_1166 {
public static void main(String[] args){
	
	int c , num , i , dato , par , impar ;
	
	Scanner S = new Scanner(System.in);
	c = S.nextInt();
	
	while(c>0){
		par = 0;
		impar = 0;
		num = S.nextInt();
		for( i=0 ; i<num ; i++ ){
			dato = S.nextInt();
			if(dato%2==0){
				par++;
			}
			else{
				impar++;
			}
			
		}
		System.out.println(+par+" even and "+impar+" odd.");
		c--;
	}
	S.close();
}
}
/// hola kathia feliz navidad y no estoy tomandoooooooooooooooooooo