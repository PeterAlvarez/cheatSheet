package code_1;

import java.util.Scanner;
import java.math.*;
import java.util.Arrays;

public class Code_16 {
	 public static void main(String args[]) {
	        Scanner in = new Scanner(System.in);
	        int S = in.nextInt();
	        int P = in.nextInt();
	        int a=0 , su=0 , h=0;
	        double c=0;
	        for (int i = 0; i < P; i++) {
	            int p = in.nextInt();
	            su+=p;
	            if(a<p)a=p;
	        }
	        c=(double)S/100;
	        h=(int) (a*c);
	        
	        
	        System.out.println(su-h);
	        
	    }
}
