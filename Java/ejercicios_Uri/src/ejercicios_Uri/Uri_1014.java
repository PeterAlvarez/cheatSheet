package ejercicios_Uri;

import java.text.*;
import java.util.*;

public class Uri_1014 {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        double k , g ;
        k = S.nextDouble();
        g = S.nextDouble();

        System.out.println(df.format(k/g)+" km/l");

        S.close();

    }
}
