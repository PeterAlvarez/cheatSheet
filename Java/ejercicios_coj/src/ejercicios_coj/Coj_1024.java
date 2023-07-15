package ejercicios_coj;
import java.util.Scanner;
public class Coj_1024 {
public static void main(String[] args){
	
	Scanner S = new Scanner(System.in);
	
	while(S.hasNext()){
		double car=S.nextDouble();
		int con=0;
		double sum=0;
		if(car==0.00) break;
		
		for( int i=2 ; sum<car ; i++ ){
			con++;
			sum +=1.00/i;
		}
		System.out.println(con+" card(s)");
	}
	
	
	S.close();
}
}
