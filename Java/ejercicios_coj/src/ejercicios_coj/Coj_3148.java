package ejercicios_coj;

import java.util.Scanner;
public class Coj_3148 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	
	int casos=S.nextInt();
	while(casos>0){
		String p=S.next();
		
		if(p.charAt(0)=='a'){
			int d = Integer.valueOf(p.charAt(1));
			if(d%2==0) System.out.println("BLACK");
			else System.out.println("WHITE");
		}
		if(p.charAt(0)=='b'){
			int d = Integer.valueOf(p.charAt(1));
			if(d%2==0) System.out.println("WHITE");
			else System.out.println("BLACK");
		}
		if(p.charAt(0)=='c'){
			int d = Integer.valueOf(p.charAt(1));
			if(d%2==0) System.out.println("BLACK");
			else System.out.println("WHITE");
		}
		if(p.charAt(0)=='d'){
			int d = Integer.valueOf(p.charAt(1));
			if(d%2==0) System.out.println("WHITE");
			else System.out.println("BLACK");
		}
		if(p.charAt(0)=='e'){
			int d = Integer.valueOf(p.charAt(1));
			if(d%2==0) System.out.println("BLACK");
			else System.out.println("WHITE");
		}
		if(p.charAt(0)=='f'){
			int d = Integer.valueOf(p.charAt(1));
			if(d%2==0) System.out.println("WHITE");
			else System.out.println("BLACK");
		}
		if(p.charAt(0)=='g'){
			int d = Integer.valueOf(p.charAt(1));
			if(d%2==0) System.out.println("BLACK");
			else System.out.println("WHITE");
		}
		if(p.charAt(0)=='h'){
			int d = Integer.valueOf(p.charAt(1));
			if(d%2==0) System.out.println("WHITE");
			else System.out.println("BLACK");
		}
		casos--;
	}
	S.close();
}
}
