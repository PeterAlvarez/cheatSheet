package ejercicios_coj;

import java.util.Scanner;

public class Coj_1753 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	
	int c = S.nextInt();
	while(c>0){
		String cad = S.next();
		String num = "";
		String rev = "";
		for(int i=0 ; i<cad.length() ; i++ ){
			char a = cad.charAt(i);			
			if( a=='A' || a == 'B' || a=='C' || a=='a' || a=='b' || a=='c'){
				num =num+""+"2";
			}else if (a=='D' || a=='E' || a=='F' || a=='d' || a=='e' || a=='f'){
				num =num+""+"3";
			}else if (a=='G' || a=='H' || a=='I' || a=='g' || a=='h' || a=='i'){
				num =num+""+"4";
			}else if (a=='J' || a=='K' || a=='L' || a=='j' || a=='k' || a=='l'){
				num =num+""+"5";
			}else if (a=='M' || a=='N' || a=='O' || a=='m' || a=='n' || a=='o'){
				num =num+""+"6";
			}else if (a=='P' || a=='Q' || a=='R' || a=='S' || a=='p' || a=='q' || a=='r' || a=='s'){
				num =num+""+"7";
			}else if (a=='T' || a=='U' || a=='V' || a=='t' || a=='u' || a=='v'){
				num =num+""+"8";
			}else if (a=='W' || a=='X' || a=='Y' || a=='Z' || a=='w' || a=='x' || a=='y' || a=='z'){
				num =num+""+"9";
			}
			//2: ABC, 3: DEF, 4: GHI, 5: JKL, 6: MNO, 7: PQRS, 8: TUV, 9: WXYZ.
		}
		StringBuilder rv = new StringBuilder(num);
		rev = rv.reverse().toString();
		if(num.equals(rev))
			System.out.println("YES");
		else
			System.out.println("NO");
	c--;
	}
	S.close();
}
}
