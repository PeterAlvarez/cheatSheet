package Clases_utiles;

import java.nio.ShortBuffer;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Strines {

	public static void main(String[] args) {
		Random k = new Random();
		System.out.println("hola".length());
		String h = "holahhh";

		String j = h.replace('h', 'p');// sustituye caracter
		System.out.println(j);

		String p = "hola_mundo";
		String s = p.substring(0, 4);
		System.out.println(s);

		String cad = "    Hola  ";
		System.out.println(cad.trim());
		
		int m = Math.max( 10 , 3 );
		System.out.println( Math.min( 2 , 4 ) );
		
		System.out.println( k.nextInt());
		
		
		
	}

}
