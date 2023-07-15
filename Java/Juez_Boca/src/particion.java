import java.math.BigInteger;
import java.util.Scanner;

public class particion {
//	public static void main(String[] args) {
//		Scanner S = new Scanner(System.in);
//		BigInteger n , k;
//		while ( S.hasNext() ) {
//			n = S.nextBigInteger();
//			k = S.nextBigInteger();
//			if ( n.equals(k) ) {
//				System.out.println(1);
//			}else {
//				System.out.println(funcion1(n, k).add(funcion2(n, k)));
//			}
//		}
//		
//	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
			Scanner S = new Scanner(System.in);
			BigInteger n , k;
			while ( S.hasNext() ) {
				n = S.nextBigInteger();
				k = S.nextBigInteger();
				if (n >= 1 && n <= 100 && k >= 1 && k <= 100 && k <= n) {
					System.out.println(n + " objetos en "+ k + " partes, es exactamente " + numerosStirling(n, k)+".");
				}
					
			}
			
		}
		
		
		
		do {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			
		
		}while(scanner.hasNext());
	}
	
	public static long numerosStirling(int n, int k) {
		if ((n == k && n >= 1 )|| (k == 1 && n >= 1)) return 1;
		else return numerosStirling(n-1, k-1) + k * numerosStirling(n-1, k);	
	}
	
//	static BigInteger funcion1(BigInteger n, BigInteger k) {
//		if (k.equals(BigInteger.ONE))
//			return  n ;
//		else
//			return funcion1( n.subtract(BigInteger.ONE) , k.subtract(BigInteger.ONE) );
//	}
//	
//	static BigInteger funcion2(BigInteger n, BigInteger k) {
//		if (n.equals(k))
//			return  BigInteger.ONE;
//		else
//			return funcion2( n.subtract(BigInteger.ONE) , k ).multiply(k);
//	}
}
