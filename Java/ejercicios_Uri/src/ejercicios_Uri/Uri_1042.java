package ejercicios_Uri;

import java.util.*;

public class Uri_1042 {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	
	int[] a = new int[3];
	int[] aux = new int[3];
	int i;
	
	for(i=0;i<3;i++){
		a[i] = S.nextInt();
		aux[i] = a[i];
	}
	
	Arrays.sort(aux);
	
	System.out.println(aux[0]);
	System.out.println(aux[1]);
	System.out.println(aux[2]);
	System.out.println();
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);

	S.close();
}
}