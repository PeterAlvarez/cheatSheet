package ejercicios_coj;

import java.lang.reflect.Array;
import java.util.*;

public class Coj_2145 {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	
	int c , i , suma , k ;
	int[] j = new int[10];
	
	c = S.nextInt();
	for( k=1 ; k<=c ; k++ ){
		suma=0;
		for( i=0 ; i<10 ; i++ ){
			j[i] = S.nextInt();
		}
		Arrays.sort(j);
		for(i=1;i<9;i++){
			suma +=j[i];
		}
		System.out.println(k+" "+suma);
	}
	S.close();
}
}
