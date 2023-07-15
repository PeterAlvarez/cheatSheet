package Ejer_1;

import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		boolean correcto=false;
		while(!correcto){
			try{
				String cad = leerDigitoHexadecimal();
				int num = Integer.parseInt(cad,16);
				System.out.println(cad);
				correcto=true;
				System.out.println(num);
			}catch( Exception e ){
				System.out.println("Ingrese un nuevo dato");
			}
		}
		System.out.println("FIN DE EJECUCION");
	}
	public static String leerDigitoHexadecimal(){
		
		Scanner S = new Scanner(System.in);
		String cad2=S.next().toUpperCase();
		return cad2;
	}
	
}
