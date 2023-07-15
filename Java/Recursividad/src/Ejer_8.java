//Programar un algoritmo recursivo que calcule
//el Maximo comun divisor de dos números.
import java.util.Scanner;
public class Ejer_8 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	int a = S.nextInt();
	int b = S.nextInt();
	
	
	System.out.println(resu(a,b));
	System.out.println(5);
	S.close();
}
//1061

public static int resu(int a , int b){

	
    if(b==0){
    	return a;
    }
    else{
        return resu(b, a % b);
    }
	
	
	
}
}
