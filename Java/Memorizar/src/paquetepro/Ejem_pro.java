package paquetepro;

import java.util.Arrays;
public class Ejem_pro {
public static void main(String[] args) {
	
	String[] datos = { "9", "3", "2", "4ab", "cd", "5", "6", "7", "8", "9" };
	
	
	for (String item : datos) {
		System.out.println(item);
	}
	
	Arrays.sort(datos);
	System.out.printf("\n");
	for (String item : datos) {
		
		System.out.println(item);
	}
	
}


}
