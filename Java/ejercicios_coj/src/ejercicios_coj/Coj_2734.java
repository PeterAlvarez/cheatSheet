package ejercicios_coj;

import java.util.Scanner;
public class Coj_2734 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	int res=0;
	while(S.hasNext()){
		String cad = S.next();
		if(cad.equals("suma")){
			int a=S.nextInt();
			res += a;
		}else{
			int a=S.nextInt();
			res -= a;
		}
	}
	System.out.println("resultado: "+res);
	S.close();
}
}
