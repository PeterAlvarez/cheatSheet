package ejercicios_coj;

import java.util.Scanner;
import java.util.Arrays;

public class Coj_1495 {
public static void main(String[] args){
	int c , i ;
	int[] num;
	Scanner S = new Scanner(System.in);
	c = S.nextInt();
	
	num = new int[c];
	
	for( i=0 ; i<c ; i++ ){
		num[i] = S.nextInt();
	}
	Arrays.sort(num);
	
	for( i=c-1 ; i>=0 ; i-- ){
		System.out.println(num[i]);
	}
	
	S.close();
}
}
