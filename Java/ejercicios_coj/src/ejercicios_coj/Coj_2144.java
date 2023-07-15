package ejercicios_coj;

import java.util.Scanner;
import java.util.Arrays;

public class Coj_2144 {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	int casos = S.nextInt();
	while(casos>0){
		int i , sum=0 ;
		int s = S.nextInt();
		int c = S.nextInt();
		
		String cad = S.next();
		
		int[] vec= new int[s];
		for( i=0 ;i<s ; i++ )
			vec[i] = S.nextInt();
		
		Arrays.sort(vec);
		
		if(cad.equals("regulate")){
			for( i=s-c;i<s;i++)
				sum +=vec[i];
			System.out.println(sum);
		}else{
			for( i=0 ; i<c ; i++ )
				sum +=vec[i];
			System.out.println(sum);	
		}
		casos--;
	}
	S.close();
	
}
}
