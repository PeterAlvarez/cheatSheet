package ejercicios_Uri;
import java.util.*;

public class Uri_1060 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        double[] num = new double[6];
        int i , cont=0 ;
        for( i=0 ; i<6 ; i++ ){
            num[i]=S.nextDouble();
            if( num[i]>0 ){
                cont++;
            }
        }
        System.out.println(cont+" valores positivos");
        S.close();
    }
}


