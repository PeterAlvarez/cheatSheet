package ejercicios_Uri;

import java.util.Scanner;
public class Uri_ejemplo {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	 
	int dia=S.nextInt();
	int año=0 , mes=0 , dias=0;
	while( dia>0 ){
		if( dia > 365 ){
			año++;
			dia -=365;
		}else if(dia > 30){
			mes++;
			dia -=30;
		}else{
			dias=dia;
			dia=0;
		}
	}
	System.out.println("Año "+año+" mes "+mes+" dias "+dias);

	S.close();
}
}
