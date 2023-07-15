package ejercicios_coj;

import java.util.Scanner;

public class Coj_2948 {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	int c=S.nextInt();
	while( c>0 ){
		String cad=S.next();
		
		while( true ){
			
			int sum=0;
			for(int i=0 ; i<cad.length() ; i++ ){
				sum += Integer.parseInt(String.valueOf(cad.charAt(i)));
			}
			if(sum>9){
				String cad2 = String.valueOf(sum);
				cad=cad2;
			}else{
				System.out.println(sum);
				break;
			}
		}
	c--;
	}
	S.close();
}
}









