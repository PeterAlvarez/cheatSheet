package ejercicios_coj;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Coj_1042 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.0");
		int c=S.nextInt();
		int C=c;
		double sum=0;
		while( c>0 ){
			double H =S.nextDouble();
			double D =S.nextDouble();
			 
			double res =( (H*H) - (D*D) )/(2*H);
			sum += res;
			
			System.out.println(df.format(res));
		c--;	
		}
		System.out.println(df.format(sum/C));
	S.close();
}
}