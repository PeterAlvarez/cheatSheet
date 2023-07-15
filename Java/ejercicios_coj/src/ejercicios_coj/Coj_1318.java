package ejercicios_coj;

import java.util.Arrays;
import java.util.Scanner;

public class Coj_1318 {
public static void main(String[] args){
	
	String palabra;
	int  i ;
	int[] num;
	num = new int[3];
	Scanner S = new Scanner(System.in);
	
	for( i=0 ; i<3 ; i++ ){
		num[i] = S.nextInt();
	}
	Arrays.sort(num);
	
	palabra = S.next();
	
	if(palabra.equals("ABC")){
		System.out.println(+num[0]+" "+num[1]+" "+num[2]);
	}else if(palabra.equals("ACB")){
		System.out.println(+num[0]+" "+num[2]+" "+num[1]);
	}else if(palabra.equals("BAC")){
		System.out.println(+num[1]+" "+num[0]+" "+num[2]);
	}else if(palabra.equals("BCA")){
		System.out.println(+num[1]+" "+num[2]+" "+num[0]);
	}else if(palabra.equals("CAB")){
		System.out.println(+num[2]+" "+num[0]+" "+num[1]);
	}else{
		System.out.println(+num[2]+" "+num[1]+" "+num[0]);
	}
	
	S.close();
	
}
}
