import java.util.*;

public class SumaBinaria {

	public static void main(String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		t=sc.nextInt();
		String a , b, resultado;
		int sumaDecimal, columnas, pivote;
		String relleno, linea;
		while( t-- > 0 ) {
			a = sc.next();
			b = sc.next();
			
			sumaDecimal = Integer.parseInt(a, 2);
			sumaDecimal = sumaDecimal + Integer.parseInt(b, 2);
			resultado = Integer.toBinaryString(sumaDecimal);
			
			if(resultado.length()>a.length() && resultado.length()>b.length() )
				pivote = 0 ;
			else
				pivote = 1 ;
			columnas = resultado.length() + pivote ;
			
			relleno = new String(new char[1+columnas-a.length()]);
			relleno = relleno.replace('\0', ' ');
			System.out.println(relleno+a);
			
			relleno = new String(new char[columnas-b.length()]);
			relleno = relleno.replace('\0', ' ');
			System.out.println("+"+relleno+b);
			
			linea = new String( new char[ columnas-pivote ] );
			linea = linea.replace('\0', '-');
			relleno = new String(new char[1+pivote]);
			relleno = relleno.replace('\0', ' ');
			System.out.println( relleno + linea );
	
			relleno = new String(new char[1+pivote]);
			relleno = relleno.replace('\0', ' ');
			System.out.println( relleno + resultado );
			if( t > 0)
				System.out.println();
		}
	}
}