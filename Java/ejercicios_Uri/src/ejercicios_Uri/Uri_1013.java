package ejercicios_Uri;

import java.util.*;
import java.text.*;

public class Uri_1013 {
public static void main(String[] args){
	
	Scanner S = new Scanner(System.in);
	
	int a , b , c ;
	
	a = S.nextInt();
	b = S.nextInt();
	c = S.nextInt();
	if( a>b && a>c ){
		System.out.println(a+" eh o maior");
	}else if( b>a && b>c ){
		System.out.println(b+" eh o maior");
	}else if( c>a && c>b ){
		System.out.println(c+" eh o maior");
	}
	
	S.close();
}
}
//COj_1064
/*
 package ejercicios_Uri;

import java.util.Scanner;


public class Uri_1013 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int  b ;
		while(true){
			int a=S.nextInt();
			if(a==0)break;
			int c = a;
			int ini=0,fin=11;
			int cont=0;
			while(a!=0){
				String cad = S.nextLine();
				if(cad.equals("right on")){
					break;
				}//salir
				if(cad.equals("too high")){//demasiado alto
					if(c>fin){
						cont++;
					}else{
						b = S.nextInt();
						fin=c;
						c=b;
					}
					
				}
				
				if(cad.equals("too low")){//demasiado bajo
					if(c<ini){
						cont++;
					}else{

						b = S.nextInt();
						ini=c;
						c=b;
					}
				}
				
			}
			if((ini <c && c< fin ) && cont==0 ){
				System.out.println("Stan may be honest");
			}else{
				System.out.println("Stan is dishonest");
			}
			
		}			
	}
}*/
