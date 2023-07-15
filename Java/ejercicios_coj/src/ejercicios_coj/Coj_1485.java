package ejercicios_coj;

import java.util.Arrays;
import java.util.Scanner;

public class Coj_1485 {
public static void main(String[] args){
	
	Scanner S = new Scanner(System.in);
	char [] a;
		
		String s = S.nextLine();
		
		a = s.toCharArray();//leer un string de caracteres
		
		Arrays.sort(a);
		
		System.out.println(a);

	S.close();
}	
}
//// ...../////