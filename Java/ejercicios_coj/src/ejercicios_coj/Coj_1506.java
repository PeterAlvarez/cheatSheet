package ejercicios_coj;

import java.util.*;
import java.text.*;

public class Coj_1506 {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.00");
	int c , i , t ;
	double nota;
	c = S.nextInt();
	
	char[] cad = new char[c];
	char[] cad2= new char[c];
	
	String s=S.next();
	cad=s.toCharArray();
	t=S.nextInt();
	while(t>0){
		String p =S.next();
		cad2=p.toCharArray();
		//System.out.println(cad2);
		nota = c;
		for( i=0 ; i<c ; i++ ){
			if(cad2[i]=='#'){
				nota-=1;
			}else if(cad[i]!=cad2[i]){
				nota -=1.25;
			}
			
			
		}
		System.out.println(df.format(nota));
	t--;
	}

	S.close();
}
}
