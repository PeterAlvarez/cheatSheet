package code_1;
import java.util.Scanner;
public class Code_6 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i , k;
        for(i=n+1;i<=130000;i++){
        	int co=0;
        	for(int j=1;j<=i;j++){
        		if(i%j==0) co++;
        		 
        	}
        	if(co==2) {
        		System.out.println(i);
        		break;
        	}
        }
        for(k=n-1;k>0;k--){
        	int co=0;
        	for(int j=1;j<=k;j++){
        		if(k%j==0) co++;
        		 
        	}
        	if(co==2) {
        		System.out.println(k);
        		break;
        	}
        }
        if(i+k/2==n){
        	System.out.println("BALANCED");
        }else if(i+k/2<n){
        	System.out.println("WEAK");
        }else{
        	System.out.println("WEAK");
        }
        
        
        
    }
   
}
