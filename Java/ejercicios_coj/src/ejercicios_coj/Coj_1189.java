package ejercicios_coj;

import java.util.*;
import java.math.*;
import java.text.*;

public class Coj_1189 {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	DecimalFormat df= new DecimalFormat("0");
	
	int i , j , num2;
	char[] cad = new char[1000];
	
	while( true ){
		double suma=0;
		
		String s= S.next();
		cad = s.toCharArray();
		
		if(cad[0]=='0'){
			break;
		}
		
		for( i=0 , j=cad.length ; i<cad.length ; i++ , j-- ){
			num2 = cad[i]-48;
			suma = suma + num2 *(Math.pow(2,j)-1);
		}
		
		System.out.println(df.format(suma));
		
	}
		
}
}
