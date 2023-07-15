package ejercicios_Uri;

import java.util.Scanner;
public class Uri_2484 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	int i , j ;
	while(S.hasNext()){
		String cad =S.next();
		int t = cad.length();
		for( j=0 ; j<cad.length() ; j++ ){

			if(t!=cad.length())
				System.out.println();

			for( i=0 ; i<j ; i++ ){
				System.out.print(" ");
			}

			for( i=0 ; i<t ; i++ ){
				System.out.print(cad.charAt(i));
				if(i<t-1){
					System.out.print(" ");
				}
			}

			t--;
		}
		System.out.println();
		System.out.println();
	}

	S.close();
}
}
