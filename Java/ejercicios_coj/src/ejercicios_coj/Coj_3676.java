package ejercicios_coj;

import java.util.*;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.*;

public class Coj_3676 {
public static void main(String[] args)throws Exception {
	
	BufferedReader S = new BufferedReader(new InputStreamReader(System.in));
	PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
	
	int c , i ;
	
	c = Integer.parseInt(S.readLine());
	BigDecimal num , res = BigDecimal.ZERO;
	BigDecimal cinco = new BigDecimal("5");
	
	
	
	for( i=1 ; i<=c ; i++ ){
		
		num = new BigDecimal(S.readLine());
		res = num.divide(cinco);
		
				
		out.print("Case "+i+": ");
		out.println((res.toString().replace(".", ",")));
	}
	S.close();
	out.close();
}
}


