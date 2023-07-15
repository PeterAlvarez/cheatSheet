package code_1;

import java.util.Scanner;
import java.util.Arrays;
public class Code_2 {

	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String w = in.next();
        String W = w.toUpperCase();
        
        char[] p = new char[W.length()];
        for(int i=0;i<W.length();i++){
        	p[i]=W.charAt(i);
        }
        int cont=1;
        Arrays.sort(p);
        for(int i=0 ; i<p.length-1 ; i++){
        	if(p[i]!=p[i+1]){
        		cont++;
        	}
        }
        System.out.println(cont);
    }
	
}
