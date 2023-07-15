import java.util.Scanner;

public class dec2hex {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int C = S.nextInt();
		int D = 0;
		String re = "";
		
		while( C>0 ) {
			D = S.nextInt();
			re = Integer.toString(D,16).toUpperCase(); //generador de octal
			System.out.println(D+ " " +re);
			C--;
		}
	}

}
