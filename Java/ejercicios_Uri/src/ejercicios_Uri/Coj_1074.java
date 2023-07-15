package ejercicios_Uri;

import java.util.Scanner;
public class Coj_1074 {
public static void main(String[] args) {
	Scanner S =new Scanner(System.in);
	
	int c = S.nextInt();
	
	while( c>0 ){
		int num = S.nextInt();
		if(num==0)
			System.out.println("NULL");
		else if(num%2==0)
			System.out.print("EVEN ");
		else 
			System.out.print("ODD ");
		
		if(num>0) 
			System.out.println("POSITIVE");
		else if 
			(num<0)System.out.println("NEGATIVE");

		c--;
	}
	S.close();
}
}
