package ejercicios_coj;

import java.util.Scanner;
public class Coj_3137 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	
	int caso=S.nextInt();
	
	while(caso>0){
		int a = S.nextInt();
		int b = S.nextInt();
		int c = S.nextInt();
		if(b>0){
			if( (a+b==c) || (a-b==c) || (a*b==c) || (a%b==c) || (a/b==c) ){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}else if( (a*b==c) || (a+b==c) || (a-b==c) ){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}		
	caso--;
	}
	S.close();
} 
}