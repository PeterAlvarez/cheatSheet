package ejercicios_Uri;

import java.util.Scanner;

public class Uri_1066 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int v,par=0,impar=0,neg=0,pos=0;
		for(int i=0;i<5;i++){
			v=S.nextInt();
			if(v>0)	pos++;
			if(v<0) neg++;
			if(v%2==0) par++;
			if(v%2!=0) impar++;
		}
		
		System.out.println(par+" valor(es) par(es)");
		System.out.println(impar +" valor(es) impar(es)");
		System.out.println(pos+" valor(es) positivo(s)");
		System.out.println(neg+" valor(es) negativo(s)");
	}
}
