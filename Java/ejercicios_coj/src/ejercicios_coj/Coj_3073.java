package ejercicios_coj;

import java.util.Scanner;
public class Coj_3073 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	
	int c = S.nextInt();
	while(c>0){
		String cad= S.next();
		
		if(cad.length()>10){
			System.out.print(cad.charAt(0));
			System.out.print(cad.length()-2);
			System.out.println(cad.charAt(cad.length()-1));
		}else
			System.out.println(cad);
	c--;
	}
	S.close();
}
}
