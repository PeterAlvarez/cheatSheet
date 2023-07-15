package paquetepro;

import java.util.StringTokenizer;

public class Tokens {
public static void main(String[] arg){
		
		String cad = "12&11&12&12&919&912123";
		System.out.println(cad);
		StringTokenizer cad2 = new StringTokenizer( cad );
		
		while(cad2.hasMoreTokens()){		
			String x =	cad2.nextToken("&");
			System.out.println(x);
		}
		
		
	}
}
