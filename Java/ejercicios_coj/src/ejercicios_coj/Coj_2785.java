package ejercicios_coj;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Coj_2785 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.00");
	int c , p ;
	double a , suma=0 ;
	c=S.nextInt();
	p=c;
	while( c>0 ){
		a=S.nextDouble();
		suma += a;
	c--;
	}
	System.out.println(df.format((suma)/p));
	
	S.close();	
}
}
