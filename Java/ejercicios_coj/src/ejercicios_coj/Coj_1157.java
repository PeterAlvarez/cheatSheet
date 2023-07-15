package ejercicios_coj;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Coj_1157 {
public static void main(String[] args) {
	DecimalFormat df=new DecimalFormat("0.000000000");
	System.out.println("n e");
	System.out.println("- -----------");
	double sum=0;
	for( int i=0 ; i<10 ; i++ ){
		sum += 1/fac( i );
		System.out.print(i+" ");
		if(i<2){
		System.out.println((int)sum);
		}else if(i<3){
			System.out.println(sum);
		}else{
			System.out.println(df.format(sum));
		}
	}
}

public static double fac(int a){
	if(a<=1){
		return 1;
	}else{
		return a * fac(a-1);
	}
}
}
