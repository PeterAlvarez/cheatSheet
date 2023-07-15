package ejercicios_coj;

	import java.util.Scanner;
	
	public class Coj_1028 {
	public static void main(String[] args){
	
		char[] A = new char[101];
		char[] B = new char[101];
		int i  , x ;
		Scanner S = new Scanner(System.in);
		
		while( S.hasNext() ){			
			String a = S.next();
			String b = S.next();
			if(A==null){
				break;
			}
			A = a.toCharArray();
			B = b.toCharArray();
			
			x=0;
			for( i=0 ; i<B.length ; i++ ){
				if(A[x] == B[i]){
					x++;
				}
				if(x==A.length){
					break;
				}
			}
			if(x == A.length){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
		S.close();
	}
	}
