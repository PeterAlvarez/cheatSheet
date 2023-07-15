package ejercicios_Uri;

import java.util.*;

public class Uri_1018 {
public static void main(String[] args){
	
	Scanner S = new Scanner(System.in);
	
	int num , c100=0 , c50=0 , c20=0 , c10=0 , c5=0 , c2=0 , c1=0 ;
	
	num = S.nextInt();
	
	System.out.println(num);
	
	while(num>0){
		if(num>=100){
			num -=100;
			c100++;
		}else if(num>=50){
			num-=50;
			c50++;
		}else if (num>=20){
			num-=20;
			c20++;
		}else if(num>=10){
			num-=10;
			c10++;
		}else if(num>=5){
			num-=5;
			c5++;
		}else if(num>=2){
			num-=2;
			c2++;
		}else if(num>=1){
			num-=1;
			c1++;
		}else{
			break;
		}
	}
	System.out.println(c100+" nota(s) de R$ 100,00");
	System.out.println(c50+" nota(s) de R$ 50,00");
	System.out.println(c20+" nota(s) de R$ 20,00");
	System.out.println(c10+" nota(s) de R$ 10,00");
	System.out.println(c5+" nota(s) de R$ 5,00");
	System.out.println(c2+" nota(s) de R$ 2,00");
	System.out.println(c1+" nota(s) de R$ 1,00");
	S.close();
}
}

