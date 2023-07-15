package ejercicios_coj;

import java.util.Scanner;
public class Coj_2979 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	
	int c=S.nextInt();
	while(c>0){
		int num = S.nextInt();
		int con=0;
		for(int i=1 ; i<=num ; i++ ){
			int cad = S.nextInt();
			if(cad != i){
				con++;
			}
		}
		System.out.println(con);
	c--;
	}
	
	S.close();
}
}
