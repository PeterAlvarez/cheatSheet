package code_1;
import java.util.Scanner;
import java.math.*;
import java.util.Arrays;
public class Code_11 {
	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int min=0;
        int max=100;
        int aux=0;
        for (int i = 0; i < N; i++) {
        	int num=in.nextInt();
            char A = in.next().charAt(0);
            if(A=='='){
            	System.out.println(num);
            	break;
            }else if(A =='+'){
            	min=num;
            	aux=min+1;
            }else if(A=='-'){
            	max=num;
            	aux=max-1;
            }
        }
        if(aux<=max && aux>=min){
        	System.out.println(aux);
        }else{
        	System.out.println("imposible");
        }
        
	}
}
