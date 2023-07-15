package ejercicios_coj;

import java.util.Scanner;
public class Coj_1678 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	int aux=1000;
	int cas = S.nextInt();

	for(int i=0;i<cas;i++){
		
		int a = S.nextInt();
		int b = S.nextInt();
		int c = S.nextInt();
	
		if( (a+b>c) && (a+c>b) && (b+c>a) ){
			int sum=a+b+c;
			if(sum<aux)
				aux=sum;
		}
	}
	System.out.println(aux);
	S.close();
}
}



