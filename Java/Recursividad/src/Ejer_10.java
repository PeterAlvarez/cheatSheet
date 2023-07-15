//Programar un algoritmo recursivo que determine
//si un número es impar utilizando recursividad cruzada.
import java.util.Scanner;
public class Ejer_10 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int num = S.nextInt();
        if(impar(num)){
            System.out.println("numero impar");
        }else if(par(num)){
            System.out.println("numero par");
        }
        S.close();
    }

    public static boolean par(int numero){
        if(numero==0){
            return true;
        }else{
            return impar(numero-1);
        }

    }

    public static boolean impar(int numero){
        if(numero==0){
            return false;
        }else{
            return par(numero-1);
        }
    }


}
