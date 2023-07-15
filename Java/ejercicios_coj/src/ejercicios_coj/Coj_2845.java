package ejercicios_coj;

import java.util.*;

public class Coj_2845 {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	
	double x , y ;
	while( true ){
		x = S.nextDouble();
		y = S.nextDouble();
		
			if( x>0 && y>0 ){
			System.out.println("Q1");
		}else if( y>0 && x<0 ){
			System.out.println("Q2");
		}else if( x<0 && y<0 ){
			System.out.println("Q3");
		}else if( x>0 && y<0 ){
			System.out.println("Q4");
		}else if( ( x==0 && y !=x )||( y==0 && x!=y ) ){
			System.out.println("AXIS");
		}
		if(x==0&&y==0){
			System.out.println("AXIS");
			break;
		}
	}
	S.close();
}
}
