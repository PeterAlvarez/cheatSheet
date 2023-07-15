package ejercicios_coj;

import java.util.Scanner;
import java.math.*;
public class Coj_1679 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	
	double aux1=0;
	String aux="";
	
	int c = S.nextInt();
	while(c>0){
		
		
		String cad1 = S.next();

		
		double PA = S.nextDouble();
		double PJ = S.nextDouble();
		double G = S.nextDouble();
		double A = S.nextDouble();
		double TA = S.nextDouble();	
		double TR = S.nextDouble();
		
		Double factor = (Math.log10(PA))+PJ+(2*G)+(A-(TA+2*TR));

		if(factor>aux1){
			aux=cad1;
			aux1=factor;

		}

	c--;		
	}
	System.out.println(aux);
	
	S.close();
}
}
