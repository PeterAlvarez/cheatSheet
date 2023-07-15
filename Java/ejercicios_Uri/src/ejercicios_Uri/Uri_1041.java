package ejercicios_Uri;

import java.util.*;

public class Uri_1041 {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	
	double x , y ;
	
	x= S.nextDouble();
	y= S.nextDouble();
	
	if( y>0 && x>0 ){
		System.out.println("Q1");
	}else if( y>0 && x<0 ){
		System.out.println("Q2");
	}else if( y<0 && x<0 ){
		System.out.println("Q3");
	}else if( y<0 && x>0 ){
		System.out.println("Q4");
	}else if( y==0 && x==0 ){
		System.out.println("Origem");
	}else if( y==0 ){
		System.out.println("Eixo X");
	}else if( x==0 ){
		System.out.println("Eixo Y");
	}
	
	S.close();
}
}
