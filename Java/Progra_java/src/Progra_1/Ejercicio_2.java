package Progra_1;
import java.util.Scanner;

public class Ejercicio_2 {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	double[] cad = new double[1000];
	int i = 0;
	
	while( S.hasNext() ){
		
		cad[i] = S.nextDouble();
		if( cad[i] == 0 ) break;
		i++;
		
	}
	
	Pesos( cad , i );
	S.close();
	
}


public static void Pesos( double[] cad , int p){
	int a=0 , b=0 , c=0 , d=0 ;
	for(int i=0 ; i<p ; i++ ){
		if( cad[i] < 50 ){
			a++;
		}else if( cad[i] >= 50 && cad[i] < 70 ){
			b++;
		}else if( cad[i] >= 70 && cad[i] < 100 ){
			c++;
		}else if( cad[i] >= 100 ){
			d++;
		}
	}
	
	System.out.println( "* Menor de 50 kg: "+a+" ; "+porcentaje( a , p )+" % ");
	System.out.println( "* Entre 50 Kg y menos de 70 Kg: "+b+" ; "+porcentaje( b , p )+" % ");
	System.out.println( "* Entre 70 Kg y menos de 100 Kg: "+c+" ; "+porcentaje (c , p )+" % ");
	System.out.println( "* Igual o mayor a 100 Kg: "+d+" ; "+porcentaje( d , p )+" % ");

}

public static double porcentaje( double con , int p ){
	double res = 0;
	if( con > 0 ){
		res = ( ( con*100 )/p );
	}
	return res;
}
}
