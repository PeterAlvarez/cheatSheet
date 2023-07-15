package code_1;
import java.util.Arrays;
import java.util.Scanner;
public class Code_8 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		String cad = S.next();
		System.out.println(cad);
		for( int i=cad.length()-1 ; i>=0 ; i-- ){
			
			for( int k=i ; k<=cad.length()-1 ; k++){
				System.out.print(cad.charAt(k));
			}
			for( int j=0 ; j<=i-1 ; j++ ){
				System.out.print(cad.charAt(j));
			}
			System.out.println();
		}	
	}
}