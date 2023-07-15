package ejercicios_coj;

import java.util.Scanner;
public class Coj_2175 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	int i , j ;
	int c = S.nextInt();
	while(c>0){
		int num = S.nextInt();

		for(  i=num ; true ; i-- ){
			int pri=0;
			for( j=1;j<=i;j++){
				if(i%j==0){
					pri++;
				if(pri>2)break;
				}
			}
			if(pri==2){
				System.out.print(i);
				break;			
			}
		}
		
		for(  i=num ; true ; i++ ){
			int pri=0;
			for( j=1;j<=i;j++){
				if(i%j==0){
					pri++;
				if(pri>2)break;
				}
			}
			if(pri==2){
				System.out.println(" "+i);
				break;
			
			}
		}
		c--;
	}
	S.close();
}
}
