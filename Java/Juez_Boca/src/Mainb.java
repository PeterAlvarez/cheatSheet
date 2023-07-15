import java.util.Scanner;

public class Mainb {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		long num ;
		int dato;
		while (S.hasNext()) {
			dato = S.nextInt();
			num = (long)Math.pow(2, dato+1)-1;
			System.out.println(num);
		}
	}

}
