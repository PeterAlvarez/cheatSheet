package ejercicios_coj;

import java.util.Scanner;
public class Coj_1236 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	
	int a = S.nextInt();
	int b = S.nextInt();
	int c = S.nextInt();
	int d = S.nextInt();
		
	for(int i=0 ; i<3 ; i++ ){
		
		int h=S.nextInt();
		int cont=0;
		int sum=0;
		
		while( sum<=h ){
			sum+=a;
			if(h<=sum && h>sum-a){
				cont++;
			}
			sum += b;
		}

		int sum2=0;
		while( sum2<=h ){
			sum2+=c;		
			if(h<=sum2 && h>sum2-c){
				cont++;
			}
			sum2+=d;
		}
		
		if(cont==1){
			System.out.println("one");
		}else if(cont==2){
			System.out.println("both");
		}else{
			System.out.println("none");
		}
		
	}

	S.close();
}
}
