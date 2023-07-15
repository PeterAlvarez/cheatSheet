import java.util.Scanner;
public class Temperatura {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	int N=S.nextInt();
	while(N>0){
	
		int C = S.nextInt();
		int F=((9*C)/5)+32;
		System.out.println(F);
		
	N--;
	}
	S.close();
}
}
