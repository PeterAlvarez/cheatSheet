package ejercicios_coj;
import java.util.Scanner;

public class Coj_1212 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	
	char[] cad = new char[2000];
	while(S.hasNext()){
		String s=S.next();
		cad=s.toCharArray();
		
		if(cad[0]=='*') break;
		
		double sum = 0;
		int con=0;
		for( int i=1 ; i<cad.length ; i++ ){
			if(cad[i]!='/'){
				if( cad[i] == 'W' ){
					sum += 1;
				}else if( cad[i] == 'H' ){
					sum += ( 0.5 );
				}else if( cad[i] == 'Q' ){
					sum += ( 0.25 );
				}else if( cad[i] == 'E' ){
					sum += ( 0.125 );
				}else if( cad[i] == 'S' ){
					sum += ( 0.0625 );
				}else if( cad[i] == 'T' ){
					sum += ( 0.03125 );
				}else if( cad[i] == 'X' ){
					sum += ( 0.015625 );
				}
			}else{
				
				if(sum==1)
					con++;
				
					sum=0;
			}	
		}
		System.out.println(con);
	}
	S.close();
}
}
