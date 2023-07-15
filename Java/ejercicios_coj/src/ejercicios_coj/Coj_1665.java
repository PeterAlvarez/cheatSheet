package ejercicios_coj;

import java.util.Scanner;
public class Coj_1665 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	String cad = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./"; 

	while(S.hasNext()){
		String cad2 = S.nextLine();
	
		for(int i=0;i<cad2.length();i++){
			if(cad2.charAt(i)==' ')
				System.out.print(" ");
			
			for(int j=0 ; j<cad.length() ; j++ ){
				
				if(cad2.charAt(i)==cad.charAt(j)){
					System.out.print(cad.charAt(j-1));
				}
			}
		}
		System.out.println();
	}
	S.close();
}
}
