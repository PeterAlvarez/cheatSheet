package ejercicios_coj;

import java.util.*;
public class Coj_1626 {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	
	int a , b , num1=0 , c ;
	c=S.nextInt();
	while(c>0){
		a = S.nextInt();
		b = S.nextInt();
		num1 = invertir(a) + invertir(b);
		System.out.println(invertir(num1));
	c--;
	}
	S.close();
	}

public static int invertir(int num){
	
	int resto , num2=0 ;
	
	while(num>0){
		resto = num%10;
		num=num/10;
		num2 =(num2*10) + resto;
	}
	return num2;
}
}
