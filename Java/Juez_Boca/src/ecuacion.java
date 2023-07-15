import java.util.Scanner;

public class ecuacion {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		int dato , iterador;
		while(S.hasNext()) {
			iterador=0;
			dato=S.nextInt();
			for( int x1=0 ; x1<=dato ; x1++ ) {
				for( int x2=0 ; x2<=dato ; x2++ ) {
					for( int x3=0 ; x3<=dato ;  x3++ ) {
						for( int x4=0 ; x4<=dato ; x4++ ) {
							if( x1+x2+x3+x4==dato ) {
								System.out.println(x1+"+"+x2+"+"+x3+"+"+x4+"="+dato);
								iterador++;
							}
						}
					}
				}
			}
			System.out.println(iterador);
				
		}
	}
}
