package ejercicios_Uri;
import java.util.*;

public class Uri_1045 {
public static void main(String[] args){
	
	
	Scanner S = new Scanner(System.in);

	double[] a = new double[3];
	
	a[0] = S.nextFloat();//c
	a[1] = S.nextFloat();//b
	a[2] = S.nextFloat();//a
	Arrays.sort(a);
	
	if(a[2]>=a[0]+a[1]){
		System.out.println("NAO FORMA TRIANGULO");
	}else{
		if( a[2]*a[2] == a[1]*a[1] + a[0]*a[0] )
			System.out.println("TRIANGULO RETANGULO");
		
		if( a[2]*a[2] > a[1]*a[1] + a[0]*a[0] )
			System.out.println("TRIANGULO OBTUSANGULO");
		
		if( a[2]*a[2] < a[1]*a[1] + a[0]*a[0] )
			System.out.println("TRIANGULO ACUTANGULO");
		
		if( a[2]==a[1] &&  a[1]==a[0] )
			System.out.println("TRIANGULO EQUILATERO");
		
		if( ( a[2]==a[1] && a[2]!=a[0] ) || ( a[0] == a[1] && a[0]!=a[2] ) || (a[2]==a[0] && a[2]!=a[1] ) )
			System.out.println("TRIANGULO ISOSCELES");
		
	}
	S.close();
}
}
