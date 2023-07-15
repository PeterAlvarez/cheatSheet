package code_1;

import java.util.Arrays;
import java.util.Scanner;

public class Code_7 {

	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        String[] pal= S.split(" ");
        
        for(int i=0;i<pal.length;i++){
        
        	for(int j=pal[i].length()-1;j>=0;j--){
        		
        		System.out.print(pal[i].charAt(j));
        	
        	}
        	if(i<pal.length-1)
        	System.out.print(" ");
        }
    }
}
// || (year % 400 == 0)))