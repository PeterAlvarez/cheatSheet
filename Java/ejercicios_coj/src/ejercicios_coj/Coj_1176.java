package ejercicios_coj;

import java.util.*;

public class Coj_1176 {
public static void main(String[] args){
	
	long num;
	Scanner S = new Scanner(System.in);
	
	while(true){
		num = S.nextInt();
		if(num<0){
			break;
		}
		ternario(num);
		System.out.println();
	}
	S.close();
}

public static void ternario(long n){

	if(n>2)
		ternario(n/3);
	System.out.print(n%3);
	
}
}
