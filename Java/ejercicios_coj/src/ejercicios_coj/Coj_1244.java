package ejercicios_coj;

import java.util.*;
public class Coj_1244 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	int i , con1 , con2 ;
	char[] cad = new char[10000];
	while( true ){
		String s = S.nextLine();
		cad=s.toCharArray();
	
		if(cad[0]=='*'){
			break;
		}
		
		con1 = 0;
		con2 = 0;
		for( i=0 ; i<cad.length ; i++ ){
			if(cad[i]==' '){
				con1++;
				
				if(cad[0]==cad[i+1] || cad[0]==cad[i+1]+32 || cad[0]==cad[i+1]-32){
					con2++;
				}else{
					break;
				}
			}
		}
		if(con1==con2){
			System.out.println("Y");
		}else{
			System.out.println("N");
		}
	}

}
}
