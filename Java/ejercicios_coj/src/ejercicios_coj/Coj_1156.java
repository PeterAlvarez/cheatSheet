package ejercicios_coj;

import java.util.Scanner;

public class Coj_1156 {
public static void main(String[] args){
	int num;
	Scanner S = new Scanner(System.in);
	
	while( true ){
		num = S.nextInt();
		if(num==42)
			break;
		System.out.println(+num);
	}
}
}
