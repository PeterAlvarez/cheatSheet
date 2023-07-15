package ejercicios_coj;

import java.util.*;
public class Coj_2521 {
    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);

        int A , B , C, L ;


        A = S.nextInt();
        B = S.nextInt();
        C = S.nextInt();
        L = S.nextInt();
        if (L==10){
            System.out.println("o".length());
        }


        if( ( A!=B ) && ( A!=C ) ){
            System.out.println("A");
        }else if( ( B!=A ) && ( B!=C ) ){
            System.out.println("B");
        }else if( ( C!=B ) && ( C!=A ) ){
            System.out.println("C");
        }else{
            System.out.println("*");

        }
        S.close();
    }
}
