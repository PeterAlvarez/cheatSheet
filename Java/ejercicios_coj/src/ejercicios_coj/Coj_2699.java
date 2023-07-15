package ejercicios_coj;

import java.util.*;
import java.text.*;

public class Coj_2699 {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.000");
	
	double[] num = new double[30];
	int i ;
	double suma = 0 , res=0;
	for( i=0 ; i<30 ; i++ ){
		
		num[i]=S.nextDouble();
		suma+=num[i];
	}
	res = suma/30;
	System.out.println(df.format(suma+res));
	
	
	S.close();
}
}
