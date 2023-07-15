
import	java.util.*;

public class dec2oct {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int C = S.nextInt();
		int D = 0;
		String re = "";
		
		while( C>0 ) {
			D = S.nextInt();
			re = Integer.toString(D,8); //generador de octal
			System.out.println(re);
			C--;
		}
	}
}