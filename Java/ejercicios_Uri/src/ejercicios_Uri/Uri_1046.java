package ejercicios_Uri;

import java.util.*;
public class Uri_1046 {
public static void main(String[] args) {
	
	
	Scanner S = new Scanner(System.in);
	
	int hi , hf ;
	
	hi = S.nextInt();
	hf = S.nextInt();
	if(hf>hi){
		System.out.println("O JOGO DUROU "+(hf-hi)+" HORA(S)");
	}else if(hf==hi){
		System.out.println("O JOGO DUROU 24 HORA(S)");
	}else if(hi>hf){
		System.out.println("O JOGO DUROU "+((hf+24)-hi)+" HORA(S)");
	}
	
	
	S.close();
}
}
