package ejercicios_Uri;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Uri_1005 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00000");
		double n=S.nextDouble();
		double m=S.nextDouble();
		
		n = n*3.5;
		m = m*7.5;
		System.out.println("MEDIA = "+df.format((m+n)/11));
		
	}
}
