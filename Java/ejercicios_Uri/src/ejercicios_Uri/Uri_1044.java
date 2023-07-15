package ejercicios_Uri;

import java.util.*;

public class Uri_1044 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	int a , b ;
	a = S.nextInt();
	b = S.nextInt();
	
	if(b%a==0||a%b==0){
		System.out.println("Sao Multiplos");
	}else{
		System.out.println("Nao sao Multiplos");
	}

	S.close();
}
}
