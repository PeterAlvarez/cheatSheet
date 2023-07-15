package ejercicios_Uri;
import java.util.*;

public class Uri_1020 {
public static void main(String[] args){
	
	Scanner S = new Scanner(System.in);
	
	int edad, año , mes ;
	
	edad = S.nextInt();
	
	año = edad/365;
	edad %= 365;
	mes = edad/30;
	edad %=30;
	
	System.out.println(año+" ano(s)");
	System.out.println(mes+" mes(es)");
	System.out.println(edad+" dia(s)");
	
	S.close();
}
}