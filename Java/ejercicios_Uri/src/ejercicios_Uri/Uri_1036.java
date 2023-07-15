package ejercicios_Uri;

import java.util.*;
import java.math.*;
import java.text.*;

public class Uri_1036 {
public static void main(String[] args) {

	Scanner S = new Scanner(System.in);
	
	double a , b , c , x , y ;
	DecimalFormat df = new DecimalFormat("0.00000");
	
	a = S.nextDouble();
	b = S.nextDouble();
	c = S.nextDouble();
	
	if( a==0 || b*b < 4*a*c ){
		System.out.println("Impossivel calcular");
	}else{
		
		x = Math.sqrt(b*b-4*a*c);
		
		y = -b+x ;
		System.out.println("R1 = "+df.format(y/(2*a)));
		
		y = -b-x ;	
		System.out.println("R2 = "+df.format(y/(2*a)));
		
	}
	
	S.close();
}
}
