package code_1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Code_9 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n=S.nextInt();
		
		String[] vec=new String[n];
		for( int i=0 ; i<n ; i++ ){
			vec[i]=S.next();
		}
		int n2=S.nextInt();
		int[] nu = new int[n2];
		for(int i=0;i<n2;i++){
			nu[i]=S.nextInt();
		}
		for( int i=0 ; i<vec.length; i++ ){
			System.out.print(vec[i]);
			for( int j=0 ; j<nu.length ; j++ ){
				if(n-nu[j]<=i){
					System.out.print("#");
				}else{
					System.out.print(".");
				}
			}
			System.out.println();	
		}
	}
}
/*
6
..#...
#.##..
#####.
#####.
######
######
 */
