package Progra_1;
import java.util.Scanner;
public class Fuciones_clases {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	
	int num = S.nextInt();
	System.out.println(fac(num));
	S.close();
}

public static int fac(int a){
	if(a==1){
		return 1;
	}else{
		return a*fac(a-1);
	}
}
}

/*
4 = 4*3!
3! = 3*2!
2! = 2*1!
1! = 1*1

*/