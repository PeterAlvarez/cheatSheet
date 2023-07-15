package ejercicios_Uri;

import java.util.Scanner;
public class Uri_1142 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
		
		int t=S.nextInt();
		int y=1;
		for(int i=1;i<=t;i++){
			
			System.out.print(y+" ");
			y+=1;
			System.out.print(y+" ");
			y+=1;
			System.out.print(y);
			System.out.println(" PUM");
			y+=2;
		}	
	S.close();
}
}
