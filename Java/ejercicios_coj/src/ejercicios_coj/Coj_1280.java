package ejercicios_coj;

import java.util.*;
public class Coj_1280 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	int c ;
	while( true ){
		c=S.nextInt();
		
		if(c==0)break;
		
		if(c==1){
			System.out.println("1 => 1");
		}else{
			System.out.print(c+" => ");
			System.out.println((c*c)-(c-1));
		}
		
	}
	S.close();
}
}
