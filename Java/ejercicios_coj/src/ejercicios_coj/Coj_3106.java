package ejercicios_coj;

import java.util.Scanner;

public class Coj_3106 {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	while(S.hasNext()){
		String cad = S.next();
		String cad2 = S.next();
		String fin = cad+cad2;
	
		StringBuilder reves = new StringBuilder(fin);
		
		String re = reves.reverse().toString();
	
		if(fin.equals(re)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
	S.close();
}
}
