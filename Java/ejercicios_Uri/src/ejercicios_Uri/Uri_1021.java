package ejercicios_Uri;


import java.text.DecimalFormat;
import java.util.*;

public class Uri_1021 {
public static void main(String[] args){
	
	Scanner S = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.00");
	double a;

	int c100=0 , c50=0 , c20=0 , c10=0 , c5=0 , c2=0 ;
	int m100=0 , m50=0 , m25=0 , m10=0 , m5=0 , m1=0;
	
	a = S.nextFloat();
	df.format(a);
	while( a>0.00){
		if( a >= 100.00 ){
			a-=100;
			c100++;
		}else if(a>=50.00){
			a-=50;
			c50++;
		}else if(a>=20.00){
			a-=20;
			c20++;
		}else if(a>=10.00){
			a-=10;
			c10++;
		}else if(a>=5.00){
			a-=5;
			c5++;
		}else if(a>=2.00){
			a-=2;
			c2++;
		}else if(a>=1.00){
			a-=1;
			m100++;
		}else if(a>=0.50){
			a-=0.50;
			m50++;
			
		}else if(a>=0.25){
			a-=0.25;
			m25++;
			
		}else if(a>=0.10){
			a-=0.10;
			m10++;
			
		}else if(a>=0.05){
			a -=0.05;
			m5++;
			}else if( a >=0.001 ){
			a-=0.01;
			m1++;
		}else {
			break;
			
		}
	}
	System.out.println("NOTAS:");
	
	System.out.println(c100+" nota(s) de R$ 100.00");
	System.out.println(c50+" nota(s) de R$ 50.00");
	System.out.println(c20+" nota(s) de R$ 20.00");
	System.out.println(c10+" nota(s) de R$ 10.00");
	System.out.println(c5+" nota(s) de R$ 5.00");
	System.out.println(c2+" nota(s) de R$ 2.00");
	
	System.out.println("MOEDAS:");
	
	System.out.println(m100+" moeda(s) de R$ 1.00");
	System.out.println(m50+" moeda(s) de R$ 0.50");
	System.out.println(m25+" moeda(s) de R$ 0.25");
	System.out.println(m10+" moeda(s) de R$ 0.10");
	System.out.println(m5+" moeda(s) de R$ 0.05");
	System.out.println(m1+" moeda(s) de R$ 0.01");
	
	S.close();
}
}


