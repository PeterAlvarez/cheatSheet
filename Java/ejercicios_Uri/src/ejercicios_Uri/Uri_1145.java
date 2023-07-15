package ejercicios_Uri;

import java.util.Scanner;
public class Uri_1145 {
public static void main(String[] args){
	Scanner S = new Scanner(System.in);
	
	int s = S.nextInt();
	int y = S.nextInt();
	
	for(int i=1 ; i<=y ; i++ ){
		System.out.print(i);
		if(i%s==0){
			System.out.println();
		}else{
			System.out.print(" ");
		}
	}
	S.close();
}
}
