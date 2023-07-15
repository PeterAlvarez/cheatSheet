package ejercicios_coj;

import java.util.*;
public class Coj_2231 {
public static void main(String[] args){
	
	Scanner S = new Scanner(System.in);
	
	int c , ganap1=0 , ganap2=0 ;
	
	c=S.nextInt();
	
	while( c>0 ){
		String p1 , p2 ;
		
		p1 = S.next();
		p2 = S.next();
		
		if( (p1.equals("rock")&&(p2.equals("scissors"))) ||(p1.equals("paper")&&(p2.equals("rock"))) || (p1.equals("scissors")&&(p2.equals("paper")))){
			ganap1++;
		}else if (p1.equals(p2)){
			ganap1++;
			ganap2++;
		}else{
			ganap2++;
		}
	c--;
	}
		if(ganap1>ganap2){
			System.out.println("A win");
		}else if( ganap1==ganap2){
			System.out.println("tied");
		}else{
			System.out.println("B win");
		}
	
	S.close();
}
}
