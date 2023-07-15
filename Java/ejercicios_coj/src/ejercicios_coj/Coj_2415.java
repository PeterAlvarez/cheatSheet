package ejercicios_coj;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Coj_2415 {
public static void main(String[] args) {
	
	
	Scanner S = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.00");
	int c=S.nextInt();
	while(c>0){
		int t = S.nextInt();
		double suma=0;
		while( t>0 ){
			
			double R = S.nextDouble();
			double H = S.nextDouble();
			suma +=R*R*3.141592653589*H;
			t--;
		}
		System.out.println(df.format(suma));
	c--;
	}
	S.close();	
}
}
