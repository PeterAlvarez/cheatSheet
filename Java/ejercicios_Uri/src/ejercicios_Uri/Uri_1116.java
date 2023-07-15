package ejercicios_Uri;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uri_1116 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.0");
	
	int c=S.nextInt();
	while(c>0){
		double a=S.nextDouble();
		double b=S.nextDouble();
		
		if(b==0) System.out.println("divisao impossivel");
		else System.out.println(df.format(a/b));	
		c--;
	}
	S.close();
}
}