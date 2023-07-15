package ejercicios_coj;

import java.util.Scanner;
public class Coj_1662 {
public static void main(String[] args) {
	
	Scanner Lee = new  Scanner(System.in);
	char letra;
	String aux;
	
	int T = Lee.nextByte();
	for (int c=1 ; c<=T ; c++ ) {
	    String cadena = Lee.next();
	    String salida = "";
	    System.out.print("Case " +c+ ": ");
	    letra = cadena.charAt(0);
	    aux = "";
	    for (int  i=1 ; i<cadena.length() ; i++) {
	    	if ( cadena.charAt(i)>='0' && cadena.charAt(i)<='9' )
	    		aux += cadena.charAt(i);
	    else {
	    	for (int j=0 ; j<Integer.parseInt(aux) ; j++)
	    		salida += letra;
	    		letra = cadena.charAt(i);
	    		aux = "";
	    	}
	    }
	    for(int j=0 ; j<Integer.parseInt(aux) ; j++ )
	    	salida += letra;
	    	System.out.println(salida);
		}
 	}
}
