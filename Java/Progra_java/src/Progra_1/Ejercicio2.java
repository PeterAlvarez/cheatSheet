package Progra_1;

import java.util.Scanner;
public class Ejercicio2 {
public static void main( String[] args ){
	
	Scanner tec=new Scanner(System.in);
	
	double pes=tec.nextDouble(); 
	int a1=0 , a2=0 ,a3=0 , a4=0 ;
	double cont=0;
	while(pes>0){
		cont++;
		if(pes<50){
			a1++;
		}
		if( pes>=50 && pes<70 ){
			a2++;
		}
		if(pes>=70 && pes<100){
			a3++;
		}
		if(pes>=100){
			a4++;
		}
		pes=tec.nextDouble();
	}
	
	System.out.println("Menor de 50 kg: "+a1+" ; "+(a1*100)/cont+" % ");
	System.out.println("Entre 50 Kg y menos de 70 Kg: "+a2+" ; "+(a2*100)/cont+" % ");
	System.out.println("Entre 70 Kg y menos de 100 Kg: "+a3+" ; "+(a3*100)/cont+" % ");
	System.out.println("Igual o mayor a 100 Kg: "+a4+" ; "+(a4*100)/cont+" % ");
    tec.exit();
}

}
