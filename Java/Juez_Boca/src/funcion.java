import java.util.Scanner;
import java.math.*;
public class funcion {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		
	}
	static BigInteger factorial(BigInteger n) {
		if (n.equals(BigInteger.ZERO))
			return BigInteger.ONE;
		else
			return n.multiply(factorial(n.subtract(BigInteger.ONE)));
	}
}
