package ejercicios_Uri;
import java.util.*;

public class Uri_1035 {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	
	int a , b , c , d ;
	a = S.nextInt();
	b = S.nextInt();
	c = S.nextInt();
	d = S.nextInt();
	
	if( b>c && d>a && c+d>a+b && c>0 && d>0 && a%2==0 ){
		System.out.println("Valores aceitos");
	}else
		System.out.println("Valores nao aceitos");

	S.close();
}
}
