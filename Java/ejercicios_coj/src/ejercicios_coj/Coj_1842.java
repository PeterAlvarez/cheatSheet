package ejercicios_coj;

import java.util.Scanner;
public class Coj_1842 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	int caso=S.nextInt();
	while(caso-->0){
		int sum=0;
		int x1=S.nextInt();
		int y1=S.nextInt();
		int x2=S.nextInt();
		int y2=S.nextInt();
	
		
		sum =(int) Math.sqrt((x2-x1)*(x2-x1)) +(int)Math.sqrt((y2-y1)*(y2-y1));
		System.out.println(sum);
	}
	S.close();
}
}
