import java.util.Scanner;

public class numeroDivisores {

	public static void main(String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		t=sc.nextInt();
		int  limite;
		while(t-->0) {
			limite = sc.nextInt();
			divisores(limite);
		}
	}
	
	public static void divisores(int limite) {
		if(limite==1)
			System.out.println("1 1");
		else if(limite<4)
			System.out.println("2 2");
		else if(limite<6)
			System.out.println("4 3");
		else if(limite<12) {
			System.out.println("6 4");
		}
		else {
			System.out.println("12 6");
		}
	}
}