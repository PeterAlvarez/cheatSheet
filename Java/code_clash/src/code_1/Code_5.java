package code_1;
import java.util.Scanner;
import java.util.Arrays;
public class Code_5 {


    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        
        for(int i=0;i<S.length();i++){
        	
        	if(S.charAt(i)>64 && S.charAt(i)<91){
        		int p =S.charAt(i)+32;
        		System.out.print((char) p);
        	}else if(S.charAt(i)>96&&S.charAt(i)<123){
        		int p=S.charAt(i)-32;
        		System.out.print((char) p);
        	}else if (S.charAt(i)==' '){
        		System.out.print(" ");
        	}else{
        		System.out.print(S.charAt(i));
        	}
        	
        	
        	
        }
    }
}
