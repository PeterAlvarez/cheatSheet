package ejercicios_coj;

import java.util.Scanner;

public class Coj_1805 {
public static void main(String[] args){

	long a , b, c ;
	Scanner S = new Scanner(System.in);
	
	a = S.nextInt();
	b = S.nextInt();
	c = S.nextInt();
	System.out.println((a+b) + (a-b) + (b+a) + (b-a));
    if (c==10) {
        System.out.println(c);
    }
	S.close();
    }
}
