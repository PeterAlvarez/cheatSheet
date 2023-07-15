package ejercicios_coj;


import java.util.Scanner;

public class Coj_1840 {
public static void main(String[] args){
	
	char[] a;
	int i , c , b , r , o , k , e , n ;
	
	Scanner S = new Scanner(System.in);
	
	c= S.nextInt();
	while(c>0){
		String s = S.next();
		a = s.toCharArray();
		
		b=0;
		r=0;
		o=0;
		k=0;
		e=0;
		n=0;
		for( i=0 ; i<a.length ; i++ ){
			switch(a[i]){
				case 'B':
					b++; break;
				case 'R': 
					r++; break;
				case 'O':
					o++; break;
				case 'K':
					k++; break;
				case 'E':
					e++; break;
				case 'N':
					n++; break;
			}
		}
		if( b==r && r==o && o==k && k==e && e==n ){
			System.out.println("No Secure");
		}else{
			System.out.println("Secure");
		}
	c--;
	}
	S.close();
}
}