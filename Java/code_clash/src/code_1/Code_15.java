package code_1;

import java.util.Scanner;
import java.math.*;
import java.util.Arrays;
public class Code_15 {


    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String w = in.nextLine();
        int su=0;
        for(int i=0 ;i<w.length();i++){
        	if(w.charAt(i)%2!=0){
        		su+=w.charAt(i);
        	}
        }
        System.out.println(su);
        
    }
}
