package Ejercicios;

import java.util.Scanner;

public class Fabula1954 {
	public static void main(String[] args) {
		Scanner tec=new Scanner(System.in);
		String head;
		head=tec.nextLine();
		String [] header;
		header=head.split("&");
		Integer [] width=new Integer[header.length];
		
		for(int i=0;i<header.length;i++){
			width[i]=header[i].length();
		}
		
		for(int i=0;i<header.length;i++){
			System.out.println(header[i]);
		}
		
		for(int i=0;i<width.length;i++){
			System.out.println(width[i]);
		}
		
	}
}
