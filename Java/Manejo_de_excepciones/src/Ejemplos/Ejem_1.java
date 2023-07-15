package Ejemplos;

import java.util.Scanner;
public class Ejem_1 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		while(true){
		
			try{
				int num = S.nextInt();
				System.out.println(num);
			}catch( java.util.InputMismatchException ex){
				System.out.println("error");
			}
		}
	}
}
