package ejercicios_coj;

import java.util.*;

public class Coj_1046 {
public static void main(String[] args){
	
	int i , c , a , b ;
	int [] vec = new int[1001];
	
	Scanner S = new Scanner(System.in);
	
	c = S.nextInt();

	for( i=1 ; i<=1000 ; i++ ){
		vec[i] = (i)*(i+1)*(i+2);
		vec[i] = (vec[i]%100 + vec[i-1]%100)%100;
	}
	
	while(c>0){
		a = S.nextInt();
		b = S.nextInt();
	
		System.out.println((vec[b] - vec[a-1]+100)%100);
		c--;
	}
	
	
	S.close();
}
}
