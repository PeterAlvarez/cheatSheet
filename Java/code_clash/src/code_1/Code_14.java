package code_1;
import java.util.Scanner;
import java.math.*;
import java.util.Arrays;
public class Code_14 {
	  public static void main(String args[]) {
	        Scanner in = new Scanner(System.in);
	        String S = in.nextLine();
	        int co=1;
	        
	       for(int i=0;i<S.length()-1 ;i++){
	    	   
	    	   if(S.charAt(i)==S.charAt(i+1)){
	    		   co++;
		       }else{
		    	   System.out.print(co);
		    	   System.out.print(S.charAt(i));
		    	   co=1;
		       }
	    	
	    	   if(i+2==S.length()){
		    	  if(S.charAt(S.length()-1)==S.charAt(i)){
		    		  System.out.print(co);
		    		  System.out.print(S.charAt(i));
		    	  } else{
		    		  System.out.print(co);
			    	  System.out.println(S.charAt(i+1));
		    	  }
	    	  }
	      }
	      
	       
	  }

}