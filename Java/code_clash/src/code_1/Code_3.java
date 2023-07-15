package code_1;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.util.*;
public class Code_3 {


	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        String cad="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int j=0;
        for(int i=0;i<S.length();i++){
        	boolean p=false;
        	for( j=0;j<cad.length();j++){
        		if(S.charAt(i)==cad.charAt(j)){
        			p=true;
        			break;
        		}
        	}
        	if(p==true){
        		System.out.print(cad.charAt(j));
        	}
        	
        }
        
    }
}
