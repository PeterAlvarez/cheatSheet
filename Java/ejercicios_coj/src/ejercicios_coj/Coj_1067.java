package ejercicios_coj;

import java.util.Scanner;

public class Coj_1067 {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	Scanner P = new Scanner(System.in);
	
		int max = 11;
		int min = 0;
		int co = 0;
		int y=0 , x=0;
		while(S.hasNext()){///buscar en lenguaje c
			
			int n = S.nextInt();
			if(n==0) break;
			
			String cad = P.nextLine();
			
			if(cad.equals("right on")){
				if(n>min&&n<max){
					System.out.println("Stan may be honest");
					 max=11;
					 min=0;
				}else{
					System.out.println("Stan is dishonest");
					max=11;
					min=0;
				}
			}
			
			if(cad.equals("too high")){
				y=n;
				if(max>y){
					//System.out.println("demasiado alto");
					max=y;
				}
			}
			if(cad.equals("too low")){
				x=n;
				if(x>min){
					//System.out.println("demasiado bajo");
					min=x;
				}
			}
			System.out.println("min"+min);
			System.out.println("max"+max);
		}
	
	P.close();
	S.close();			
}
}
