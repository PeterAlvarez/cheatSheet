package ejercicios_coj;

import java.util.Scanner;

public class Coj_1596 {

	static final long mod = 1000000000;

	/* function that returns nth Fibonacci number */
	static long fib(long n) {
		long F[][] = new long[][] { { 1, 1 }, { 1, 0 } };
		if (n == 0)
			return 0;
		power(F, n - 1);

		return F[0][0];
	}

	static void multiply(long F[][], long M[][]) {
		long x = (F[0][0] * M[0][0]) % mod + (F[0][1] * M[1][0]) % mod;
		long y = (F[0][0] * M[0][1]) % mod + (F[0][1] * M[1][1]) % mod;
		long z = (F[1][0] * M[0][0]) % mod + (F[1][1] * M[1][0]) % mod;
		long w = (F[1][0] * M[0][1]) % mod + (F[1][1] * M[1][1]) % mod;

		F[0][0] = x;
		F[0][1] = y;
		F[1][0] = z;
		F[1][1] = w;
	}

	/* Optimized version of power() in method 4 */
	static void power(long F[][], long n) {
		if (n == 0 || n == 1)
			return;
		long M[][] = new long[][] { { 1, 1 }, { 1, 0 } };

		power(F, n / 2);
		multiply(F, F);

		if (n % 2 != 0)
			multiply(F, M);
	}

	/* Driver program to test above function */
	public static void main(String args[]) {
		Scanner S = new Scanner(System.in);

		int caso = S.nextInt();
		while (caso-- > 0) {
			long num = S.nextLong();
			System.out.printf("%09d\n", fib(num) % mod);

		}
	}

}
