package ejercicios_Uri;

import java.util.Scanner;
public class Uri_1073 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n=S.nextInt();
		for(int i=2;i<=n;i++){
			if(i%2==0){
				System.out.println(i+"^2 = "+(int)Math.pow(i, 2));
			}
		}
	}
}
