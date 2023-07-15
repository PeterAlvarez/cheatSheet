package ejercicios_coj;

import java.lang.reflect.Array;
import java.util.*;

public class Coj_1300 {
public static void main(String[] args){
	
	int[] num = new int[10];
	int i , cont=0 ;
	
	Scanner S = new Scanner(System.in);
	
	for( i=0 ; i<10 ; i++ ){
		num[i] = S.nextInt();
		if(num[i]>=42){
			num[i] = num[i]%42 ;
		}else{
			num[i] = num[i] ;
		}
	}
	Arrays.sort(num);
	
	for( i=0 ; i<9 ; i++ ){
		if(num[i]!=num[i+1])
			cont++;
	}
	System.out.println(cont+1);
	
	S.close();
}
}
