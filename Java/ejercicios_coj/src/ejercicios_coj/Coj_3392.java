package ejercicios_coj;

import java.util.Scanner;
public class Coj_3392 {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	while(S.hasNext()){
		int l = S.nextInt();
		if(l==0)break;
		
		int sum=0;
		if(l==1 || l==2)System.out.println("0");
		else{
			for(int i=0;i<l-2;i++)
				sum +=12;
		System.out.println(sum);
		}
	}
	S.close();
}
}
