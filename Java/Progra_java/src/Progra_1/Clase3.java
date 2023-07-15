package Progra_1;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Clase3 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.00");

	double sum = 0;
	int con = 0;
	
	System.out.println( "ingrese las notas:" );
	
	while(	S.hasNext() ){
		
		int not = S.nextByte();
		
		if( not>0 && not<101 ){
			sum += not;
			con++;
		}
		else if( not < 0 ) 
			break;
		
	}
	System.out.println( "promedio de nota es : "+df.format( sum/con ) );	
	S.close();
}
}
