package code_1;
import java.util.Scanner;
import java.math.*;
import java.util.Arrays;
public class Code_12 {
	 public static void main(String args[]) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        
	        for(int i=1;i<=n;i++){
	        	mas(i);
	        	for(int j=1;j<=n+1-i;j++){
	        		System.out.print(j);
	        	}
	        	System.out.println();
	        }
	   }
	 public static void mas(int n){
		 for(int i=1;i<n;i++){
			 System.out.print("+");
		 }
	 }
	 
}
