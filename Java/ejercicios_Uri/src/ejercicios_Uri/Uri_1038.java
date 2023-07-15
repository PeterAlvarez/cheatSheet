package ejercicios_Uri;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Uri_1038 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.00");
	int cod=S.nextInt();
	int can=S.nextInt();
	
	System.out.println("Total: R$ "+df.format(sum(cod,can)));
	
	
	
	
	S.close();
}

public static double sum(int a ,int b){
	if(a==1){
		if(b==0){
			return 0;
		}else{
			return 4.00 + sum(a,b-1);
		}
	}
	
	if(a==2){
		if(b==0){
			return 0;
		}else{
			return 4.50 + sum(a,b-1);
		}
	}
	
	if(a==3){
		if(b==0){
			return 0;
		}else{
			return 5.00 +sum(a,b-1);
		}
	}
	
	if(a==4){
		if(b==0){
			return 0;
		}else{
			return 2.00 + sum(a,b-1);
		}
	}
	
	if(a==5){
		if(b==0){
			return 0;
		}else{
			return 1.50 +sum(a,b-1);
		}
	}
	return 0;
}
}
