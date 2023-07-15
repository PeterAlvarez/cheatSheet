package ejercicios_coj;
import java.math.BigInteger;
import java.util.Scanner;
public class Coj_2570 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	
	while(S.hasNext()){
		String num = S.nextLine();
		BigInteger num1=new BigInteger(num);
	
		StringBuilder builder=new StringBuilder(num);
		String inver = builder.reverse().toString();
		
		BigInteger num2= new BigInteger(inver);
		
		if(num2.compareTo(num1)>0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
	S.close();
}
}//invertir una cadena
