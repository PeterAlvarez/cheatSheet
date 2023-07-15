
import java.util.Scanner;

public class Coj_1001 {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);

        int edad = S.nextInt();
        if (edad >= 18) {
            System.out.print("Es mayor");
        } else {
            System.out.println("no es mayor");
        }
    }
}



