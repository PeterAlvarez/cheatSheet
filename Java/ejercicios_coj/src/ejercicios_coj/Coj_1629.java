package ejercicios_coj;

import java.util.*;

public class Coj_1629 {


public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	
	int i , j ;
	char[] A =new char[10001];
	char[] B =new char[10001];

	while( S.hasNext() ){
		String s=S.next();
		A=s.toCharArray();
		
		String p=S.next();
		B=p.toCharArray();
		
		Arrays.sort(A);
		Arrays.sort(B);
		i=0;
		j=0;
		
		while(i!=A.length && j!=B.length){
			
			if(A[i]>B[j]){
				j++;
			}else if( B[j]>A[i] ){
				i++;
			}else if(A[i]==B[j]){
				System.out.print(B[j]);
				i++;
				j++;
			}
		}
		System.out.println();
	}	
}
}
